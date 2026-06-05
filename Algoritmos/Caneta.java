public class Caneta {
        String cor;
        String marca;
        String tipoTinta;
        boolean tampada;

        public Caneta(String cor, String marca, String tipoTinta) {
            this.cor = cor;
            this.marca = marca;
            this.tipoTinta = tipoTinta;
            this.tampada = true;
        }

        public void destampar() {
            tampada = false;
            System.out.println("Caneta destampada.");
        }

        public void tampar() {
            tampada = true;
            System.out.println("Caneta tampada.");
        }

        public void escrever() {
            if (tampada) {
                System.out.println("Não é possível escrever. A caneta está tampada.");
            } else {
                System.out.println("Escrevendo...");
            }
        }

        public void mostrarDados() {
            System.out.println("Cor: " + cor);
            System.out.println("Marca: " + marca);
            System.out.println("Tipo de tinta: " + tipoTinta);
            System.out.println("Tampada: " + tampada);
        }

    public static void main(String[] args) {

        Caneta caneta1 = new Caneta("Azul", "BIC", "Esferográfica");

        caneta1.mostrarDados();

        System.out.println("\n--- Ações ---");
        caneta1.escrever();
        caneta1.destampar();
        caneta1.escrever();
        caneta1.tampar();
    }
}
