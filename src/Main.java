
public class Main {
    public static void main(String[] args) {
        String[][] inputValues =
                {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayValueCalculator.doCals(inputValues);
            System.out.println("Sum of matrix values  : " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}