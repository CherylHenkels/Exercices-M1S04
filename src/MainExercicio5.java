import java.util.Scanner;

public class MainExercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso();
        Professor professor = new Professor();


        do {
            System.out.println("|--------------------------|");
            System.out.println("| 1- Adicionar professor   |");
            System.out.println("| 2- Adicionar curso       |");
            System.out.println("|--------------------------|");
            System.out.println("| 0- Sair                  |");
            System.out.println("|--------------------------|");
            System.out.println("Selecione uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consome enter depois do número

            // Menu
            switch (opcao) {
                case 1: // add professor
                    adicionarProfessor(scanner, professor);
                    professor.ensinar();
                    break;
                case 2: // add curso
                    adicionarCurso(scanner, curso);
                    break;
                case 0: // sair
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
            }

            espacoVertical();
        } while (true);
    }

    private static void adicionarCurso(Scanner scanner, Curso curso) {
        System.out.println("Digite as informações do curso");
        System.out.println("Nome");
        curso.nome = scanner.nextLine();
        System.out.println("Descrição");
        curso.descricao = scanner.nextLine();
        System.out.println("Professores");
        curso.professor = scanner.nextLine();
        System.out.println("Carga horária");
        curso.cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Seu status no curso é");
        System.out.println("Digite o seu progresso em %");
        curso.progresso(scanner.nextInt());
        System.out.println("Digite suas 2 notas");
        curso.notas(new Double[]{scanner.nextDouble(), scanner.nextDouble() });
        curso.participacao(scanner);

    }

    private static void adicionarProfessor(Scanner scanner, Professor professor) {
        System.out.println("Digite as informações do professor");
        System.out.println("Nome");
        professor.nome = scanner.nextLine();
        System.out.println("Especialidade");
        professor.especialidade = scanner.nextLine();
    }



    private static void espacoVertical() {
        System.out.println("\n\n\n");
    }

}


