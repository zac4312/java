import java.util.Scanner;

public class proj2 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
                
        System.out.println("Enter the word to be guessed: ");
        String wordToGuess = Obj.nextLine().toLowerCase();  

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("enter clue:");
            String clue = Obj.nextLine();
                System.out.println(clue);
  
        char[] guessedWord = new char[wordToGuess.length()];
        boolean[] guessedLetters = new boolean[wordToGuess.length()];
        int attempts = 3;  
        boolean wordGuessed = false;


      for (int i = 0; i < wordToGuess.length(); i++) {
          guessedWord[i] = '_';
      }

      // Game loop
      while (attempts < 0 || !wordGuessed) {
          System.out.println("\nWord to guess: ");
          for (char c : guessedWord) {
              System.out.print(c + " ");
          }

          System.out.println("\nAttempts left: " + attempts);
          System.out.print("Enter a letter: ");
          char guess = Obj.nextLine().toLowerCase().charAt(0);

          boolean correctGuess = false;


          for (int i = 0; i < wordToGuess.length(); i++) {
              if (wordToGuess.charAt(i) == guess && !guessedLetters[i]) {
                  guessedWord[i] = guess;
                  guessedLetters[i] = true;
                  correctGuess = true;
              }
          }

          if (!correctGuess) {
              System.out.println("Wrong guess!");
              attempts--;
          } else {
              System.out.println("Good guess!");
          }

          wordGuessed = true;
          for (char c : guessedWord) {
              if (c == '_') {
                  wordGuessed = false;
                  break;
              }
          }
      }

      if (wordGuessed) {
          System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
      } else {
          System.out.println("\nGame Over! The word was: " + wordToGuess);
      }

      Obj.close();

       
}
  } 
  
  