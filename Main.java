package jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initialize();
        String jogador1 = getJogador("Jogador 1");
        String jogador2 = getJogador("Jogador 2");

        desenho();

    }

    public static void initialize(){
        System.out.println("_______________");
        System.out.println("|Jogo da velha|");
        System.out.println("|_____________|");
    }

    public static String getJogador(String nome){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do " + nome);
        return sc.nextLine();

    }

    public static void desenho(){
        String[][] desenho = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        for(int i = 0; i< desenho.length; i++){
            for(int j = 0; j< desenho.length; j++){
                if(j!=2){
                    System.out.print(desenho[i][j]+" | ");
                }else{
                    System.out.println(desenho[i][j]);
                }
            }

        }

    }

}
