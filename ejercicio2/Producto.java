package ejercicio2;
    

public class Producto {
    private String nombre;
    private Double precioUnitario;

    //Constructor
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
    public Double getPrecioUnitario(){
        return this.precioUnitario;
    }
    public void setPrecioUnitario(Double price){
        this.precioUnitario = price;
    }
}