package Admin;
public class Resultado {
    private Aluno aluno;
    private String telefone;
    private String personal;
    private double peso;

    public Resultado(Aluno aluno, String telefone, String personal, double peso) {
        this.aluno = aluno;
        this.telefone = telefone;
        this.personal = personal;
        this.peso = peso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getPersonal() {
        return personal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
