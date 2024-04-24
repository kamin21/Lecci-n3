package com.app.di;

//Esta clase implementa la interfaz ServicioNotificacion, 
//proporcionando el método enviarNotificacion

public class ServicioNotificacionSMS implements ServicioNotificacion {

	@Override
	public void enviarNotificacion(String mensaje) {
		System.out.println("Enviando notificación por SMS: " + mensaje);

	}

}
