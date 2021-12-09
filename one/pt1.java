package one;

import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String args[]) throws FileNotFoundException {
        FileInputStream fstream = new FileInputStream("p1input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int number;
        int[] numbers;

        try {
            while ((strLine = br.readLine()) != null)   {
                try {
                    number = Integer.parseInt(strLine);
                    numbers = Arrays.copyOf(numbers, numbers.length + 1);
                    numbers[numbers.length - 1 ] = number;
                 }
                 catch (NumberFormatException e)
                 {
                    number = 0;
                 }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
