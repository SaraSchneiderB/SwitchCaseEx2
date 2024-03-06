
/*Escreva um programa que leia um número inteiro de 1 a 12 e imprima o nome do mês
correspondente usando switch case. Por exemplo, se o número for 1, imprima “Janeiro”.*/

package com.mycompany.switchcaseex2;

import java.util.Scanner;

public class SwitchCaseEx2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número entre 1 e 12: ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1 ->
                System.out.println("Olá, você está curtindo Janeiro!");
            case 2 ->
                System.out.println("Olá, você está curtindo Fevereiro!");
            case 3 ->
                System.out.println("Olá, você está curtindo Março!");
            case 4 ->
                System.out.println("Olá, você está curtindo Abril!");
            case 5 ->
                System.out.println("Olá, você está curtindo Maio!");
            case 6 ->
                System.out.println("Olá, você está curtindo Junho!");
            case 7 ->
                System.out.println("Olá, você está curtindo Julho!");
            case 8 ->
                System.out.println("Olá, você está curtindo Agosto!");
            case 9 ->
                System.out.println("Olá, você está curtindo Setembro!");
            case 10 ->
                System.out.println("Olá, você está curtindo Outubro!");
            case 11 ->
                System.out.println("Olá, você está curtindo Novembro!");
            case 12 ->
                System.out.println("Olá, você está curtindo Dezembro!");
        }

    }
}
