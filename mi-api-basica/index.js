const express = require('express');
const app = express();
const port = 3000;

app.use(express.json()); // Permite recibir JSON

// Ruta GET
app.get('/', (req, res) => {
  res.send('¡Hola mundo desde mi API!');
});

// Ruta POST
app.post('/saludo', (req, res) => {
  const nombre = req.body.nombre;
  res.send(`¡Hola, ${nombre}!`);
});

// Ruta PUT
app.put('/usuario/:id', (req, res) => {
  const id = req.params.id;
  const datos = req.body;
  res.send(`Usuario ${id} actualizado con: ${JSON.stringify(datos)}`);
});

// Ruta DELETE
app.delete('/usuario/:id', (req, res) => {
  const id = req.params.id;
  res.send(`Usuario ${id} eliminado`);
});

// Iniciar servidor
app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});


