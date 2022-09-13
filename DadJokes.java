import java.lang.Math;
import java.util.Scanner;
public class DadJokes {
    private static String[] joke;

    public static void main(String[] args) {

        //Create a new scanner object
        Scanner scanner = new Scanner(System.in);

        //Define an array that will hold twenty (20) Dad Jokes.

        //populate an array with twenty different jokes

        String[] dadJokes = new String[]{"Why don't oysters donate to charity? Because they're shellfish",
                "What do you call a fly without wings? A walk!",
                 "What's the easiest way to make a glow worm happy? Cut off its tail—it'll be delighted!",
                 "What did the custodian say when he jumped out of the closet? Supplies!",
                 "Which knight invented King Arthur's Round Table? Sir Cumference.",
                 "What does a baby computer call its father? Data.",
                 "How does a penguin build its house? Igloos it together.",
                 "What does a clock do when it's hungry? It goes back four seconds.",
                 "What did the teacher do with the student's report on cheese? She grated it.",
                 "What's the difference between a piano and a fish? You can tune a piano, but you can't tuna fish.",
                 "Why does Snoop Dogg carry an umbrella? Fo' drizzle.",
                 "What do you call a factory that sells generally decent goods? A satisfactory.",
                "Did you hear about the mediocre restaurant on the moon? It has great food but no atmosphere.",
                "What do you get a man with the heart of a lion? A lifetime ban from the zoo.",
                "What's the difference between an alligator and a crocodile? One you'll see later, the other you'll see in a while.",
                 "What do you call a person with a briefcase in a tree? A branch manager.",
                 "What do you do when you see a spaceman? Park in it, man.",
                 "Did you hear about the claustrophobic astronaut? Poor guy really needed some space.",
                 "How did Darth Vader know what Luke Skywalker got him for Christmas? He felt his presents.",
                 "Iam only familiar with 25 letters of the alphabet. I don't know why."};


    // the Dad Joke Generator
        System.out.println("Welcome to the dad joke generator!");

    //Define numeric variable
    int Dadjokes = dadJokes.length;

        System.out.println("We have " + Dadjokes + "Dad jokes available!");

    //Display count of dad jokes to the user
        System.out.println("DadJokes");

    // Define the range
    int max =20;
    int min = 0;
    int range = max - min + 1;

    // generate random numbers within 0 to 20
    int rand =(int)(Math.random() * range) + min;

    // Output is different everytime this code is executed
        System.out.println(rand);
        boolean jokes= true;
        while(jokes == true) {


            //Use a loop to get random numbers
            for (int i = 0; i < 4; i++) {
                int joke = (int) (Math.random() * range) + min;

                System.out.println(dadJokes[joke]);
            }

            System.out.println("Do you want another Joke?");
            String joke2 = scanner.next();

            //Create variable to control while loop and set variable whether user entered yes or no

            if (joke2.equals("yes")) {
                jokes = true;
            } else {
                jokes = false;
                //If the user's answer is no, thank you them and exit the program.
                System.out.println("Thank you for using the Dad Joke Generator");
                System.out.println("Have a good rest of your day");

            }
        }
    }}



