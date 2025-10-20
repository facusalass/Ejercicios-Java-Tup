import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("ingresa el nombre del estudiante");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el promedio:");
            float promedio = scanner.nextFloat();
            scanner.nextLine();

            Estudiante nuevoEstudiante = new Estudiante(nombre, promedio);
            estudiantes.add(nuevoEstudiante);

            System.out.println("Estudiante "+i+" agregado");
        }
        System.out.println("-- Estudiantes Aprobados (Promedio >= 7) --");

        estudiantes.stream()
                  .filter(e -> e.getPromedio() >= 7)
                .forEach(e -> System.out.println(e.getNombre()));

        System.out.println("-- Todos los promedios --");
            estudiantes.stream()
                    .map(Estudiante::getPromedio)
               .forEach(System.out:: println );
    }


}