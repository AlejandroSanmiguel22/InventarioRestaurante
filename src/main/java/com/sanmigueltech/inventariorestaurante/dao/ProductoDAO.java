package com.sanmigueltech.inventariorestaurante.dao;

import com.sanmigueltech.inventariorestaurante.Model.producto.Producto;
import com.sanmigueltech.inventariorestaurante.Model.producto.ProductoSolido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private Connection conSQL;

    public ProductoDAO(Connection con){
        this.conSQL = con;
    }

    public void guardarProducto(Producto prod){
        try{
            PreparedStatement stmt;
            stmt = conSQL.prepareStatement("insert into Producto " +
                    "(id, nombre, descripcion, cantidadNeto, precio, fabricante, categoria, tieneFechaCaducidad, fechaCaducidad)" +
                    "values (?,?,?,?,?,?,?,?,?)");
            try(stmt){
                stmt.setString(1, prod.getIdProducto());
                stmt.setString(2, prod.getNombreProducto());
                stmt.setString(3, prod.getDescripcion());
                stmt.setInt(4, prod.getCantidadNeto());
                stmt.setDouble(5, prod.getPrecio());
                stmt.setString(6, null);
                stmt.setString(7, prod.getCategoria().getNombre());
                stmt.setBoolean(8, prod.isTieneFechaCaducidad());
                stmt.setDate(9, prod.getFechaCaducidad());

                stmt.execute();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Producto insertado");
    }

    public List<Producto> listar() {
        List<Producto> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = conSQL
                    .prepareStatement("SELECT [id]\n" +
                            "      ,[nombre]\n" +
                            "      ,[descripcion]\n" +
                            "      ,[cantidadNeto]\n" +
                            "      ,[precio]\n" +
                            "      ,[fabricante]\n" +
                            "      ,[categoria]\n" +
                            "      ,[tieneFechaCaducidad]\n" +
                            "      ,[fechaCaducidad]\n" +
                            "  FROM [Inventario].[dbo].[Producto]");

            try (statement) {
                statement.execute();

                final ResultSet resultSet = statement.getResultSet();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new ProductoSolido(resultSet.getString("id"),
                                resultSet.getString("nombre"),
                                resultSet.getString("descripcion"),
                                resultSet.getInt("cantidadNeto"),
                                resultSet.getDouble("precio"),
                                null,
                                null,
                                resultSet.getBoolean("tieneFechaCaducidad"),
                                resultSet.getDate("fechaCaducidad")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }

    public void eliminarProducto(String idProducto){
        try {
            final PreparedStatement statement = conSQL.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");

            try (statement) {
                statement.setString(1, idProducto);
                statement.execute();
                System.out.println("Se elimino el producto");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Producto obtenerProductoId(String id){
        Producto producto = null;
        try{
           final PreparedStatement statement = conSQL.prepareStatement("SELECT id, " +
                   "nombre, " +
                   "descripcion, " +
                   "cantidadNeto, " +
                   "precio, " +
                   "fabricante, " +
                   "categoria, " +
                   "tieneFechaCaducidad, " +
                   "fechaCaducidad FROM Producto " +
                   "WHERE id = ?");
           try(statement){
               statement.setString(1, id);
               statement.execute();
               final ResultSet rs = statement.getResultSet();
               if (rs.next()) {
                   producto = new ProductoSolido(
                           rs.getString("id"),
                           rs.getString("nombre"),
                           rs.getString("descripcion"),
                           rs.getInt("cantidadNeto"),
                           rs.getDouble("precio"),
                           null,
                           null,
                           rs.getBoolean("tieneFechaCaducidad"),
                           rs.getDate("fechaCaducidad")
                   );
               }
           }
        }catch (SQLException e) {
            System.out.println(e);
        }

        return producto;
    }
}
