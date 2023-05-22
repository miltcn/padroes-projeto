package prototype;

public class Trabalho implements IPrototype {
    private String nome;
    private String autor;
    private String tipo;

    @Override
    public IPrototype clone() {
        Trabalho clone = new Trabalho();

        clone.setNome(this.getNome());
        clone.setAutor(this.getAutor());
        clone.setTipo(this.getTipo());

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
