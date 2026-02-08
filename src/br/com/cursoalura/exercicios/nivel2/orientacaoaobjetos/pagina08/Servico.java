package br.com.cursoalura.exercicios.nivel2.orientacaoaobjetos.pagina08;

public class Servico implements Vendavel {

    @Override
    public void precoTotalDoProduto(int quantidadeComprada) {
        System.out.println("Use precoTotalHoraTrabalhada(double)");
    }

    @Override
    public double aplicaDesconto() {
        return 0;
    }

    public void precoTotalDoProduto(double precoHoraTrabalhada){
        int totalHoraTrabalhada =8;
        double precoTotal = precoHoraTrabalhada * totalHoraTrabalhada;
        System.out.println("Total: " + precoTotal);
    }

    public static void main(String[] args) {
        Servico servico = new Servico();
        servico.precoTotalDoProduto(10);
        servico.precoTotalDoProduto(8.0);
    }

}


