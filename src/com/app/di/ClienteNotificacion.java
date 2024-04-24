package com.app.di;

// El servicio de notificación se inyecta a través del constructor, 
//permitiendo que diferentes implementaciones de servicios de notificación 
//sean utilizadas sin cambiar el código de esta clase.

public class ClienteNotificacion {

	private ServicioNotificacion servicioNotificacion;

    public ClienteNotificacion(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    public void enviarNotificacion(String mensaje) {
        servicioNotificacion.enviarNotificacion(mensaje);
    }
	
}
