package com.app.ioc;

/*Esta clase implementa la interfaz ServicioNotificacion, 
proporcionando el método insertaUsuario y eliminaUsuarioByID */

public class UsuarioImplOracle implements IUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario con Oracle");
		
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando usario con Oracle : "+ id);
		
	}
	
	

}
