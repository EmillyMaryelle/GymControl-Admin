package Admin;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Admin.Controller.Aluno;
import Admin.Controller.Pagamento;
import Admin.Controller.Personal;
import Admin.Controller.Treino;

public class Main {
    static List<Controller.Aluno> alunos = new ArrayList<>();
    static List<Controller.Treino> treinos = new ArrayList<>();
    static List<Controller.Aula> aulas = new ArrayList<>();
    static List<Controller.Pagamento> pagamentos = new ArrayList<>();
    static List<Controller.Resultado> resultados = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String nomeUsuario;

    public static void main(String[] args) {
    	System.out.println("Bem-vindo ao sistema GymControl, antes de iniciar preciso que me informe seu nome ou o código de permissão: ");
        try {
            nomeUsuario = obterNomeUsuario();
        } catch (Exception e) {
            System.out.println("Erro interno, por favor tente novamente: " + e.getMessage());
            return;  
        }
        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    navegarControleAlunos();
                    break;
                case 2:
                    navegarCadastroTreinos();
                    break;
                case 3:
                    navegarGestaoAulas();
                    break;
                case 4:
                    navegarControlePagamentos();
                    break;
                case 5:
                    navegarAcompanhamentoResultados();
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
    

    private static void exibirMenuPrincipal() {
    	System.out.println("========Bem vindo ao GymControll  " + nomeUsuario + "!");
        System.out.println("1. Controle de Alunos");
        System.out.println("2. Cadastro de Treinos");
        System.out.println("3. Gestão de Aulas");
        System.out.println("4. Controle de Pagamentos");
        System.out.println("5. Acompanhamento de Resultados");
        System.out.println("0. Sair");
        System.out.print("O que deseja realizar hoje?: ");
        
    }
    private static String obterNomeUsuario() throws Exception {
        System.out.print(" ");
        String nome = scanner.nextLine();

        if (nome.trim().isEmpty()) {
            throw new Exception("Preciso do seu nome para iniciar o sistema.");
        }
        return nome;
    }

    private static void navegarControleAlunos() {
        int opcao;
        do {
            exibirMenuControleAlunos();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 0:
                    System.out.println("Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenuControleAlunos() {
        System.out.println("\n===== Controle de Alunos =====");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Listar Alunos");
        System.out.println("0. Retornar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAluno() {
        System.out.println("\n===== Cadastro de Aluno =====");
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do aluno: ");
        String cpf = scanner.nextLine();

        Controller.Aluno aluno = new Aluno(nome, cpf);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void listarAlunos() {
        System.out.println("\n===== Listagem de Alunos =====");
        for (Controller.Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", CPF: " + aluno.getCpf());
        }
    }

   
    private static void navegarCadastroTreinos() {
        int opcao;
        do {
            exibirMenuCadastroTreinos();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarTreino();
                    break;
                case 2:
                    listarTreinos();
                    break;
                case 0:
                    System.out.println("Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenuCadastroTreinos() {
        System.out.println("\n===== Cadastro de Treinos =====");
        System.out.println("1. Cadastrar Treino");
        System.out.println("2. Listar Treinos");
        System.out.println("0. Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarTreino() {
        System.out.println("\n===== Cadastro de Treino =====");
        System.out.print("Nome do treino: ");
        String nomeTreino = scanner.nextLine();
        System.out.print("Descrição do treino: ");
        String descricaoTreino = scanner.nextLine();
        System.out.print("Horário do treino: ");
        String horarioTreino = scanner.nextLine();
        System.out.print("Nome do professor: ");
        String nomePersonal = scanner.nextLine();
        Personal personal = new Personal(nomePersonal);
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("CPF do aluno: ");
        String cpfAluno = scanner.nextLine();
        Controller.Aluno aluno = new Aluno(nomeAluno, cpfAluno);
        Controller.Treino treino = new Treino(nomeTreino, descricaoTreino, horarioTreino, personal, aluno);
        treinos.add(treino);
        System.out.println("Treino cadastrado com sucesso!");
    }

    private static void listarTreinos() {
        System.out.println("\n===== Listagem de Treinos =====");
        for (Controller.Treino treino : treinos) {
            System.out.println("Nome do treino: " + treino.getNome());
            System.out.println("Descrição: " + treino.getDescricao());
            System.out.println("Horário: " + treino.getHorario());
            System.out.println("Professor: " + treino.getPersonal().getNome());
            System.out.println("Aluno: " + treino.getAluno().getNome() + "\n CPF: " + treino.getAluno().getCpf());
            System.out.println("------------------------------");
        }
    }


    private static void navegarGestaoAulas() {
        int opcao;
        do {
            exibirMenuGestaoAulas();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    cadastrarAula();
                    break;
                case 2:
                    listarAulas();
                    break;
                case 0:
                    System.out.println("Retornando ao Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenuGestaoAulas() {
        System.out.println("\n===== Gestão de Aulas =====");
        System.out.println("1. Cadastrar Aula");
        System.out.println("2. Listar Aulas");
        System.out.println("0. Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAula() {
        System.out.println("\n===== Cadastro de Aula =====");
        System.out.print("Tipo da aula: ");
        String tipoAula = scanner.nextLine();
        System.out.print("Horário da aula: ");
        String horarioAula = scanner.nextLine();
        System.out.print("Autorizado por: ");
        String reservador = scanner.nextLine();
        System.out.print("Numero de participantes: ");
        int numParticipantes = scanner.nextInt();
        Controller.Aula aula = new Controller.Aula(tipoAula, horarioAula, reservador, numParticipantes);
        aulas.add(aula);
        System.out.println("Aula cadastrada com sucesso!");
    }

    private static void listarAulas() {
        System.out.println("\n===== Listagem de Aulas =====");
        for (Controller.Aula aula : aulas) {
            System.out.println("Tipo da aula: " + aula.getTipo());
            System.out.println("Horário: " + aula.getHorario());
            System.out.println("Reservador: " + aula.getReservador());
            System.out.println("Participantes: " + aula.getNumParticipantes());
            System.out.println("Data do registro: " + aula.getDataRegistro());
            System.out.println("------------------------------");
        }
    }

    private static void navegarControlePagamentos() {
        int opcao;
        do {
            exibirMenuControlePagamentos();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarPagamento();
                    break;
                case 2:
                    listarPagamentos();
                    break;
                case 0:
                    System.out.println("Retornando ao Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenuControlePagamentos() {
        System.out.println("\n===== Controle de Pagamentos =====");
        System.out.println("1. Cadastrar Pagamento");
        System.out.println("2. Listar Pagamentos");
        System.out.println("0. Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarPagamento() {
        System.out.println("\n===== Cadastro de Pagamento =====");
        System.out.print("Insira os dados corretamente: " + nomeUsuario);
        System.out.print("Nome do pagador: ");
        String nomePagador = scanner.nextLine();
        System.out.print("Valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Forma de pagamento (espécie, crédito, pix): ");
        String formaPagamento = scanner.nextLine();
        Controller.Pagamento pagamento = new Pagamento(nomePagador, valorPagamento, formaPagamento, null);
        pagamentos.add(pagamento);

        System.out.println("Pagamento cadastrado com sucesso!");
    }

    private static void listarPagamentos() {
        System.out.println("\n===== Listagem de Pagamentos =====");
        for (Controller.Pagamento pagamento : pagamentos) {
        	System.out.println("Autorizante: " + pagamento.getNomeUsuario());
            System.out.println("Nome do cliente: " + pagamento.getNomePagador());
            System.out.println("Nome do pagador: " + pagamento.getNomePagador());
            System.out.println("Valor: " + pagamento.getValor());
            System.out.println("Forma de pagamento: " + pagamento.getFormaPagamento());
            System.out.println("Horário do pagamento: " + pagamento.getHorarioPagamento());
            System.out.println("------------------------------");
        }
    }


    private static void navegarAcompanhamentoResultados() {
        int opcao;
        do {
            exibirMenuAcompanhamentoResultados();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarResultado();
                    break;
                case 2:
                    atualizarPesoAluno();
                    break;
                case 3:
                    listarResultados();
                    break;
                case 0:
                    System.out.println("Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenuAcompanhamentoResultados() {
        System.out.println("\n===== Acompanhamento de Resultados =====");
        System.out.println("1. Cadastrar Resultado");
        System.out.println("2. Atualizar Peso do Aluno");
        System.out.println("3. Listar Resultados");
        System.out.println("0. Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarResultado() {
        System.out.println("\n===== Cadastro de Resultado =====");
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        Controller.Aluno aluno = buscarAlunoPorNome(nomeAluno);

        if (aluno == null) {
            System.out.print("Telefone do aluno: ");
            String telefone = scanner.nextLine();
            System.out.print("Personal do aluno: ");
            System.out.print("Peso inicial do aluno: ");
            scanner.nextLine();
            aluno = new Aluno(nomeAluno, telefone);
            alunos.add(aluno);
        }else {
        	System.out.print("Telefone do aluno: ");
            String telefone = scanner.nextLine();
            System.out.print("Personal do aluno: ");
            String personal = scanner.nextLine();
            System.out.print("Peso inicial do aluno: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); 
            Controller.Resultado resultado = new Controller.Resultado(aluno, telefone, personal, peso);
            resultados.add(resultado);
        }
        System.out.println("Resultado cadastrado com sucesso!");
    }

    private static void atualizarPesoAluno() {
        System.out.println("\n===== Atualizar Peso do Aluno =====");
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        Controller.Aluno aluno = buscarAlunoPorNome(nomeAluno);

        if (aluno != null) {
        	Controller.Resultado resultadoExistente = buscarResultadoPorAluno(aluno);

            if (resultadoExistente != null) {
                System.out.println("Peso atual do aluno " + aluno.getNome() + ": " + resultadoExistente.getPeso());
                System.out.print("Novo peso do aluno: ");
                double novoPeso = scanner.nextDouble();
                scanner.nextLine(); 
                resultadoExistente.setPeso(novoPeso);
                System.out.println("Peso do aluno atualizado com sucesso!");
            } else {
                System.out.println("Resultado não encontrado para o aluno. Cadastre um novo resultado.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }


    private static void listarResultados() {
        System.out.println("\n===== Listagem de Resultados =====");
        for (Controller.Resultado resultado : resultados) {
            System.out.println("Nome do aluno: " + resultado.getAluno().getNome());
            System.out.println("Telefone: " + resultado.getTelefone());
            System.out.println("Personal: " + resultado.getPersonal());
            System.out.println("Peso: " + resultado.getPeso());
            System.out.println("------------------------------");
        }
    }

    private static Controller.Aluno buscarAlunoPorNome(String nomeAluno) {
        for (Controller.Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                return aluno;
            }
        }
        return null;
    }

    private static Controller.Resultado buscarResultadoPorAluno(Controller.Aluno aluno) {
        for (Controller.Resultado resultado : resultados) {
            if (resultado.getAluno().equals(aluno)) {
                return resultado;
            }
        }
        return null;
    }




}
