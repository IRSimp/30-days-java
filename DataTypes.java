import java.io.*;
import java.util.*;

public class DataTypes {
    
    public static void main(String[] args){

        int i = 0;
        double d = 0;
        String s = "hi ";

        int ix;
        double dx;
        String sx;
        Scanner sc = new Scanner(System.in);
        ix = Integer.parseInt(sc.nextLine());
        dx = Double.parseDouble(sc.nextLine());
        sx = sc.nextLine();
        

        System.out.println(ix + i);
        System.out.println(dx + d);
        System.out.println(sx + s);

    }
}
