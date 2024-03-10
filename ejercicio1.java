import java.util.ArrayList;

public class ejercicio1{
    public static void main (String[] args) {
        // Ingreso objetos de la clase Asignatura que conta de dos atributos: nombre de asignatura y nota. (fisica{"física",7.0})
        Asignatura fisica = new Asignatura("Física",7.0);
        //System.out.println(fisica.getNombre());
        Asignatura quimica = new Asignatura("Quimica", 8.0);
        //System.out.println(quimica.getNombre());
        Asignatura lengua = new Asignatura("Lengua",5.0);
        //System.out.println(lengua.getNombre());
        Asignatura matematicas = new Asignatura("Matemáticas",3.0);

        //Ingreso un objeto (juan) de la clase Alumno, que tiene dos atributos (nombre y apellido)
        Alumno juan = new Alumno("Juan", "Perez");
        //System.out.println(juan.getApellido() + " " + juan.getNombre());

        // Genero un arrayList (asignaturaDeJuan) donde agrego los tres objetos creados anteriormente
        ArrayList<Asignatura> asignaturasDeJuan = new ArrayList<>();
        asignaturasDeJuan.add(fisica);
        asignaturasDeJuan.add(quimica);
        asignaturasDeJuan.add(lengua);
        
        /*  A través del método set asignaturas, ingreso el arrayList creado anteriormente 
        //con el método setAsignaturas de la clase Alumno, que sólo permite ingresar un 
        arrayList al arrayList donde se trabajn los demás métodos */
        juan.setAsignaturas(asignaturasDeJuan);
        // Ingreso el objeto matemáticas creado al inicio, con el método agregar asignatura
        juan.agregarAsignatura(matematicas);
        // Modifico la nota de una asignatura con el método modificarNota
        juan.modificarNota("Lengua", 8.0);
        // Con el método informarAsignatura, te devuelve una cadena que dice: "La nota de <asignatura> es: <nota>
        juan.informarAsignatura("Física");

        // Prueba de los geters para saber el nombre de la primera asignatura ingresada
        System.out.println(juan.getAsignaturas().get(0).getNombre());
        //Prueba del método promedio de la clase Almuno, que nos devuelve el promedio de todas las notas
        System.out.println(juan.promedio());
        // Método mostrarBoletin, que muestra en un formato establecido toda la funcionalidad del ejercicio.
        System.out.println(juan.mostrarBoletin());
    }


}
