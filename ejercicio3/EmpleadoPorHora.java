package ejercicio3;

public class EmpleadoPorHora extends Empleado{
    // Atributos 
    float tarifaHorasExtra;
    // Constructor que tiene de herencia los atributos de la clase Empleado
    public EmpleadoPorHora(String nombre, String apellidos, float tarifaPorHora, float tarifaHorasExtra){
        super(nombre, apellidos, tarifaPorHora);
        this.tarifaHorasExtra = tarifaHorasExtra;
    }
    // Método que devuelve el tipo de Empleado
    public String tipo(){
        return "Empleado por horas";
    }
}
