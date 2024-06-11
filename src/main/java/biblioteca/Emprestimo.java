package biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private Aluno aluno;
    private LocalDate dataEmprestimo;
    private Livro livro;

    public Emprestimo(int id, Aluno aluno, LocalDate dataEmprestimo, Livro livro) {
        this.id = id;
        this.aluno = aluno;
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(LocalDate dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }
}
