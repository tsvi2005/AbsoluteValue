import java.io.OptionalDataException;
import java.util.Scanner;
// EXERCISE 3
public class AnAscendingSeries {
    public static void selectionSort (int[] array)//מיון מערך בחירה
    {
        for (int i=0; i < array.length-1; i++)
        {
            int smallest = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[smallest])
                    smallest = j;
            if (smallest != i)
            {
                int temp = array[smallest];
                array[smallest] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        final int ARRAY_SIZE = 3;
        int [] array = new int[ARRAY_SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
          System.out.println("Enter a number:");
            array[i] = scanner.nextInt();
        }
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
