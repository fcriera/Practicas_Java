import java.util.ArrayList;

public class ejercicio1{
    public static void main (String[] args) {
        Asignatura fisica = new Asignatura("Fisica");
        fisica.setNota(7.0);
        //System.out.println(fisica.getNombre());
        Asignatura quimica = new Asignatura("Quimica");
        quimica.setNota(8.0);
        //System.out.println(quimica.getNombre());
        Asignatura lengua = new Asignatura("Lengua");
        lengua.setNota(5.0);
        //System.out.println(lengua.getNombre());

        Alumno juan = new Alumno("Juan", "Perez");
        //System.out.println(juan.getApellido() + " " + juan.getNombre());

        ArrayList<Asignatura> asignaturasDeJuan = new ArrayList<>();
        asignaturasDeJuan.add(fisica);
        asignaturasDeJuan.add(quimica);
        asignaturasDeJuan.add(lengua);
        
        juan.setAsignaturas(asignaturasDeJuan);
        System.out.println(juan.getAsignaturas().get(0).getNombre());
        System.out.println(juan.promedio());

        System.out.println(juan.boletin());
    }


}
