package com.app.ioc;

//Esta interfaz obliga a cualquier clase que la implemente, proporcionar
//un método insertaUsuario y eliminaUsuarioByID

public interface IUsuario {

	public void insertaUsuario();
	public void eliminaUsuarioByID(int id);
	
}
