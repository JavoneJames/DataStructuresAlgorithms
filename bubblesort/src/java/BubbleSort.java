import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] arrayOfNumbers = new int[10];
    //add random numbers generated to the array
    for (int i = 0; i < arrayOfNumbers.length; i++) {
      arrayOfNumbers[i] = random.nextInt(100) + 1;
    }
    System.out.println(Arrays.toString(arrayOfNumbers));
    bubbleSort(arrayOfNumbers);
    System.out.println(Arrays.toString(arrayOfNumbers));
  }
  //loops through the array and check if the left index of an adjacent pair
  // is smaller than the right index
  private static void bubbleSort(int[] arrayOfNumbers) {
    if (arrayOfNumbers.length <= 1) return;
    for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
      if (arrayOfNumbers[i] > arrayOfNumbers[i + 1]) {
        swapNumbers(arrayOfNumbers, i);
      }
    }
  }

  private static void swapNumbers(int[] arrayOfNumbers, int i) {
    int temp = arrayOfNumbers[i];
    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
    arrayOfNumbers[i + 1] = temp;
  }
}
