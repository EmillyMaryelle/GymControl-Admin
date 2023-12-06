package Admin;

import java.util.List;

public class EndPointsLists {
	
	public static List<Controller.Treino> getTreinos() {
		return getTreinos();
	}

	public static void setTreinos(List<Controller.Treino> treinos) {
		Main.treinos = treinos;
	}
	
	public static List<Controller.Aula> getAulas() {
		return getAulas();
	}

	public static void setAulas(List<Controller.Aula> aulas) {
		Main.aulas = aulas;
	}

	public static List<Controller.Pagamento> getPagamentos() {
		return getPagamentos();
	}

	public static void setPagamentos(List<Controller.Pagamento> pagamentos) {
		Main.pagamentos = pagamentos;
	}

	public static List<Controller.Resultado> getResultados() {
		return getResultados();
	}

	public static void setResultados(List<Controller.Resultado> resultados) {
		Main.resultados = resultados;
	}

	public static String getNomeUsuario() {
		return getNomeUsuario();
	}

	public static void setNomeUsuario(String nomeUsuario) {
		Main.nomeUsuario = nomeUsuario;
	}

}
