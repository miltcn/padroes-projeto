package prototype;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDePrototipos {
    private Map<String, IPrototype> prototipos = new HashMap<String, IPrototype>();

    public GerenciadorDePrototipos() {
        Livro livro = new Livro();
        livro.setNome("Desconhecido");
        livro.setAutor("Desconhecido");
        livro.setNumeroPaginas(0);
        prototipos.put("livro", livro);

        Revista revista = new Revista();
        revista.setNome("Desconhecido");
        revista.setEdicao(0);
        prototipos.put("revista", revista);

        Trabalho trabalho = new Trabalho();
        trabalho.setNome("Desconhecido");
        trabalho.setAutor("Desconhecido");
        trabalho.setTipo("Desconhecido");
        prototipos.put("trabalho", trabalho);
    }

    public IPrototype getInstance(String identificador) {
        return this.prototipos.get(identificador);
    }
}
