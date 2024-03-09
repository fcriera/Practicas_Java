import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> asignaturas;
    
    public Alumno (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignaturas = new ArrayList<Asignatura>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String name){
        this.nombre = name;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String surname){
        this.apellido = surname;
    }
    
    public ArrayList<Asignatura> getAsignaturas(){
        return this.asignaturas;
    }

    public void setAsignaturas (ArrayList<Asignatura> listAsignaturas){
        this.asignaturas = listAsignaturas;
    }

    public double promedio(){
        double aux = 0.0;
        for (int i = 0; i < asignaturas.size(); i++) {
            aux += asignaturas.get(i).getNota();
        }
        aux = aux/asignaturas.size();
        return aux;

    }
    public String boletin(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Alumno: %s %s %n", nombre, apellido));
        sb.append(String.format("Asignatura                            Nota %n"));
        sb.append(String.format("-------------------------------------------%n"));
        for (int i = 0; i< asignaturas.size(); i++){
            sb.append(String.format("%s                            %f %n",
                                                                            asignaturas.get(i).getNombre(), 
                                                                            asignaturas.get(i).getNota()
                                                                            ));
        }
        sb.append(String.format("-------------------------------------------%n"));
        sb.append(String.format("Nota Media:                       %f", promedio()));
        return sb.toString();
    }
    //public ArrayList<Asignatura> informarAsignatura(){}


    
}
