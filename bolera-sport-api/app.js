const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const reservaRoutes = require('./routes/reservaRoutes');

const app = express();
app.use(cors());
app.use(bodyParser.json());

app.use('/api/reservas', reservaRoutes);

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
