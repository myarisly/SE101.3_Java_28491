public class ArrayOutOfBoundsHandling {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            int index = 10; // Change this value to test different indices
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. The array does not have an element at the specified index.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        }
    }
}
