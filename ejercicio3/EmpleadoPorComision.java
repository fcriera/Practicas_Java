package ejercicio3;

public class EmpleadoPorComision extends Empleado {
    // Atributos
    Float porcentajeComision;
    
    //Contructor extendido de clase Empleado más el atributo porcentajeComision
    public EmpleadoPorComision(String nombre, String apellidos, Float porcentajeComision){
        super(nombre, apellidos, null);
        this.porcentajeComision = porcentajeComision;
        
    }
    //
    public String tipo(){
        return "Empleado a Comisión";
    }
    /*
    @Override
    public float calcularSalario(){
      return  totalVentas * (porcentajeComision / 100);
    }
    */
}
