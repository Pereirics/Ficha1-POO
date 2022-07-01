package main;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicios {

    public static double celsiusParaFarenheit (double graus) {
        return graus*1.8 + 32;
    }

    public static int maximoNumeros (int a, int b) {
        return Math.max(a, b);
    }

    public static String criaDescricaoConta (String nome, double saldo) {
        return (nome + ": " + saldo);
    }

    public static double eurosParaLibras (double valor, double taxaConversao) {
        return valor*taxaConversao;
    }

    public static void mediaNumeros () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int menor = Math.min(a, b);
        double media = ((double)a + (double)b) / 2;
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }

    public static long factorial (int num) {
        int result = num;
        while (num != 1) {
            result *= num-1;
            num--;
        }
        return result;
    }

    public long tempoGasto() {
        LocalDateTime antes = LocalDateTime.now();
        factorial(5000);
        LocalDateTime depois = LocalDateTime.now();
        //LocalDateTime.minus(depois, antes); Só comparar as datas
        return 1;
    }
}
