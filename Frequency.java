//Bryan Jaquith.
//Math to machine learning. 
import java.io.*;


public class Frequency{

  public static void main(String[] args) throws IOException {
    //Direct path to the File
    File textFile = new File("C:\\JavaLearning\\FileEnglish.txt");
    BufferedReader in = new BufferedReader (new FileReader (textFile));
    System.out.println("Letter Frequency of the File\n");

    int nextChar;
    char ch;
    int total = 0;
    //Goes through the file and picks out each Letter
    int[] count = new int[26];
    while ((nextChar = in.read()) != -1) {
      ch = ((char) nextChar);
      if(ch >= 'a' && ch <= 'z'){
        count[ch - 'a']++;
      }
      if(ch >= 'A' && ch <= 'Z'){
        count[ch - 'A']++;
      }
    }
    //Adds counts to the Letter
    System.out.println("Characters listed below and their # of appearances in the file.\n");
    for (int i = 0; i < count.length; i++) {
      System.out.printf("%c %d", i + 'A', count[i]);
      System.out.println();
      total += count[i];
    }   
    System.out.println("\nTotal number of characters in file: " + total + "\n");
    //Gives the probability of the letter in the file
    System.out.println("Probability of each character appearing listed below rounded to two decimal places of accuracy: " + "\n");
    for(int i = 0; i < count.length; i++){
      System.out.print((char)(i + 'A') + " ");
      double unroundedNumber = (double)count[i] / total;
      System.out.println(unroundedNumber);
    }

    in.close();
  }
}
