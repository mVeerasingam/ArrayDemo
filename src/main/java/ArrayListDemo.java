import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();

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
            myList.add(scanner.nextInt());
            loop(myList);

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
