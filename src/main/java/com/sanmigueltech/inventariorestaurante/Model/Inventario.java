package com.sanmigueltech.inventariorestaurante.Model;

import com.sanmigueltech.inventariorestaurante.Model.producto.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {

    private String idAlmacen;
    private List<Producto> ListaProducto;


    public Inventario() {
    }

    public Inventario(String idAlmacen, List<Producto> listaProducto) {
        this.idAlmacen = idAlmacen;
        ListaProducto = listaProducto;

    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public List<Producto> getListaProducto() {
        return ListaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        ListaProducto = listaProducto;
    }


    public void agregarProducto(Producto producto){

        ListaProducto = new ArrayList<>();
        ListaProducto.add(producto);

    }

    public  void eliminarProducto(String idProducto, Producto producto){

        ListaProducto = new ArrayList<>();
        Producto objProducto = new Producto();
        if (idProducto.equals(objProducto.getIdProducto())) {
            ListaProducto.remove(producto);
        }
    }

    public  void modificarProducto(String idProducto, Producto producto, int opc){

        ListaProducto = new ArrayList<>();
        Producto objProducto = new Producto();
        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i< ListaProducto.size() ; i++){
            if(idProducto.equals(objProducto.getIdProducto())){
                switch (opc){
                    case 1:
                        String nombre;
                        nombre = sc.next();
                        objProducto.setNombreProducto(nombre);
                    case 2:
                        int cantidadNeto;
                        cantidadNeto = sc.nextInt();
                        objProducto.setCantidadNeto(cantidadNeto);
                    case 3:
                        double precio;
                        precio = sc.nextDouble();
                        objProducto.setPrecio(precio);
                }
            }
            break;
        }
    }

    public List<Producto> buscarProductoId(String id, Producto producto ){

        ListaProducto = new ArrayList<>();
        Producto objProducto = new Producto();

        for(int i = 0; i< ListaProducto.size() ; i++){
            if(id.equals(producto.getIdProducto())){
//                System.out.println(producto.obtenerDetalles());
            }
            break;
        }
        return ListaProducto;
    }

    public List<Producto> buscarPorPrecio(double precio, Producto producto){

        ListaProducto = new ArrayList<>();
        Producto objProducto = new Producto();

        for(int i = 0; i< ListaProducto.size() ; i++){
            if(precio == producto.getPrecio()){
 //               System.out.println(producto.obtenerDetalles());
            }
            break;
        }
        return ListaProducto;
    }

    public List<Producto> buscarPorCategoria(String categoria, Producto producto){

        ListaProducto = new ArrayList<>();
        Producto objProducto = new Producto();

        for(int i = 0; i< ListaProducto.size() ; i++){
            if(categoria.equals(producto.getCategoria().getNombre())){
   //             System.out.println(producto.obtenerDetalles());
            }
            break;
        }

        return ListaProducto;
    }
}
