package com.app.ioc;

/*Esta clase implementa la interfaz ServicioNotificacion, 
proporcionando el método insertaUsuario y eliminaUsuarioByID */

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Mongo");

	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando usario en Mongo : "+ id);

	}

}
