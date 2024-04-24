package com.app.di;

//Esta clase representa la inyección de dependencias, 
//donde las dependencias (en este caso, el servicio de notificación) 
//se proporcionan a las clases que las necesitan en lugar
//de ser creadas internamente por esas clases.

public class App {

	public static void main(String[] args) {
		ServicioNotificacion servicioEmail = new ServicioNotificacionEmail();
        ClienteNotificacion clienteConEmail = new ClienteNotificacion(servicioEmail);
        clienteConEmail.enviarNotificacion("Hola, este es un mensaje de prueba por correo electrónico");

        ServicioNotificacion servicioSMS = new ServicioNotificacionSMS();
        ClienteNotificacion clienteConSMS = new ClienteNotificacion(servicioSMS);
        clienteConSMS.enviarNotificacion("Hola, este es un mensaje de prueba por SMS");

	}

}
