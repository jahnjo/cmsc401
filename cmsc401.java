//Student Name: John Foster

import java.util.Scanner;
import java.util.Vector;

public class cmsc401{
    public static void main(String[] args) {
        int numIntegers = 0;
        Vector<Integer> input = new Vector<>();
        Vector<Integer> output = new Vector<>();

        Scanner sc = new Scanner(System.in);

        int numLines = sc.nextInt();

        for(int i = 0; i < numLines; i++) {
            numIntegers = sc.nextInt();
            for(int j = 0; j < numIntegers; j++) {              
                input.add(sc.nextInt());
            }
            output.add(input.get(input.get(input.size() - 1) - 1) * input.get(input.get(input.size() - 2) - 1));
            input.clear();
        }
        int outputSize = output.size();

        for(int i = 0; i < outputSize; i++) {
            System.out.println(output.firstElement());
            output.remove(output.firstElement()); 
        }    
    }
}