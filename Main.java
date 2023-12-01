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

        for(int i = 0; i < letters; i++){
            guess[i] = '_';
        }

        int attempts = 7;

        System.out.println(Black +"\nBienvenido al juego del ahorcado");
        
    }
}
