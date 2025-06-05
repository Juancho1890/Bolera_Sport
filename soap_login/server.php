<?php

// Habilita la visualización de todos los errores de PHP (útil para depuración durante el desarrollo)
error_reporting(E_ALL);
ini_set('display_errors', 1);

// Arreglo asociativo que simula una base de datos de usuarios con sus contraseñas
$users = [
    'admin' => '1234',
    'juan' => 'abcd',
];

// Función que realiza la validación del login
function login($username, $password) {
    global $users; // Accede a la variable global $users
     // Verifica si el usuario existe y si la contraseña coincide
    if (isset($users[$username]) && $users[$username] === $password) {
        return "Login exitoso para usuario $username"; // Mensaje de éxito
    } else {
        return "Login fallido"; // Mensaje de error
    }
}

// Configuración de opciones del servidor SOAP (usando un URI interno)
$options = ['uri' => 'urn:LoginService'];

// Crea una instancia del servidor SOAP sin WSDL (modo non-WSDL)
$server = new SoapServer(null, $options);

// Registra la función 'login' para que pueda ser llamada como operación SOAP
$server->addFunction('login');

// Procesa las peticiones SOAP entrantes
$server->handle();
