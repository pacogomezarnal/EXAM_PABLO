package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatosCadete {
	
	private Connection conexion=null;
	private Statement sql = null;
	private ResultSet resultados = null;
	
	private String SQL1="select * from cadetes where id=";
	private String SQL2="select * from cadetes where equipo=";
	private String SQL3="select * from cadetes where nombre=";
	
	public DatosCadete(){
		ConexionDB.getInstance();
		conexion=ConexionDB.getConexion();
	}
	public Cadete getCadete(String ID){
		Cadete objCadete=null;
		//creo arrayList para almacenar resultado de la consulta
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery(SQL1+ID);
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			while( resultados.next() ) {
				objCadete=new Cadete(
						resultados.getInt("id"),
						resultados.getString("nombre"),
						resultados.getString("apellidos"),
						resultados.getInt("edad"),
						resultados.getString("nacionalidad"),
						resultados.getInt("equipo"));
			}
			
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				sql.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return objCadete;
	}
	public ArrayList<String> getEquipo(String equipo){
		ArrayList<String> equipos=new ArrayList<String>();
		//creo arrayList para almacenar resultado de la consulta
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery(SQL2+equipo);
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			while( resultados.next() ) {
				equipos.add(resultados.getString("nombre"));
			}
			
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				sql.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return equipos;
	}
	public Cadete getOtroCadete(String Nombre){
		Cadete objCadete=null;
		//creo arrayList para almacenar resultado de la consulta
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery(SQL3+"'"+Nombre+"'");
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			while( resultados.next() ) {
				objCadete=new Cadete(
						resultados.getInt("id"),
						resultados.getString("nombre"),
						resultados.getString("apellidos"),
						resultados.getInt("edad"),
						resultados.getString("nacionalidad"),
						resultados.getInt("equipo"));
			}
			
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				sql.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return objCadete;
	}
}
