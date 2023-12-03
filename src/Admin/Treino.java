package Admin;
public class Treino {
    private String nome;
    private String descricao;
    private String horario;
    private Personal personal;
    private Aluno aluno;

    public Treino(String nome, String descricao, String horario, Personal personal, Aluno aluno) {
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
        this.personal = personal;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHorario() {
        return horario;
    }

    public Personal getPersonal() {
        return personal;
    }

    public Aluno getAluno() {
        return aluno;
    }
    
    
}

