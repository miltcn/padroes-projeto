package prototype;

public class Livro implements IPrototype {
    private String nome;
    private String autor;
    private Integer numeroPaginas;

    @Override
    public IPrototype clone() {
        Livro clone = new Livro();

        clone.setNome(this.getNome());
        clone.setAutor(this.getAutor());
        clone.setNumeroPaginas(this.getNumeroPaginas());

        return clone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
