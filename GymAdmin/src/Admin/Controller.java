package Admin;
import java.time.LocalDateTime;

public class Controller {
	
	public static class Aula {
	    private String tipo;
	    private String horario;
	    private String reservador;
	    private int numParticipantes;
	    private LocalDateTime dataRegistro;

	    public Aula(String tipo, String horario, String reservador, int numParticipantes) {
	        this.tipo = tipo;
	        this.horario = horario;
	        this.reservador = reservador;
	        this.numParticipantes = numParticipantes;
	        this.dataRegistro = LocalDateTime.now();
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public String getHorario() {
	        return horario;
	    }

	    public String getReservador() {
	        return reservador;
	    }

	    public int getNumParticipantes() {
	        return numParticipantes;
	    }

	    public LocalDateTime getDataRegistro() {
	        return dataRegistro;
	    }

		
	}
	
	public static class Aluno {
	    private String nome;
	    private String cpf;

	    public Aluno(String nome, String cpf) {
	        this.nome = nome;
	        this.cpf = cpf;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }
	}
	
	
	public static class Resultado {
	    private Controller.Aluno aluno;
	    private String telefone;
	    private String personal;
	    private double peso;

	    public Resultado(Controller.Aluno aluno, String telefone, String personal, double peso) {
	        this.aluno = aluno;
	        this.telefone = telefone;
	        this.personal = personal;
	        this.peso = peso;
	    }

	    public Controller.Aluno getAluno() {
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
	
	public static class Treino {
	    private String nome;
	    private String descricao;
	    private String horario;
	    private Personal personal;
	    private Controller.Aluno aluno;

	    public Treino(String nome, String descricao, String horario, Personal personal, Controller.Aluno aluno) {
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

	    public Controller.Aluno getAluno() {
	        return aluno;
	    }
	}
	
	public static class Pagamento {
		private String nomeUsuario;
	    private String nomePagador;
	    private double valor;
	    private LocalDateTime horarioPagamento;
	    private String formaPagamento;

	    public Pagamento(String nomePagador, double valor, String formaPagamento, String nomeUsuario) {
	    	this.nomeUsuario = nomeUsuario;
	        this.nomePagador = nomePagador;
	        this.valor = valor;
	        this.horarioPagamento = LocalDateTime.now();
	        this.formaPagamento = formaPagamento;
	    }
	    
	    
	   public String getNomeUsuario() {
		   return nomeUsuario;
	   }

	    public String getNomePagador() {
	        return nomePagador;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public LocalDateTime getHorarioPagamento() {
	        return horarioPagamento;
	    }

	    public String getFormaPagamento() {
	        return formaPagamento;
	    }
	}
	
	public static class Personal {
	    private String nome;

	    public Personal(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	}


}
