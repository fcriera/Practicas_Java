package ejercicio2;
    

public class Producto {
    private String nombre;
    private Double precioUnitario;

    public Producto(String nombre, Double precioUnitario){
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nam){
        this.nombre = nam;
    }
    public double getPrecioUnitario(){
        return this.precioUnitario;
    }
    public void setPrecioUnitario(double price){
        this.precioUnitario = price;
    }
}
