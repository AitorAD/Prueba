import java.util.Scanner;

public class PrincipalAitor {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        menu();
    }

    public static void menu(){
        int opcion;
        do {
            menuString();
            opcion = validaInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> ej1();
                case 2 -> ej2();
                case 3 -> ej3();
                case 4 -> ej4();
                case 5 -> ej5();
                case 6 -> System.out.println("Saliendo...");
                default -> System.err.println("Error. Introduce una opcion valida");
            }
        } while (opcion != 6);
    }

    public static void menuString(){
        System.out.println("----------> MENU <----------");
        System.out.println("Selecciona un ejercicio");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Salir");
    }

    public static int validaInt(){
        int opcion;
        while (!sc.hasNextInt()) {
            System.err.println("Error. Introduce un numero entero");
            sc.nextLine();
        }
        return sc.nextInt();
    }
/*
1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
palabra de la cadena en una línea distinta.
 */
    public static void ej1(){
        System.out.println("----------> EJERCICIO 1 <----------");

        String cad;

        System.out.println("Introduce una cadena de texto");
        cad = sc.nextLine();

        String palabras[] = cad.split("\s");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
/*
2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */
    public static void ej2(){
        System.out.println("----------> EJERCICIO 2 <----------");
        String cad1, cad2;

        System.out.println("Introduce una cadena de texto");
        cad1 = sc.nextLine();
        System.out.println("Introduce otra cadena de texto");
        cad2 = sc.nextLine();

        System.out.println("\nDiferenciando mayusculas y minusculas");
        if (cad1.equals(cad2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO son iguales");
        }

        System.out.println("\nSin diferenciar mayusculas y minusculas");
        if (cad1.equalsIgnoreCase(cad2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO son iguales");
        }
    }
/*
3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo, si se
introduce “Alberto”, “Alemany” y “Navarro” mostrará “ALBALENAV”.
 */
    public static void ej3(){
        System.out.println("----------> EJERCICIO 3 <----------");

        String nombre, ap1, ap2, user;
        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce tu primer apellido");
        ap1 = sc.nextLine();
        System.out.println("Introduce tu segundo apellido");
        ap2 = sc.nextLine();

        nombre = nombre.substring(0, 3);
        ap1 = ap1.substring(0, 3);
        ap2 = ap2.substring(0, 3);

        user = nombre + ap1 + ap2;

        user = user.toUpperCase();

        System.out.println("Tu usuario es: " + user);
    }
/*
4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me
mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
 */
    public static void ej4(){
        System.out.println("----------> EJERCICIO 4 <----------");
        String frase;
        int a=0, e=0, i=0, o=0, u=0;

        System.out.println("Introduce una frase");
        frase = sc.nextLine();

        frase = frase.toLowerCase();

        for (int j = 0; j < frase.length(); j++) {
            switch (frase.charAt(j)) {
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }
        }
        System.out.println("\nNumero total de cada vocal");
        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);
    }
/*
5. Realiza un programa que lea una frase por teclado e indique si la frase es un
palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y
minúsculas). Supondremos que el usuario solo introducirá letras y espacios (ni
comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee igual de
izquierda a derecha que de derecha a izquierda.
Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama

 */
    public static void ej5(){
        System.out.println("----------> EJERCICIO 5 <----------");
        String frase, inverse="";

        System.out.println("Introduce una frase");
        frase = sc.nextLine(); // Amigo no gima

        frase = frase.toLowerCase(); // amigo no gima

        frase = frase.replace("\s", ""); // amigonogima

        for (int i = (frase.length() - 1); i >= 0; i--) {
            inverse = inverse + frase.charAt(i);
        }
        if (frase.equals(inverse)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}