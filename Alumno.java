import java.util.ArrayList;

public class Alumno {
    // Atributos
    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> asignaturas;
    
    // Constructor
    public Alumno (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignaturas = new ArrayList<Asignatura>();
    }

    // Getters y Setters de Nombre, apellido y el array List asignaturas
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
    
    // Calcula el promedio de todas las notas en una variable aux
    public Double promedio(){
        double aux = 0.0;
        for (int i = 0; i < asignaturas.size(); i++) {
            aux += asignaturas.get(i).getNota();
        }
        aux = aux/asignaturas.size();
        return aux;

    }
    // Boletín de notas, apoyado en método imprimirLinea 
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
    // Método que calcula los espacios vacíos, se usa al momento de crear el boletín
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
    // Método para añadir asignaturas en nuestro arrayList 
    public void agregarAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
    }
    // Método para modificar la nota, de una asignatura x dentro de nuestro arrayList creado
    public void modificarNota(String nombreAsignatura, Double notaAsignatura){
        for (int i = 0; i < this.asignaturas.size(); i++){
            if (this.asignaturas.get(i).getNombre() == nombreAsignatura){
                this.asignaturas.get(i).setNota(notaAsignatura);
            }
        }
    }
    // Método para Saber la nota de una asignatura x que pida
    public void informarAsignatura(String nombreAsignatura){
        for (int i = 0; i < this.asignaturas.size(); i++){
            if (this.asignaturas.get(i).getNombre() == nombreAsignatura){
                System.out.println("La nota de " + nombreAsignatura + " es: " + this.asignaturas.get(i).getNota());
            }
        }
    }
    
}
