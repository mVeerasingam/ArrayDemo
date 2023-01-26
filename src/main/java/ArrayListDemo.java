import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        int[] myNum;
        myNum = new int[10];

        /*myNum[0]=100;
        myNum[1]=200;
        myNum[2]=300;
        myNum[3]=400;
        myNum[4]=500;
        myNum[5]=600;
        myNum[6]=700;
        myNum[7]=800;
        myNum[8]=900;
        myNum[9]=1000;*/


        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        loop(myList);

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            myNum[10] = scanner.nextInt();

        } catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Error, went outside memory block");
        }
    }

    public static void loop(ArrayList<Integer>someArrayList)
    {
        int indexValue = 0;
        for (int value: someArrayList) {
            System.out.println("Element at index " + indexValue + ":" + value);
            indexValue++;
        }

    }

}
