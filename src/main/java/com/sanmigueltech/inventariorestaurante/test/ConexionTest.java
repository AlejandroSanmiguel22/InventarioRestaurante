package com.sanmigueltech.inventariorestaurante.test;

import com.sanmigueltech.inventariorestaurante.factory.ConnectionRefactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionTest {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionRefactory().recueperarConexionDB();
        ConnectionRefactory con1 = new ConnectionRefactory();
        System.out.println("Conexion Exictosa");
        /*
        Connection contest;
        for (int i =  1; i <=20; i++) {
            contest = con1.recueperarConexionDB();
            System.out.println("Con " + i);
        }*/
        System.out.println("Cerrando conexion");
       // contest.close();
        con.close();
    }

}
