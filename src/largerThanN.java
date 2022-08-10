
import java.util.ArrayList;
import java.util.Scanner;

public class largerThanN {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to compare with.");
        int number = scan.nextInt();
        System.out.println("Enter limitation number of array.");
        int limitation = scan.nextInt();
        int[] array = new int[limitation];

        for(int c = 0; c<array.length; c++) {
            System.out.println("Enter value "+ c);
            array[c] = scan.nextInt();
        }

        System.out.println("These are the number greater than: "+number);
        display(array,number);


    }

    public static void display(int[] array, int numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            if (i > numbers) {
                arrayList.add(i);
            }
        }

        for(int disp: arrayList) {
            System.out.println(disp);
        }

    }
}
