package ejercicio3;

public class EmpleadoAsalariado extends Empleado {
    // Atributos
    Float salarioMensualFijo;
    public EmpleadoAsalariado(String nombre, String apellidos, float salarioMensualFijo){
        super (nombre, apellidos, null);
        this.salarioMensualFijo = salarioMensualFijo;
    }
    public String tipo(){
        return "Empleado Asalariado";
    }
}
