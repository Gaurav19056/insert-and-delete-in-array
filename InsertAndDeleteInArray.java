import java.util.Arrays;

public class InsertAndDeleteInArray {
    // Inserts an element and returns the new size
    public static int insert(int[] arr, int size, int element, int index) {
        if (size >= arr.length || index < 0 || index > size) {
            return size;
        }
        // Shift elements to the right to make a hole at 'index'
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        return size + 1; // Return the new incremented size
    }

    // Deletes an element and returns the new size
    public static int delete(int[] arr, int size, int index) {
        if (index >= size || index < 0) {
            return size;
        }
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0; // Optional: clear the last element
        return size - 1; // Return the new decremented size
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
        int size = 5;

        System.out.println("Original: " + Arrays.toString(arr));

        size = insert(arr, size, 99, 2); // Insert 99 at index 2
        System.out.println("After Insert: " + Arrays.toString(arr));

        size = delete(arr, size, 3); // Delete element at index 3
        System.out.println("After Delete: " + Arrays.toString(arr));
    }
}