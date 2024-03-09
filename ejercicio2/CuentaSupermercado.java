package ejercicio2;

import java.util.ArrayList;

public class CuentaSupermercado {
    private ArrayList<Producto> cuenta = new ArrayList<Producto>();

    // Constructor
    public CuentaSupermercado(){  
    }

    public void agregarProducto(Producto producto){
        if (this.cuenta.contains(producto)){
            //this.cuenta.get(this.cuenta.indexOf(producto)).setCantidad(this.cuenta.get(this.cuenta.indexOf(producto)));
            producto.setCantidad(producto.getCantidad()+1);
        }
    }

    public Double precioTotal(){
        Double aux = 0.0;
        for (int i = 0; i < cuenta.size(); i++){
            aux += cuenta.get(i).getPrecioUnitario();
        }
        return aux;
    }
}
