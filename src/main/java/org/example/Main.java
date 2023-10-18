package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
// Gustavo de Jesús Barroga Mathieu, matricula:2802451
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        try {
            System.out.println("Ingrese el nombre del primer perro:");
            perro1.setNombre(scanner.nextLine());
            System.out.println("Ingrese la raza del primer perro:");
            perro1.setRaza(scanner.nextLine());
            System.out.println("Ingrese la edad del primer perro:");
            perro1.setEdad(scanner.nextInt());

            scanner.nextLine(); // Limpiar el buffer

            System.out.println("Ingresar nombre del segundo perro:");
            perro2.setNombre(scanner.nextLine());
            System.out.println("Ingrese la raza del segundo perro:");
            perro2.setRaza(scanner.nextLine());
            System.out.println("Ingrese la edad del segundo perro:");
            perro2.setEdad(scanner.nextInt());

            perro1.comer("croquetas", 300);
            perro2.comer("carne", 500);

            System.out.println("El perro 1 ladra: " + perro1.ladrar());
            System.out.println("El perro 2 ladra: " + perro2.ladrar());

        } catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
}