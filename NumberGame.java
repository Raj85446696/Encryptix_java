import java.util.Random;
import java.util.Scanner;
class Game{
    static final int max_attempt = 3 ; 
    int attempt = 0 ; 
    int guess = 0 ; 
    Game(){
        Random rand = new Random(); 
        Scanner sc = new Scanner(System.in);
        //Generate random number range 1 to 100 
        int rand_num = rand.nextInt(100);
        // System.out.println(rand_num);
        System.out.print("Guess a number between 1 and 100 = ");
        int num = sc.nextInt();
        while(attempt<max_attempt){
            System.out.println("Attempt"+(attempt+1)+"/"+max_attempt+": Guess the Number (1-100)");
            
            try {
                guess = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextInt();
                continue;
            }
            attempt++;

        if(rand_num==num){
            System.out.println("Guess is Correct !");
        }else if(rand_num>num){
            System.out.println("Guess is too low");
        }else{
            System.out.println("Guess is too high");
        }
    }
    System.out.println("<-------  Sorry , You used all "+max_attempt+" attempt. The correct number was "+rand_num+"------->");

    }
}
public class NumberGame{
    public static void main(String[] args) {
        new Game(); 

    }
}