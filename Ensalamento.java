import java.util.ArrayList;

public class Ensalamento {
    ArrayList<Sala> sala;
    ArrayList<Turma> turma;
    ArrayList<TurmaEmSala> ensalamento;
     
    Ensalamento(){
        sala = new ArrayList<>();
        turma = new ArrayList<>();
        ensalamento = new ArrayList<>();
    }

    void addSala(Sala sala){
        this.sala.add(sala);
    }

    void addTurma(Turma turma){
        this.turma.add(turma);
    }

    
}