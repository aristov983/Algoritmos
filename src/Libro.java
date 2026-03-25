public class Libro {
    private String titulo;
    private String autor;
    private int isbn;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public Libro(String titulo, String autor, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
}
