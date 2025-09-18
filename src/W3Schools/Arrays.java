package W3Schools;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Value in array: " + cars[i]);
        }

        for (int element : numbers) {
            System.out.print(element + "value is");
        }

    }
}
