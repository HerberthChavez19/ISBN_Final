import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro libroA = new Libro("El Principito", "Saint Exupery", 100);
        Libro libroB = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 200);
        Libro libroC = new Libro("Andanzas y malandanzas", "Anonimo",80);
        ArrayList<Libro> libros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(libros);
        biblioteca.Agregar(libroA);
        biblioteca.Agregar(libroB);
        biblioteca.Agregar(libroC);
        
        biblioteca.Mostrar();

    }
}
