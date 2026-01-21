import java.io.*;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args){

        Scanner locSc = new Scanner(System.in);

        String inputString = locSc.nextLine();
        
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
    
}