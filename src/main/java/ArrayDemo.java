import java.util.Scanner;


public class ArrayDemo {
    public static void main(String[] args) {

        int[] myNum;
        myNum = new int[10];

        myNum[0]=100;
        myNum[1]=200;
        myNum[2]=300;
        myNum[3]=400;
        myNum[4]=500;
        myNum[5]=600;
        myNum[6]=700;
        myNum[7]=800;
        myNum[8]=900;
        myNum[9]=1000;

            int indexValue = 0;
            for (int value: myNum) {
                System.out.println("Element at index " + indexValue + ":" + value);
                indexValue++;
            }

            Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            myNum[10] = scanner.nextInt();

        } catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Error, went outside memory block");
        }
    }


}
