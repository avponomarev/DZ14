import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {
        System.out.println("Вывод не сортированного рандомного массива:");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nОтстортированно пузырьковым методом: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}