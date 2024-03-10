package ejercicio2;

import java.util.ArrayList;

public class CuentaSupermercado {
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;
    
    // Constructor
    public CuentaSupermercado(){
        this.productos = new ArrayList<Producto>();
        this.cantidades = new ArrayList<Integer>();
    }

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

    public Double precioTotal(){
        Double aux = 0.0;
        for (int i = 0; i < this.productos.size(); i++){
            aux += (this.productos.get(i).getPrecioUnitario() * this.cantidades.get(i));
        }
        return aux;
    }

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

    private String imprimirLinea(String texto1, String texto2, String texto3, String texto4) {
        int espaciosBlancosTexto1 = 20 - texto1.length();
        int espaciosBlancosTexto2 = 10 - texto2.length();
        int espaciosBlancosTexto3 = 7 - texto3.length();
        int espaciosBlancosTexto4 = 7 - texto4.length();
        
        return String.format("%s%s %s%s %s%s %s%s%n", texto1, " ".repeat(espaciosBlancosTexto1), " ".repeat(espaciosBlancosTexto2), texto2, " ".repeat(espaciosBlancosTexto3), texto3, " ".repeat(espaciosBlancosTexto4), texto4);
    }
}