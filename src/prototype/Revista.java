package prototype;

public class Revista implements IPrototype {
    private String nome;
    private Integer edicao;

    @Override
    public IPrototype clone() {
        Revista clone = new Revista();

        clone.setNome(this.getNome());
        clone.setEdicao(this.getEdicao());

        return clone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }
}
