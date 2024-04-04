public class Libro {
    private int ISBN;
    private String name;
    private String author;
    private int pages;

    public Libro(int ISBN, String name, String author, int pages) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public Libro(String name, String author, int pages){
        this.ISBN = GeneradorISBN.newContador();
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getname() {
        return name;
    }

    public String getauthor() {
        return author;
    }

    public int getpages() {
        return pages;
    }
}
