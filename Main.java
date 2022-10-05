package jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initialize();
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        String revanche = "Revanche";
        String jogador1 = getJogador("Jogador 1");
        String jogador2 = getJogador("Jogador 2");

        char[][] posicao = new char[3][3];
        int vez=0;
        do {
            repetir = false;
            posicao[0][0]='1';
            posicao[0][1]='2';
            posicao[0][2]='3';
            posicao[1][0]='4';
            posicao[1][1]='5';
            posicao[1][2]='6';
            posicao[2][0]='7';
            posicao[2][1]='8';
            posicao[2][2]='9';


            for (int i = 0; i <= 8f; i++) {
                if (vez <= 0) {
                    escolha(jogador1);
                    desenho(posicao);

                    char posicaoEscolhida = sc.next().charAt(0);
                    switch (posicaoEscolhida) {
                        case '1':
                            if (posicao[0][0] == 'X' || posicao[0][0] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[0][0] = 'X';
                            }
                            break;
                        case '2':
                            if (posicao[0][1] == 'X' || posicao[0][1] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[0][1] = 'X';
                            }
                            break;
                        case '3':
                            if (posicao[0][2] == 'X' || posicao[0][2] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[0][2] = 'X';
                            }
                            break;
                        case '4':
                            if (posicao[1][0] == 'X' || posicao[1][0] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[1][0] = 'X';
                            }
                            break;
                        case '5':
                            if (posicao[1][1] == 'X' || posicao[1][1] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[1][1] = 'X';
                            }
                            break;
                        case '6':
                            if (posicao[1][2] == 'X' || posicao[1][2] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[1][2] = 'X';
                            }
                            break;
                        case '7':
                            if (posicao[2][0] == 'X' || posicao[2][0] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[2][0] = 'X';
                            }
                            break;
                        case '8':
                            if (posicao[2][1] == 'X' || posicao[2][1] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[2][1] = 'X';
                            }
                            break;
                        case '9':
                            if (posicao[2][2] == 'X' || posicao[2][2] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez--;
                            } else {
                                posicao[2][2] = 'X';
                            }
                            break;
                        default:
                            System.out.println("Opção inválida! Escolha novamente");
                            vez--;
                            i--;
                    }

                        if (i > 3) {
                            if (posicao[0][0] == posicao[0][1] && posicao[0][0] == posicao[0][2]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[1][0] == posicao[1][1] && posicao[1][0] == posicao[1][2]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[2][0] == posicao[2][1] && posicao[2][0] == posicao[2][2]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][0] == posicao[1][0] && posicao[0][0] == posicao[2][0]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][1] == posicao[1][1] && posicao[0][1] == posicao[2][1]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][2] == posicao[1][2] && posicao[0][2] == posicao[2][2]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][0] == posicao[1][1] && posicao[0][0] == posicao[2][2]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][2] == posicao[1][1] && posicao[0][2] == posicao[2][0]) {
                                vencedor(jogador1);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            }
                        }

                        vez++;

                } else {
                    escolha(jogador2);
                    desenho(posicao);

                    char posicaoEscolhida = sc.next().charAt(0);
                    switch (posicaoEscolhida) {
                        case '1':
                            if (posicao[0][0] == 'X' || posicao[0][0] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[0][0] = 'O';
                            }
                            break;
                        case '2':
                            if (posicao[0][1] == 'X' || posicao[0][1] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[0][1] = 'O';
                            }
                            break;
                        case '3':
                            if (posicao[0][2] == 'X' || posicao[0][2] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[0][2] = 'O';
                            }
                            break;
                        case '4':
                            if (posicao[1][0] == 'X' || posicao[1][0] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[1][0] = 'O';
                            }
                            break;
                        case '5':
                            if (posicao[1][1] == 'X' || posicao[1][1] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[1][1] = 'O';
                            }
                            break;
                        case '6':
                            if (posicao[1][2] == 'X' || posicao[1][2] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[1][2] = 'O';
                            }
                            break;
                        case '7':
                            if (posicao[2][0] == 'X' || posicao[2][0] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[2][0] = 'O';
                            }
                            break;
                        case '8':
                            if (posicao[2][1] == 'X' || posicao[2][1] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[2][1] = 'O';
                            }
                            break;
                        case '9':
                            if (posicao[2][2] == 'X' || posicao[2][2] == 'O') {
                                System.out.println("Posição já ocupada!");
                                i--;
                                vez++;
                            } else {
                                posicao[2][2] = 'O';
                            }
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
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[1][0] == posicao[1][1] && posicao[1][0] == posicao[1][2]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[2][0] == posicao[2][1] && posicao[2][0] == posicao[2][2]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][0] == posicao[1][0] && posicao[0][0] == posicao[2][0]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][1] == posicao[1][1] && posicao[0][1] == posicao[2][1]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][2] == posicao[1][2] && posicao[0][2] == posicao[2][2]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][0] == posicao[1][1] && posicao[0][0] == posicao[2][2]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            } else if (posicao[0][2] == posicao[1][1] && posicao[0][2] == posicao[2][0]) {
                                vencedor(jogador2);
                                desenho(posicao);
                                repetir=repeticao(revanche);
                                break;
                            }
                        }
                        vez--;

                }
                if (i == 8) {
                    System.out.println("Deu velha!");
                    desenho(posicao);
                    repetir=repeticao("Jogar novamente");
                }
            }
        }while(repetir);

    }
    public static void initialize(){

        System.out.println("_______________");
        System.out.println("|Jogo da velha|");
        System.out.println("|_____________|");
    }

    public static String getJogador(String nome){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do " + nome + ": ");
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

        System.out.println(nome+" escolha uma posição de 1 a 9: ");
    }

    public static void vencedor(String nome){

        System.out.println(nome+" venceu!");
    }

    public static boolean repeticao(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println(a+"? (s/n)");
        String simNao = sc.nextLine();
        if(simNao.equalsIgnoreCase("S")) {
            return true;
        }
        else {
            return false;
        }
    }
}