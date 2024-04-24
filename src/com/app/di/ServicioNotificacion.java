package com.app.di;

//Esta interfaz obliga a cualquier clase que la implemente, proporcionar
//un método enviarNotificacion

public interface ServicioNotificacion {

	
    void enviarNotificacion(String mensaje);

}
