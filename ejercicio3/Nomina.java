package ejercicio3;

public class Nomina {
    //Atributos
    Empleado empleado;
    Integer horasTrabajadas;
    Integer horasExtras;
    Float ventasTotales;

    //Constructor
    public Nomina(){
    }

    public Float salarioTotal(){
        
        if (this.empleado.tipo().equals("Empleado por horas")){
            EmpleadoPorHora empleadoHora = (EmpleadoPorHora) this.empleado;
            return (this.empleado.tarifaPorHora * this.horasTrabajadas) + empleadoHora.tarifaHorasExtra * horasExtras;
        } else if (this.empleado.tipo().equals("Empleado Asalariado")){
            EmpleadoAsalariado asalariado = (EmpleadoAsalariado) this.empleado;
            return asalariado.salarioMensualFijo;
        } else if (this.empleado.tipo().equals("Empleado a Comisión")){
            EmpleadoPorComision comision = (EmpleadoPorComision) this.empleado;
            return comision.porcentajeComision * this.ventasTotales;
        }
        return this.empleado.tarifaPorHora * this.horasTrabajadas;
    }
}
