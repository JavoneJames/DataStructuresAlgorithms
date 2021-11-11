import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] arrayOfNumbers = new int[10];
    for (int i = 0; i < arrayOfNumbers.length; i++) {
      arrayOfNumbers[i] = random.nextInt(100) + 1;
    }
    System.out.println(Arrays.toString(arrayOfNumbers));
    insertionSort(arrayOfNumbers);
    System.out.println(Arrays.toString(arrayOfNumbers));
  }

  private static void insertionSort(int[] arrayOfNumbers) {
    if (arrayOfNumbers.length <= 1)return;;
    for (int i = 1; i < arrayOfNumbers.length; i++) {
        int current = arrayOfNumbers[i];
        int j = i - 1;
        while (j >= 0 && arrayOfNumbers[j] > current){
          arrayOfNumbers[j + 1] = arrayOfNumbers[j];
          j--;
        }
        arrayOfNumbers[j + 1] = current;
    }
  }

}
