package org.example;

import java.util.Scanner;

public class pareimpa {
    public static void verificar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero para saber se é par ou impa");
        int num = scanner.nextInt();

        if (num / 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("impar");

        }
        scanner.close();
    }
}

