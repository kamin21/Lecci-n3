package com.app.ioc;

/*Esta clase representa un ejemplo de inversión de control. 
Toma un objeto IUsuario como parámetro en su constructor, 
lo que permite que la implementación concreta de IUsuario sea 
pasada desde fuera de la clase (UsuarioImplOracle o UsuarioImplMongo).
La UsuarioFactory no necesita conocer los detalles de implementación de IUsuario, 
ya que se le proporciona desde fuera.*/

public class UsuarioFactory {

	IUsuario usr;
	
		public UsuarioFactory(IUsuario usr) {
			this.usr=usr;
		}
		
		public void getInsertaUsuario() {
			usr.insertaUsuario();
		}
		
		public void getEliminaUsuarioByID(int id) {
			usr.eliminaUsuarioByID(id);
		}
}
