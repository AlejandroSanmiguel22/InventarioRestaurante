package com.sanmigueltech.inventariorestaurante.factory;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionRefactory {
    private DataSource dataSource;
    public ConnectionRefactory(){
        var poolSource = new ComboPooledDataSource();
        poolSource.setJdbcUrl("jdbc:sqlserver://localhost\\SQLSERVERLEARN;databaseName=Inventario;" +
                "trustServerCertificate=true;" +
                "encrypt=false;");
        poolSource.setUser("sa");
        poolSource.setPassword("fYf2ZFTrPS");
        poolSource.setMaxPoolSize(12);
        this.dataSource = poolSource;
    }
    public Connection recueperarConexionDB() throws SQLException {
        return this.dataSource.getConnection();
    }
}
