package ejercicio2;

import java.util.ArrayList;

public class CuentaSupermercado {
    private ArrayList<Producto> cuenta = new ArrayList<>();

    // Constructor
    public CuentaSupermercado(){  
    }

    public float precioTotal(){
        int aux = 0;
        for (int i = 0; i < cuenta.size(); i++){
            aux += cuenta.get(i).getPrecioUnitario();
        }
        return aux;
    }
}
