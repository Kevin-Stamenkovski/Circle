package Circle;


import java.math.*;
import java.util.*;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        float r = input.nextInt();
        System.err.println(  (2 * (Math.PI) * r)   );
        System.err.println( (Math.PI) * (r * r) );

    }
}
