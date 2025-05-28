public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible = true;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (!disponible) throw new IllegalStateException("Libro no disponible");
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
}