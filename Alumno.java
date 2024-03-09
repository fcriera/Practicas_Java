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

    public Double promedio(){
        double aux = 0.0;
        for (int i = 0; i < asignaturas.size(); i++) {
            aux += asignaturas.get(i).getNota();
        }
        aux = aux/asignaturas.size();
        return aux;

    }
    public String mostrarBoletin(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Alumno: %s %s %n", nombre, apellido));
        sb.append(this.imprimirLinea("Asignatura", "Nota"));
        sb.append(String.format("--------------------------------------------------%n"));
        for (int i = 0; i< asignaturas.size(); i++){
            sb.append(this.imprimirLinea(asignaturas.get(i).getNombre(), asignaturas.get(i).getNota().toString()));
        }
        sb.append(String.format("--------------------------------------------------%n"));
        sb.append(this.imprimirLinea("Nota Media:", this.promedio().toString()));
        return sb.toString();
    }

    private String imprimirLinea(String texto1, String texto2) {
        String espacios = "";

        int espaciosTotales = 50;
        int espaciosOcupados = texto1.length() + texto2.length();
        int espaciosBlancos = espaciosTotales - espaciosOcupados;

        for (int i=0; i<espaciosBlancos; i++) {
            espacios += " ";
        }
    
        return String.format("%s%s%s%n", texto1, espacios, texto2);
    }
  
    public void agregarAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
    }
  
    public void modificarNota(String nombreAsignatura, Double notaAsignatura){
        for (int i = 0; i < this.asignaturas.size(); i++){
            if (this.asignaturas.get(i).getNombre() == nombreAsignatura){
                this.asignaturas.get(i).setNota(notaAsignatura);
            }
        }
    }
    
    public void informarAsignatura(String nombreAsignatura){
        for (int i = 0; i < this.asignaturas.size(); i++){
            if (this.asignaturas.get(i).getNombre() == nombreAsignatura){
                System.out.println("La nota de " + nombreAsignatura + " es: " + this.asignaturas.get(i).getNota());
            }
        }
    }
    
}
