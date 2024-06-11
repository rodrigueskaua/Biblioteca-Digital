package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    // Método para adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para verificar se o aluno existe
    public boolean alunoExiste(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return true;
            }
        }
        return false;
    }

    // Método para encontrar um aluno pela matrícula
    public Aluno encontrarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    // Método para obter todos os alunos
    public List<Aluno> obterTodosAlunos() {
        return new ArrayList<>(alunos);
    }
}
