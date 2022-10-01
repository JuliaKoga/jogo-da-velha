package jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initialize();
        String jogador1 = getJogador("Jogador 1");
        String jogador2 = getJogador("Jogador 2");

        String[][] posicao = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        for(int i=0;i<posicao.length;i++){
            for(int j=0;j< posicao.length;j++){
                if(j!=2){
                    System.out.print(posicao[i][j]+"|");
                }else{
                    System.out.println(posicao[i][j]);
                }
            }

        }

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

}
