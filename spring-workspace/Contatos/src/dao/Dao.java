package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static String status = "STATUS ---> Desconectado...";

	public static Connection getConexao() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		Connection cnx = null;
		
		try {
			Class.forName(driverName);

			String serverName = "localhost:3306";
			String dataBase = "fullstackdb";
			String user = "root";
			String password = "";
			
			String url = "jdbc:mysql://" +  serverName + "/" + dataBase;
			
			cnx = DriverManager.getConnection(url, user, password);
			
			if(cnx != null) {
				status = "STATUS ---> Conectado com sucesso!";
			} else {
				status = "STATUS ---> Não foi possível realizar a conexão";
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnx;
	}
	
	public static String getStatus() {
		return status;
	}
}
