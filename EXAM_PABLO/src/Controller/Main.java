package Controller;

import Views.General;
import Model.ConexionDB;
public class Main {

	public static void main(String[] args) {
		ConexionDB.getInstance();
		General ventanaGeneral=new General();
		ventanaGeneral.setVisible(true);

	}

}
