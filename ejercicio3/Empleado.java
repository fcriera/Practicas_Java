package ejercicio3;

public class Empleado {
    // Atributos
    String nombre;
    String apellidos;
    Float tarifaPorHora;
    
    //Constructor 
    public Empleado(String nombre, String apellidos, Float tarifaPorHora){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarifaPorHora = tarifaPorHora;
        
    }
    // Método que muestra el nombre completo: nombre + apellido
    public String nombreCompleto(){
        return "Nombre: " + this.nombre + " " + this.apellidos; 
    }
    // Método que muestra el Empleado Normal 
    public String tipo(){
        return "Empleado Normal";
    }
    /* 
    public float calcularSalario(){
        return horasTrabajadas * tarifaPorHora;
    }
    public void setHorasTrabajadas(int horas) {
        horasTrabajadas = horas;
    */
}
