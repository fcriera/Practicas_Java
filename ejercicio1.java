import java.util.ArrayList;

public class ejercicio1{
    public static void main (String[] args) {
        Asignatura fisica = new Asignatura("Física",7.0);
        //System.out.println(fisica.getNombre());
        Asignatura quimica = new Asignatura("Quimica", 8.0);
        //System.out.println(quimica.getNombre());
        Asignatura lengua = new Asignatura("Lengua",5.0);
        //System.out.println(lengua.getNombre());
        Asignatura matematicas = new Asignatura("Matemáticas",3.0);

        Alumno juan = new Alumno("Juan", "Perez");
        //System.out.println(juan.getApellido() + " " + juan.getNombre());

        ArrayList<Asignatura> asignaturasDeJuan = new ArrayList<>();
        asignaturasDeJuan.add(fisica);
        asignaturasDeJuan.add(quimica);
        asignaturasDeJuan.add(lengua);
        
        juan.setAsignaturas(asignaturasDeJuan);
        juan.agregarAsignatura(matematicas);
        juan.modificarNota("Lengua", 8.0);
        juan.informarAsignatura("Física");

        System.out.println(juan.getAsignaturas().get(0).getNombre());
        
        System.out.println(juan.promedio());

        System.out.println(juan.mostrarBoletin());
    }


}
