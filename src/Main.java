import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList para armazenar lista de cursos e professores.
        List<String> cursosProfessores = new ArrayList<>();

        String itemLista = "start";


        //laço de repetição
        while (true){
           System.out.println("Digite um curso/professor ou digite [0] caso queira sair: ");
            itemLista = scanner.next();
            if(itemLista.equals("0")){
                break;
            } else{
                adicionarCursoProfessor(itemLista,  cursosProfessores);
            }
       }
        listarCursosProfessores(cursosProfessores);
        }


     //FUNÇÕES

    //Adicionar curso/professores na lista
    private static void adicionarCursoProfessor(String item, List<String> cursosProfessores){
        cursosProfessores.add(item);
    }

    // Listar os cursos/professores inseridos
    private static void listarCursosProfessores(List<String> cursosProfessores){
        System.out.println("\nSua lista de cursos/professores é:");
        for(String numeroCurso: cursosProfessores){
            System.out.println(numeroCurso);
        }
    }
}