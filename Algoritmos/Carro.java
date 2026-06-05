public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private int velocidade;

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void ligarCarro(){
        System.out.println("O carro foi ligado!");
    }
    
    public void desligarCarro(){
        System.out.println("O carro foi desligado!");
    }

    public void infoCarro(){
    System.out.println("Informações do carro");
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Cor: " + getCor());
    }

    public void acelerar(){
        System.out.println("De " + getVelocidade() + "KM");
        setVelocidade(velocidade + 10);
        System.out.println("Para " + getVelocidade() + " KM\n");
    }

    public void frear(){
        System.out.println("De " + getVelocidade() + "KM");
        setVelocidade(velocidade - 10);
        System.out.println("Para " + getVelocidade() + " KM\n");
    }

public static void main(String[] args) {
    Carro carro1 = new Carro("azul", "Toyota", "SW4");

    carro1.infoCarro();
    carro1.ligarCarro();
    carro1.acelerar();
    carro1.acelerar();
    carro1.frear();
    carro1.frear();
    carro1.desligarCarro();

}
}


