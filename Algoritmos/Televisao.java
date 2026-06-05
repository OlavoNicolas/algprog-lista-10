public class Televisao {
    private double tamanho;
    private String marca;
    private int resolucao;
    private int volume;

    public Televisao(double tamanho, String marca, int resolucao, int volume){
        this.tamanho = tamanho;
        this.marca = marca;
        this.resolucao = resolucao;
        this.volume = volume; 
    }

    
    public String getMarca() {
        return marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public int getResolucao() {
        return resolucao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void ligarTelevisao(){
        System.out.println("TV ligada!");
    }
    
    public void desligarTelevisao(){
        System.out.println("TV desligada!");
    }

    public void infoTelevisao(){
    System.out.println("Informações da televisao");
    System.out.println();
    System.out.println("Marca: " + getMarca());
    System.out.println("Tamanho: " + getTamanho() + " Polegadas");
    System.out.println("Resolução: " + getResolucao() + "K");
    System.out.println();
    }

    public void aumentarVolume(){
        System.out.println("De " + getVolume());
        setVolume(volume + 10);
        System.out.println("Para " + getVolume() + " \n");
    }

    public void diminuirVolume(){
        System.out.println("De " + getVolume());
        setVolume(volume - 10);
        System.out.println("Para " + getVolume()+"\n");
    }

public static void main(String[] args) {
    
    Televisao televisao1 = new Televisao(5.5, "Samsung", 4, 0);

    televisao1.infoTelevisao();
    televisao1.ligarTelevisao();
    televisao1.aumentarVolume();
    televisao1.aumentarVolume();
    televisao1.diminuirVolume();
    televisao1.diminuirVolume();
    televisao1.desligarTelevisao();
}
}


