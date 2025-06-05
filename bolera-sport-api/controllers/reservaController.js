const db = require('../models/db');

exports.obtenerReservas = (req, res) => {
  db.query('SELECT * FROM reservas', (err, results) => {
    if (err) return res.status(500).json({ error: err });
    res.json(results);
  });
};

exports.crearReserva = (req, res) => {
  const { cliente_id, pista_id, fecha, hora } = req.body;
  db.query(
    'INSERT INTO reservas (cliente_id, pista_id, fecha, hora) VALUES (?, ?, ?, ?)',
    [cliente_id, pista_id, fecha, hora],
    (err, result) => {
      if (err) return res.status(500).json({ error: err });
      res.json({ message: 'Reserva creada con éxito', id: result.insertId });
    }
  );
};
