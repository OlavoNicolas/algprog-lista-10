public class Livro {
    private String titulo;
    private String nomeAutor;
    private String genero;
    private int numPaginas;
    private int pagAtual;

    public Livro(String titulo, String nomeAutor, String genero, int numPaginas, int pagAtual){

        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.pagAtual = 0;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getpagAtual() {
        return pagAtual;
    }

    public void setpagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void abrirLivro(){
        System.out.println("Livro aberto");
    }

    public void fecharLivro(){
        System.out.println("Livro fechado");
    }

    public void infoLivro(){
    System.out.println("Informações do livro");
    System.out.println();
    System.out.println("Titulo:" + titulo);
    System.out.println("Autor:" + nomeAutor);
    System.out.println("Genêro:" + genero);
    System.out.println("Numero de páginas: " + numPaginas);
    System.out.println();
    }

    public void passarPag(){
        System.out.println("Passando para a próxima página: ");
        setpagAtual(pagAtual+1);
        System.out.println("Pág atual: " + getpagAtual());
    }

    public void voltarPag(){
        System.out.println("Voltando uma página: ");
        setpagAtual(pagAtual-1);
        System.out.println("Pág atual: " + getpagAtual());
    }

    public static void main(String[] args) {
        Livro livro = new Livro("A revolução dos bichos", "George Orwell", "Revolução", 100, 0);

        livro.infoLivro();
        livro.abrirLivro();
        livro.passarPag();
        livro.passarPag();
        livro.voltarPag();
        livro.voltarPag();
        livro.fecharLivro();
    }
}
