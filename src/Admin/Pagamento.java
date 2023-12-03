package Admin;
import java.time.LocalDateTime;

public class Pagamento {
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
