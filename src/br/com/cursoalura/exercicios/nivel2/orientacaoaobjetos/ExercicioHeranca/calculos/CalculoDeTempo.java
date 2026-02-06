package br.com.cursoalura.exercicios.nivel2.orientacaoaobjetos.ExercicioHeranca.calculos;

<<<<<<< HEAD
import br.com.cursoalura.exercicios.nivel2.orientacaoaobjetos.ExercicioHeranca.Titulos;
=======
import br.com.cursoalura.exercicios.nivel2.orientacaoaobjetos.ExercicioHeranca.Titulo;
>>>>>>> 044dfbf55165f6e96868ab5b591e422b08dc789c

public class CalculoDeTempo {
    private int tempoTotal =0;

    public int getTempoTotal(){
        return tempoTotal;
    }

<<<<<<< HEAD
    public void inclui(Titulos titulo){
=======
    public void inclui(Titulo titulo){
>>>>>>> 044dfbf55165f6e96868ab5b591e422b08dc789c
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
