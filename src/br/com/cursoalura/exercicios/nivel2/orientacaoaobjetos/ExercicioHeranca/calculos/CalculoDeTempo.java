package br.com.cursoalura.exercicios.nivel2.orientacaoaobjetos.ExercicioHeranca.calculos;

import br.com.cursoalura.exercicios.nivel2.orientacaoaobjetos.ExercicioHeranca.Titulos;

public class CalculoDeTempo {
    private int tempoTotal =0;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulos titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
