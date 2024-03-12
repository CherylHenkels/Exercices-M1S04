import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList para armazenar lista de cursos e professores.
        List<String> cursosProfessores = new ArrayList<>();


        System.out.println("*************");
        System.out.println("* BEM VINDO *");
        System.out.println("*************\n");


        do {
            System.out.println("|---------------|");
            System.out.println("| 1- Listar     |");
            System.out.println("| 2- Adicionar  |");
            System.out.println("|---------------|");
            System.out.println("| 0- Sair       |");
            System.out.println("|---------------|");
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
                case 0: // sair
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
            }

            espacoVertical();
        } while (true);

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
            System.out.println((i + 1) + " - " + cursosProfessores.get(i));
        }
    }

    private static void espacoVertical() {
        System.out.println("\n\n\n");
    }
}