
public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayValueCalculator.doCals(array);
            System.out.println("Sum of values in the array : " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}