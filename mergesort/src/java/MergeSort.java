import java.util.Arrays;
import java.util.Random;

public class MergeSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] arr = new int[11];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    System.out.println(Arrays.toString(arr));
    int[] result = mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static int[] mergeSort(int[] arr) {
    if (arr.length <= 1) return arr;
    int midIndex = arr.length / 2;
    int[] leftArray = new int[midIndex];
    int[] rightArray = new int[arr.length - midIndex];
    for (int i = 0; i < midIndex; i++) {
      leftArray[i] = arr[i];
    }
    for (int i = midIndex; i < arr.length; i++) {
      rightArray[i - midIndex] = arr[i];
    }
    mergeSort(leftArray);
    mergeSort(rightArray);
    return mergeTogether(arr, leftArray, rightArray);
  }

  private static int[] mergeTogether(int[] array, int[] leftArray,
                                     int[] rightArray) {

    int left = 0, right = 0, index = 0;
    while (left < leftArray.length && right < rightArray.length) {
      if (leftArray[left] < rightArray[right]) {
        array[index] = leftArray[left];
        left++;
      } else {
        array[index] = rightArray[right];
        right++;
      }
      index++;
    }
    while (left < leftArray.length) {
      array[index] = leftArray[left];
      left++;
      index++;
    }
    while (right < rightArray.length) {
      array[index] = rightArray[right];
      right++;
      index++;
    }
    return array;
  }


}
