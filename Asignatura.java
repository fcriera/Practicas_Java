public class Asignatura {
    private String nombre;
    private Double nota = 0.0;

    //Constructor
    public Asignatura(String nombre, Double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
     
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String subject){
        this.nombre = subject;
    }

    public Double getNota(){
        return this.nota;
    }
    public void setNota(Double note){
        this.nota = note;
    }
    
}
