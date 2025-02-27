package com.programando.calculadora;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        while (true) {
            int opcao = exibirMenu();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            int[] numeros = obterNumeros();
            executarOperacao(opcao, numeros[0], numeros[1]);
        }

        scanner.close();
    }

    private static int exibirMenu() {
        System.out.println("\n===== Calculadora =====");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private static int[] obterNumeros() {
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        return new int[]{num1, num2};
    }

    private static void executarOperacao(int opcao, int num1, int num2) {
        try {
            double resultado;
            switch (opcao) {
                case 1 -> resultado = calculadora.somar(num1, num2);
                case 2 -> resultado = calculadora.subtrair(num1, num2);
                case 3 -> resultado = calculadora.multiplicar(num1, num2);
                case 4 -> resultado = calculadora.dividir(num1, num2);
                default -> {
                    System.out.println("Opção inválida!");
                    return;
                }
            }
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
