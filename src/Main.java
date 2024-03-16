import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figuEleg, operation;
        double resul, rad, diame, lad, alt, base, lad1, lad2, lad3, semiPeri, longi, anch;
        int contador = 0;

        while (contador < 10) {
            System.out.println("\nCalculadora Geométrica");
            System.out.println("Por favor, elige una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.print("Ingresa el número de tu elección: ");

            try {
                figuEleg = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: ingrese una opción válida.");
                scanner.next();
                continue;
            }

            System.out.println("Choose an operation:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Ingresa el número de tu elección: ");

            try {
                operation = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: ingrese una opción válida.");
                scanner.next();
                continue;
            }

            resul = 0;
            switch (figuEleg) {
                case 1:
                    if (operation == 1) {

                        System.out.print("Ingresa el radio del círculo: ");
                        rad = scanner.nextDouble();
                        resul = 3.1416 * rad * rad;

                        System.out.println("\nEl área del círculo es: " + resul);
                    } else {
                        System.out.print("Ingresa el diámetro del círculo: ");
                        diame = scanner.nextDouble();
                        resul = 3.1416 * diame;

                        System.out.println("\nEl perímetro del círculo es: " + resul * 2);
                    }
                    break;
                case 2:
                    if (operation == 1) {

                        System.out.print("Ingresa la longitud del lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        resul = lado * lado;

                        System.out.println("\nEl área del cuadrado es: " + resul);
                    } else {
                        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        resul = 4 * lado;

                        System.out.println("\nEl perímetro del cuadrado es: " + resul);
                    }
                    break;
                case 3:
                    if (operation == 1) {

                        System.out.print("Ingresa la base y la altura del triángulo (separados por un espacio): ");
                        base = scanner.nextDouble();
                        alt = scanner.nextDouble();
                        resul = 0.5 * base * alt;
                        System.out.println("\nEl área del triángulo es: " + resul);
                    } else {
                        System.out.print("Ingresa la longitud de los tres lados del triángulo (separados por un espacio): ");
                        lad1 = scanner.nextDouble();
                        lad2 = scanner.nextDouble();
                        lad3 = scanner.nextDouble();
                        semiPeri = (lad1 + lad2 + lad3) / 2;
                        resul = lad1 + lad2 + lad3;

                        System.out.println("\nEl perímetro del triángulo es: " + resul);
                    }
                    break;
                case 4:
                    if (operation == 1) {

                        System.out.print("Ingresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                        longi = scanner.nextDouble();
                        anch = scanner.nextDouble();
                        resul = longi * anch;
                        System.out.println("\nEl área del rectángulo es: " + resul);

                    } else {

                        System.out.print("Ingresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                        longi = scanner.nextDouble();
                        anch = scanner.nextDouble();
                        resul = 2 * (longi + anch);
                        System.out.println("\nEl perímetro del rectángulo es: " + resul);
                    }
                    break;
                case 5:

                    if (operation == 1) {
                        System.out.print("Ingresa la longitud de un lado del pentágono: ");
                        lad = scanner.nextDouble();
                        resul = 0.5 * lad * lad * (2.2361 + 5) * 0.2;
                        System.out.println("\nEl área del pentágono es: " + resul);

                    } else {

                        System.out.print("Ingresa la longitud de un lado del pentágono: ");
                        lad = scanner.nextDouble();
                        resul = 5 * lad;
                        System.out.println("\nEl perímetro del pentágono es: " + resul);
                        break;
                    }
            }
        }

    }
}