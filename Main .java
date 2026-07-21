import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int n = arr.length;

        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[index] = arr[left] * arr[left];
                left++;
            } else {
                result[index] = arr[right] * arr[right];
                right--;
            }
            index--;
        }

        System.out.println(Arrays.toString(result));
    }
}