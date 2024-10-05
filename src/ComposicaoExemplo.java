class Motor {
    public Motor() {
        System.out.println("Motor criado.");
    }

    public void ligar() {
        System.out.println("Motor ligado.");
    }
}

class Roda {
    public Roda() {
        System.out.println("Roda criada.");
    }
}

class Automovel {
    private Motor motor;
    private Roda[] rodas;

    public Automovel() {
        motor = new Motor();  // Composição: Motor só existe dentro do Automóvel
        rodas = new Roda[4];  // Composição: Rodas só existem dentro do Automóvel

        for (int i = 0; i < 4; i++) {
            rodas[i] = new Roda();
        }
    }

    public void ligarAutomovel() {
        motor.ligar();
        System.out.println("Automóvel ligado.");
    }
}

public class ComposicaoExemplo {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        carro.ligarAutomovel();
    }
}
