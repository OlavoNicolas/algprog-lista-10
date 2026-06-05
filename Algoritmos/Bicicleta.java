public class Bicicleta{
        String cor;
        String marca;
        int numeroMarchas;
        int velocidade;

        public Bicicleta(String cor, String marca, int numeroMarchas) {
            this.cor = cor;
            this.marca = marca;
            this.numeroMarchas = numeroMarchas;
            this.velocidade = 0;
        }

        
        public void pedalar() {
            velocidade += 5;
            System.out.println("Pedalando... Velocidade atual: " + velocidade + " km/h");
        }

        public void frear() {
            velocidade = Math.max(0, velocidade - 5);
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        }

        public void trocarMarcha(int novaMarcha) {
            numeroMarchas = novaMarcha;
            System.out.println("Marcha alterada para " + numeroMarchas);
        }

        public void mostrarDados() {
            System.out.println("Cor: " + cor);
            System.out.println("Marca: " + marca);
            System.out.println("Marchas: " + numeroMarchas);
            System.out.println("Velocidade: " + velocidade + " km/h");
        }

    public static void main(String[] args) {

        Bicicleta bike1 = new Bicicleta("Azul", "Caloi", 21);

        bike1.mostrarDados();

        System.out.println("\n--- Ações ---");
        bike1.pedalar();
        bike1.pedalar();
        bike1.trocarMarcha(5);
        bike1.frear();
    }
}
