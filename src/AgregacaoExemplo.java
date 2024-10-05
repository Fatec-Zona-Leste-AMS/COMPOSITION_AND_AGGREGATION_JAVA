import java.util.ArrayList;
import java.util.List;

class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Equipe {
    private String nome;
    private List<Jogador> jogadores;

    public Equipe(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() { // Adicionando o getter para acessar o nome
        return nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        System.out.println("Jogadores da equipe " + nome + ":");
        for (Jogador jogador : jogadores) {
            System.out.println("- " + jogador.getNome());
        }
    }
}

class AssociacaoEsportiva {
    private String nome;
    private List<Equipe> equipes;

    public AssociacaoEsportiva(String nome) {
        this.nome = nome;
        this.equipes = new ArrayList<>();
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void listarEquipes() {
        System.out.println("Equipes da associação " + nome + ":");
        for (Equipe equipe : equipes) {
            System.out.println("- " + equipe.getNome()); // Usando o getter para acessar o nome
        }
    }
}

public class AgregacaoExemplo {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Carlos");

        Equipe equipe1 = new Equipe("Leões");
        equipe1.adicionarJogador(jogador1);
        equipe1.adicionarJogador(jogador2);

        AssociacaoEsportiva associacao = new AssociacaoEsportiva("Liga Nacional");
        associacao.adicionarEquipe(equipe1);

        associacao.listarEquipes();
        equipe1.listarJogadores();
    }
}
