
package com.sinfloo.config;

import java.sql.Connection;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/laheladeriaquenoesdeturquia";
    String user="";
    String pass="";
    public Connection getConnection(){
        /* try {
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url,user,pass);
        }catch (Exception e) {
        }
           return con;
    }
    */
}
