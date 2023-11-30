import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        //Numero aleatorio de 1 a 10
        int randomIndex = rand.nextInt(10);
        String[] words = {"objetos", "datos", "analisis", "gestion", "interfaz", "diseño", "programacion", "bases", "proyectos"};

        String word = words[randomIndex];
        int letters = word.length();

        char[] guess = new char[letters];

    }



    }
