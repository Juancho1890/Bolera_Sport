import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div>
      <h1>Bienvenido a Bolera Sport</h1>
      <Link to="/reservas">Ir a Reservas</Link>
    </div>
  );
};

export default Home;
