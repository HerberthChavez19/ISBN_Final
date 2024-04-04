import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros){
        this.libros = libros;
    }
    public void Agregar(Libro libro){
        this.libros.add(libro);
    }
    public void Mostrar(){
        for (int i = 0; i <libros.size() ; i++) {
            System.out.println("Nombre del Libro: " + libros.get(i).getname());
            System.out.println("Nombre del autor: " + libros.get(i).getauthor());
            System.out.println("Numero de pages: " + libros.get(i).getpages());
            System.out.println("ISBN del libro: " + libros.get(i).getISBN());
            System.out.println("\n");
        }
    }
}

