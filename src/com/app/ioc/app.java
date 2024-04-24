package com.app.ioc;

/*En esta clase se aplica la IoC, porque el control sobre qué implementación de IUsuario 
 se utiliza se invierte del método main a la clase que crea instancias (UsuarioFactory).
 */

public class app {

	public static void main(String[] args) {
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplOracle());
		obj.getInsertaUsuario();
		obj.getEliminaUsuarioByID(1);

	}

}
