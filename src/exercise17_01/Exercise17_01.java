package exercise17_01;

import java.io.PrintWriter;
import java.io.File;
import java.io.*;
import java.util.Random;

public class Exercise17_01 {

    public static void main(String[] args) throws IOException {
   
        /** Create random integer generator */
        Random random = new Random();
        
        /** Create text file */
        PrintWriter output = new PrintWriter(new File("Exercise17_01.txt"));
        
        /** Fill text file with 100 random integers */
        for (int i = 1; i < 101; i++) {
            output.print(random.nextInt(100));
            output.print(" ");
        }
        output.close();
        
    }

}
