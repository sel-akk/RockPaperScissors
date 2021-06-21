import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //random int 0, 1 or 2
        //0: rock
        //1: paper
        //2: scissors
        int num = rand.nextInt(3);

        System.out.println("ROCK PAPER SCISSORS!");
        System.out.println("Enter your choice (lowercase only): ");
        String obj = scan.nextLine();

        scan.close();


        //rock
        if(obj.equals("rock") && num == 0){
            System.out.println("ROCK VS ROCK, TRY AGAIN");

        }

        else if(obj.equals("rock") && num == 1){
            System.out.println("ROCK VS PAPER, THE COMPUTER WINS!");

        }

        else if(obj.equals("rock") && num == 2){
            System.out.println("ROCK VS SCISSORS, YOU WIN!");
        }

        //PAPER
        if(obj.equals("paper") && num == 0){
            System.out.println("PAPER VS ROCK, YOU WIN!");

        }

        else if(obj.equals("paper") && num == 1){
            System.out.println("PAPER VS PAPER, TRY AGAIN!");

        }

        else if(obj == "paper" && num == 2){
            System.out.println("PAPER VS SCISSORS, THE COMPUTER WINS!");
        }

        //SCISSORS
        if(obj.equals("scissors") && num == 0){
            System.out.println("SCISSORS VS ROCK, THE COMPUTER WINS!");
        }

        else if(obj.equals("scissors") && num == 1){
            System.out.println("SCISSORS VS PAPER, YOU WIN!");
        }

        else if(obj.equals("scissors") && num == 2){
            System.out.println("SCISSORS VS SCISSORS, TRY AGAIN!");
        }




    }
}
