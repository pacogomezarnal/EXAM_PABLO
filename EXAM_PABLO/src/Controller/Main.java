package Controller;

import Views.General;
import Model.ConexionDB;
public class Main {

	public static void main(String[] args) {
		ConexionDB conexion=ConexionDB.getInstance();
		conexion.connectDB();
		General ventanaGeneral=new General();
		ventanaGeneral.setVisible(true);

	}

}
