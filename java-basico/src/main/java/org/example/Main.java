package org.example;


import org.example.Entity.User;

import java.util.Scanner;

/**
 * @autor Nicolas Bonfim Melchior
 * @version 1.0
 * @since 06/05/2024
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User usuario = new User("Nicolas Bonfim", "067-8", "1021", 237.0);


        String numeroConta = obterNumeroConta(scanner);

        if (numeroConta.equals(usuario.getNumeroConta())) {
            System.out.println("Saldo disponível: " + usuario.getSaldo());
        } else {
            System.out.println("Número da conta inválido.");
        }
    }

    public static String obterNumeroConta(Scanner scanner) {
        System.out.println("Por favor, digite o número da Conta:");
        return scanner.nextLine();
    }

}