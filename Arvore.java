public class Arvore {
    String nome;
    String tipo;
    double altura;

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura);
    }

    public void calcularOxigenio() {
        double oxigenio = this.altura * 10;
        System.out.println(altura + " metro(s) de altura = " + oxigenio + " gramas de oxigênio por dia");
    }
}