public class Ventilador {
        String marca;
        String cor;
        int velocidade;
        boolean ligado;

        // Construtor
        public Ventilador(String marca, String cor) {
            this.marca = marca;
            this.cor = cor;
            this.velocidade = 0;
            this.ligado = false;
        }

        // Métodos
        public void ligar() {
            ligado = true;
            velocidade = 1;
            System.out.println("Ventilador ligado.");
        }

        public void desligar() {
            ligado = false;
            velocidade = 0;
            System.out.println("Ventilador desligado.");
        }

        public void aumentarVelocidade() {
            if (ligado) {
                velocidade++;
                System.out.println("Velocidade aumentada para " + velocidade);
            } else {
                System.out.println("Ligue o ventilador primeiro.");
            }
        }

        public void girar() {
            if (ligado) {
                System.out.println("Ventilador girando.");
            } else {
                System.out.println("O ventilador está desligado.");
            }
        }

        public void mostrarDados() {
            System.out.println("Marca: " + marca);
            System.out.println("Cor: " + cor);
            System.out.println("Velocidade: " + velocidade);
            System.out.println("Ligado: " + ligado);
        }

    // Main
    public static void main(String[] args) {

        Ventilador ventilador1 = new Ventilador("Arno", "Branco");

        ventilador1.mostrarDados();

        System.out.println("\n--- Ações ---");
        ventilador1.ligar();
        ventilador1.girar();
        ventilador1.aumentarVelocidade();
        ventilador1.desligar();
    }
}