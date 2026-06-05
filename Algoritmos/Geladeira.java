public class Geladeira {
        String marca;
        String cor;
        int capacidade; // em litros
        int temperatura;

        // Construtor
        public Geladeira(String marca, String cor, int capacidade) {
            this.marca = marca;
            this.cor = cor;
            this.capacidade = capacidade;
            this.temperatura = 5; // temperatura padrão
        }

        // Métodos
        public void refrigerar() {
            temperatura--;
            System.out.println("Refrigerando... Temperatura atual: " + temperatura + "°C");
        }

        public void congelar() {
            temperatura = -5;
            System.out.println("Modo congelamento ativado. Temperatura: " + temperatura + "°C");
        }

        public void abrirPorta() {
            System.out.println("Porta da geladeira aberta.");
        }

        public void fecharPorta() {
            System.out.println("Porta da geladeira fechada.");
        }

        public void mostrarDados() {
            System.out.println("Marca: " + marca);
            System.out.println("Cor: " + cor);
            System.out.println("Capacidade: " + capacidade + " litros");
            System.out.println("Temperatura: " + temperatura + "°C");
        }

    // Main
    public static void main(String[] args) {

        Geladeira geladeira1 = new Geladeira("Brastemp", "Branca", 400);

        geladeira1.mostrarDados();

        System.out.println("\n--- Ações ---");
        geladeira1.abrirPorta();
        geladeira1.refrigerar();
        geladeira1.congelar();
        geladeira1.fecharPorta();
    }
}
