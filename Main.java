import java.util.Scanner;
import java.util.Random;

public class Main {

    public  static final String Blue = "\33[94m";
    public  static final String Black = "\33[90m";
    public  static final String Red = "\33[91m";
    public  static final String Green = "\33[92m";
    public  static final String Reset = "\33[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        //Numero aleatorio de 1 a 10
        int randomIndex = rand.nextInt(10);
        String[] words = {"objetos", "datos", "analisis", "gestion", "interfaz", "diseño", "programacion", "bases", "proyectos"};

        String word = words[randomIndex];
        int letters = word.length();

        char[] guess = new char[letters];

        for (int i = 0; i < letters; i++) {
            guess[i] = '_';
        }

        int attempts = 7;
        System.out.println(Black + "\nBienvenido al juego del ahorcado");

        while (true) {
            System.out.println(Black + "\nIntentos restantes: " + Reset + attempts);
            System.out.println(Blue + "La palabra a adivinar es: " + Reset + new String(guess));
            System.out.print(Blue + "\nIngresa una letra: " + Reset);

            char userInput = sc.next().charAt(0);
            userInput = Character.toLowerCase(userInput);
            boolean found = false;

            for (int i = 0; i < letters; i++) {
                if (word.charAt(i) == userInput) {
                    if (i == 0) {
                        guess[i] = Character.toUpperCase(userInput);
                    } else {
                        guess[i] = userInput;
                    }
                    found = true;
                }
            }

            if (!found) {

                switch (attempts) {
                    case 7:
                        System.out.println(Black + "\nAhorcado\n--|\n|");
                        break;
                    case 6:
                        System.out.println(Black + "\nAhorcado\n--|\n| O");
                        break;
                    case 5:
                        System.out.println(Black + "\nAhorcado\n--|\n| O \n /");
                        break;
                    case 4:
                        System.out.println(Black + "\nAhorcado\n--|\n| O \n /|");
                        break;
                    case 3:
                        System.out.println(Black + "\nAhorcado\n--|\n| O \n /|\\");
                        break;
                    case 2:
                        System.out.println(Black + "\nAhorcado\n--|\n| O \n /|\\\n / ");
                        break;
                    case 1:
                        System.out.println(Black + "\nAhorcado\n--|\n| O \n /|\\\n / \\");
                        break;
                }
                attempts--;
            }
            String correct = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            if (attempts <= 0) {
                System.out.println(Red + "\nPerdiste!! La palabra completa era: " + Reset + correct);
                break;
            } else if (new String(guess).equals(correct)) {
                System.out.println(Green + "\nGanaste!! La palabra completa es: " + Reset + correct);
                break;
            }
        }
    }
}
