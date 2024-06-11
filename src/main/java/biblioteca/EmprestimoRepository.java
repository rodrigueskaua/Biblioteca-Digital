package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoRepository {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    // Método para adicionar emprestimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    // Método para obter todos os emprestimos
    public List<Emprestimo> obterTodosEmprestimos() {
        return new ArrayList<>(emprestimos);
    }
}
