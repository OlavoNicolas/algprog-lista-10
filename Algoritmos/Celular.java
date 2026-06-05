import java.util.Scanner;

public class Celular {
    private String cor;
    private String marca;
    private int armazenamento ;
    

    public Celular(String cor, String marca, int armazenamento){
        this.cor = cor;
        this.marca = marca;
        this.armazenamento = armazenamento;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void ligarCelular(){
        System.out.println("Celular ligado!");
    }
    
    public void desligarCelular(){
        System.out.println("Celular desligado!");
    }

    public void infoCelular(){
    System.out.println("Informações do celular");
    System.out.println();
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getArmazenamento());
    System.out.println("Cor: " + getCor());
    }


    public void fazerLigacao(Scanner sc){
        System.out.println("Para qm vc deseja ligar? ");
        String pessoa = sc.nextLine();
        System.out.println("Ligando para " + pessoa + " ...");
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Celular celular = new Celular("Prata", "Samsung", 150);

    celular.infoCelular();
    celular.ligarCelular();
    celular.fazerLigacao(sc);
    celular.desligarCelular();

    sc.close();
}
}


