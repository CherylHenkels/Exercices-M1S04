import java.util.List;
import java.util.Scanner;

public class Curso {
    // Atributos
    public String nome;
    public String descricao;
    public  String professor;
    public int cargaHoraria;

    //Metodos
    public void progresso(int pcProgresso){
        if (pcProgresso < 50){
            System.out.println("Seu progresso é " + pcProgresso + ". Vamos trabahar!");
        } else if (pcProgresso >= 50 && pcProgresso < 90){
            System.out.println("Seu progresso é " + pcProgresso + ". Já passou da metade!");
        } else if (pcProgresso >= 90 && pcProgresso < 100){
            System.out.println("Seu progresso é " + pcProgresso + ". Você está quase acabando!");
        } else if (pcProgresso == 100){
            System.out.println("Seu progresso é " + pcProgresso + ". Você finalizou o curso!");
        } else
            System.out.println("Valor inválido para progresso");
    }

    public void notas(Double[] nota){
        System.out.println("Suas notas são:");
        for(Double notasIndividuais : nota){
            System.out.println(notasIndividuais);
        }
    }

    public void participacao(Scanner scn){
        System.out.println("Dê uma nota de 0 a 10 para sua participação");
        int resposta = scn.nextInt();
        if(resposta < 7){
            System.out.println("Precisa participar mais");
        }  else if(resposta >= 7 && resposta < 9){
            System.out.println("Sua participação está razoável");
        } else if(resposta >= 9){
            System.out.println("Sua participação está excelente");
        }

    }

}
