import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        try {
            int[] myNum = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        /*System.out.println("Element at Index 0: " + myNum[0]);
        System.out.println("Element at Index 1: " + myNum[1]);
        System.out.println("Element at Index 2: " + myNum[2]);
        System.out.println("Element at Index 3: " + myNum[3]);
        System.out.println("Element at Index 4: " + myNum[4]);
        System.out.println("Element at Index 5: " + myNum[5]);
        System.out.println("Element at Index 6: " + myNum[6]);
        System.out.println("Element at Index 7: " + myNum[7]);
        System.out.println("Element at Index 8: " + myNum[8]);
        System.out.println("Element at Index 9: " + myNum[9]);
        System.out.println("Element at Index 10: " + myNum[10]);*/

            int indexValue = 0;
            for (int value : myNum) {
                System.out.println("Element at index " + indexValue + ":" + value);
                indexValue++;
            }

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number: ");
            myNum[10] = scanner.nextInt();

        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
