package ejercicio2;

import java.util.ArrayList;

public class CuentaSupermercado {
    // Atributos
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;
    
    // Constructor
    public CuentaSupermercado(){
        this.productos = new ArrayList<Producto>();
        this.cantidades = new ArrayList<Integer>();
    }
    /*  Método para agregar producto, y si es un producto repetido aumenta la cuenta. Se usan dos arrayList. 
    uno que se crea según la Clase producto con sus atributos y otro que guarda la cantidad de productos. 
    Se hace el programa de tal manera que los índices de ambas arrayLists sean iguales; es decir si ingreso
    dos productos de leche y uno de jabón quedarían:
    arrayList productos [{leche,0.7};{jabón,1}], y un array cantidades [{2,1}]
    Se crea de esta manera para que las cantidades no queden guardadas en la instancia Productos, que luego
    si quiero crear una nueva lista, me cuente otra vez desde 0 las cantidades.
    */
    public void agregarProducto(Producto producto) {
        int index = this.productos.indexOf(producto);
        if (index == -1) {
            this.productos.add(producto);
            this.cantidades.add(1);
        } else {
            int cantidadPrevia = this.cantidades.get(index);
            this.cantidades.set(index, cantidadPrevia + 1);
        }
    }
    // Calcula el valor del precio total, es decir la sumatoria de los precios unitarios * las cantidades
    public Double precioTotal(){
        Double aux = 0.0;
        for (int i = 0; i < this.productos.size(); i++){
            aux += (this.productos.get(i).getPrecioUnitario() * this.cantidades.get(i));
        }
        return aux;
    }
    // Se muestran los productos, cantidad, su precio unitario, su precio total y el precio total en un formato establecido 
    public String mostrarCuenta() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Ticket%n"));
        String cabecera = this.imprimirLinea("Producto", "Unidades", "PU", "Total");
        sb.append(cabecera);
        sb.append(String.format("-".repeat(cabecera.length()-1) + "%n"));
        for (int i = 0; i< this.productos.size(); i++){
            Integer unidades = this.cantidades.get(i);
            Double precioUnitario = this.productos.get(i).getPrecioUnitario();
            Double totalProducto = unidades * precioUnitario;
            sb.append(this.imprimirLinea(this.productos.get(i).getNombre(), unidades.toString(), precioUnitario.toString(), totalProducto.toString()));
        }
        sb.append(String.format("-".repeat(cabecera.length()-1) + "%n"));
        sb.append(this.imprimirLinea("Total", "", "", this.precioTotal().toString()));
        return sb.toString();
    }
    // método de apoyo para crear el método mostrar cuenta, donde se ajustan los espacios en blanco
    private String imprimirLinea(String texto1, String texto2, String texto3, String texto4) {
        int espaciosBlancosTexto1 = 20 - texto1.length();
        int espaciosBlancosTexto2 = 10 - texto2.length();
        int espaciosBlancosTexto3 = 7 - texto3.length();
        int espaciosBlancosTexto4 = 7 - texto4.length();
        
        return String.format("%s%s %s%s %s%s %s%s%n", texto1, " ".repeat(espaciosBlancosTexto1), " ".repeat(espaciosBlancosTexto2), texto2, " ".repeat(espaciosBlancosTexto3), texto3, " ".repeat(espaciosBlancosTexto4), texto4);
    }
}