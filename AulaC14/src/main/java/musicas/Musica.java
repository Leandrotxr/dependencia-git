package musicas;

public class Musica {
    private String nome;
    private String duracao;

    public Musica(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }
}