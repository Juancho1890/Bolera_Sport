import React, { useState } from 'react';
import { createReservation } from '../services/reservationService';

const ReservationForm = () => {
  const [formData, setFormData] = useState({
    nombre: '',
    fecha: '',
    hora: '',
    pista: '',
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    await createReservation(formData);
    alert('Reserva registrada con éxito');
  };

  return (
    <form onSubmit={handleSubmit}>
      <input name="nombre" type="text" placeholder="Nombre" onChange={handleChange} required />
      <input name="fecha" type="date" onChange={handleChange} required />
      <input name="hora" type="time" onChange={handleChange} required />
      <input name="pista" type="text" placeholder="Pista" onChange={handleChange} required />
      <button type="submit">Reservar</button>
    </form>
  );
};

export default ReservationForm;
