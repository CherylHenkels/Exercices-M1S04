import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList para armazenar lista de cursos e professores.
        List<String> cursosProfessores = new ArrayList<>();

        // ArrayList para armazenar lista de cursos concluídos
        List<String> cursosConcluidos = new ArrayList<>();


        System.out.println("*************");
        System.out.println("* BEM VINDO *");
        System.out.println("*************\n");


        do {
            System.out.println("|--------------------------|");
            System.out.println("| 1- Listar                |");
            System.out.println("| 2- Adicionar             |");
            System.out.println("| 3- Remover               |");
            System.out.println("| 4- Marcar como concluído |");
            System.out.println("| 5- Listar concluídos     |");
            System.out.println("|--------------------------|");
            System.out.println("| 0- Sair                  |");
            System.out.println("|--------------------------|");
            System.out.println("Selecione uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consome enter depois do número

            // Menu
            switch (opcao) {
                case 1: // listar
                    listarCursosProfessores(cursosProfessores);
                    break;
                case 2: // adicionar
                    adicionarCursoProfessor(scanner, cursosProfessores);
                    break;
                case 3: // remover
                    removerItemLista(scanner, cursosProfessores);
                    break;
                case 4: // marcar como concluido
                    marcarComoConcluido(scanner, cursosProfessores, cursosConcluidos);
                    break;
                case 5: // listar concluidos
                    listarCursosProfessores(cursosConcluidos);
                    break;
                case 0: // sair
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
            }

            espacoVertical();
        } while (true);

    }

    private static void marcarComoConcluido(Scanner entrada, List<String> cursosProfessores, List<String> cursosConcluidos) {
        int indice = listarPedirIndice(entrada, cursosProfessores);
        for (int i = 0; i < cursosProfessores.size(); i++) {
            if (i + 1 == indice) {
                cursosConcluidos.add(cursosProfessores.get(i));
                System.out.println("Curso " + cursosProfessores.get(i) + " foi concluído.");
            }
        }
        removeritem(indice, cursosProfessores);
    }

    private static void removerItemLista(Scanner entrada, List<String> cursosProfessores) {
        int indice = listarPedirIndice(entrada,cursosProfessores);
        removeritem(indice, cursosProfessores);
    }

    private static void removeritem(int indice, List<String> cursosProfessores) {
        cursosProfessores.remove((indice - 1));
        //System.out.println("O curso/professor foi removido com sucesso!");
    }


    private static int listarPedirIndice(Scanner entrada, List<String> cursosProfessores) {
        do {
            listarCursosProfessores(cursosProfessores);
            System.out.println("Digite o índice do curso/professor que você deseja selecionar");
            int indiceCursoProfessor = nextInt(entrada);
            if ( indiceCursoProfessor > cursosProfessores.size()) {
                System.out.println("Indice inválido");
                listarPedirIndice(entrada, cursosProfessores);
            }
            return indiceCursoProfessor;
        } while(true);
    }



    //Adicionar curso/professores na lista
    private static void adicionarCursoProfessor(Scanner entrada, List<String> cursosProfessores) {
        System.out.println("Digite um curso/professor: ");
        String itemLista = entrada.nextLine();
        cursosProfessores.add(itemLista);
        System.out.println("Curso/professor adicionado!!");
    }

    // Listar os cursos/professores inseridos
    private static void listarCursosProfessores(List<String> cursosProfessores) {
        System.out.println("\nSua lista de cursos/professores é:");
        for (int i = 0; i < cursosProfessores.size(); i++) {
            int indice = i + 1;
            System.out.println(indice + " - " + cursosProfessores.get(i));
        }
    }

    private static void espacoVertical() {
        System.out.println("\n\n\n");
    }

    private static int nextInt(Scanner scn) {
        int i = scn.nextInt();
        //consumindo "ENTER" para futuros "nextLine()"
        scn.nextLine();
        return i;
    }
}