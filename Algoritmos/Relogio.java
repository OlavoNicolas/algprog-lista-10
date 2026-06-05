public class Relogio {
        String marca;
        String cor;
        int hora;
        int minuto;

        // Construtor
        public Relogio(String marca, String cor, int hora, int minuto) {
            this.marca = marca;
            this.cor = cor;
            this.hora = hora;
            this.minuto = minuto;
        }

        // Métodos
        public void mostrarHora() {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto);
        }

        public void ajustarHora(int novaHora, int novoMinuto) {
            hora = novaHora;
            minuto = novoMinuto;
            System.out.println("Hora ajustada com sucesso.");
        }

        public void despertar() {
            System.out.println("Despertador tocando! ⏰");
        }

        public void mostrarDados() {
            System.out.println("Marca: " + marca);
            System.out.println("Cor: " + cor);
            mostrarHora();
        }
    
    // Main
    public static void main(String[] args) {

        Relogio relogio1 = new Relogio("Casio", "Preto", 10, 30);

        relogio1.mostrarDados();

        System.out.println("\n--- Ações ---");
        relogio1.mostrarHora();
        relogio1.ajustarHora(14, 45);
        relogio1.mostrarHora();
        relogio1.despertar();
    }
}