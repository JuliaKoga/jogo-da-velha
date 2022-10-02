package jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initialize();
        Scanner sc = new Scanner(System.in);
        String jogador1 = getJogador("Jogador 1");
        String jogador2 = getJogador("Jogador 2");

        char[][] posicao = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        int vez=0;

        for(int i=0;i<=8f;i++){
            if(vez<=0){
                escolha(jogador1);
                desenho(posicao);

                char posicaoEscolhida = sc.next().charAt(0);
                if(posicaoEscolhida!='X'&&posicaoEscolhida!='O') {

                    switch (posicaoEscolhida) {
                        case '1':
                            posicao[0][0] = 'X';
                            break;
                        case '2':
                            posicao[0][1] = 'X';
                            break;
                        case '3':
                            posicao[0][2] = 'X';
                            break;
                        case '4':
                            posicao[1][0] = 'X';
                            break;
                        case '5':
                            posicao[1][1] = 'X';
                            break;
                        case '6':
                            posicao[1][2] = 'X';
                            break;
                        case '7':
                            posicao[2][0] = 'X';
                            break;
                        case '8':
                            posicao[2][1] = 'X';
                            break;
                        case '9':
                            posicao[2][2] = 'X';
                            break;
                        default:
                            System.out.println("Opção inválida! Escolha novamente");
                            vez--;
                            i--;
                    }

                    if(i>4) {
                        if (posicao[0][0] == posicao[0][1] && posicao[0][0] == posicao[0][2]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[1][0] == posicao[1][1] && posicao[1][0] == posicao[1][2]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[2][0] == posicao[2][1] && posicao[2][0] == posicao[2][2]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][0] == posicao[1][0] && posicao[0][0] == posicao[2][0]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][1] == posicao[1][1] && posicao[0][1] == posicao[2][1]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][2] == posicao[1][2] && posicao[0][2] == posicao[2][2]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][0] == posicao[1][1] && posicao[0][0] == posicao[2][2]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][2] == posicao[1][1] && posicao[0][2] == posicao[2][0]) {
                            vencedor(jogador1);
                            desenho(posicao);
                            break;
                        }
                    }

                    vez++;
                }else{
                    System.out.println("posição já ocupada, escolha novamente");
                    i--;
                }

            } else {
                escolha(jogador2);
                desenho(posicao);

                char posicaoEscolhida = sc.next().charAt(0);
                if (posicaoEscolhida != 'X' && posicaoEscolhida != 'O') {

                    switch (posicaoEscolhida) {
                        case '1':
                            posicao[0][0] = 'O';
                            break;
                        case '2':
                            posicao[0][1] = 'O';
                            break;
                        case '3':
                            posicao[0][2] = 'O';
                            break;
                        case '4':
                            posicao[1][0] = 'O';
                            break;
                        case '5':
                            posicao[1][1] = 'O';
                            break;
                        case '6':
                            posicao[1][2] = 'O';
                            break;
                        case '7':
                            posicao[2][0] = 'O';
                            break;
                        case '8':
                            posicao[2][1] = 'O';
                            break;
                        case '9':
                            posicao[2][2] = 'O';
                            break;
                        default:
                            System.out.println("Opção inválida! Escolha novamente");
                            vez++;
                            i--;
                    }

                    if (i > 4) {
                        if (posicao[0][0] == posicao[0][1] && posicao[0][0] == posicao[0][2]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[1][0] == posicao[1][1] && posicao[1][0] == posicao[1][2]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[2][0] == posicao[2][1] && posicao[2][0] == posicao[2][2]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][0] == posicao[1][0] && posicao[0][0] == posicao[2][0]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][1] == posicao[1][1] && posicao[0][1] == posicao[2][1]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][2] == posicao[1][2] && posicao[0][2] == posicao[2][2]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][0] == posicao[1][1] && posicao[0][0] == posicao[2][2]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        } else if (posicao[0][2] == posicao[1][1] && posicao[0][2] == posicao[2][0]) {
                            vencedor(jogador2);
                            desenho(posicao);
                            break;
                        }
                    }
                    vez--;
                } else {
                    System.out.println("posição já ocupada, escolha novamente");
                    i--;
                }
            }
            if(i==8){
                System.out.println("Deu velha!");
                desenho(posicao);
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

    public static void desenho(char[][] posicao){

        for(int i = 0; i< posicao.length; i++){
            for(int j = 0; j< posicao.length; j++){
                if(j!=2){
                    System.out.print(posicao[i][j]+" | ");
                }else{
                    System.out.println(posicao[i][j]);
                }
            }

        }

    }

    public static void escolha(String nome){

        System.out.println(nome+" escolha uma posição de 1 a 9:");
    }

    public static void vencedor(String nome){

        System.out.println(nome+" venceu!");
    }

    /*public static void vencedor(String resultado){
        if (resultado.equals(jogador1)) {
            System.out.println(jogador1 + "venceu!");
        } else if (resultado.equals(jogador2)) {
            System.out.println(jogador2 + "venceu!");
        } else {
            System.out.println("Deu velha!");
        }*/
}
