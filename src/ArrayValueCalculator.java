import java.util.Arrays;

public class ArrayValueCalculator {
    public static int doCals(String[][] values) throws ArraySizeException, ArrayDataException {
        if (values.length != 4 ||
                Arrays.stream(values).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Invalid matrix size.");
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    throw new
                            ArrayDataException("Invalid data at position [ " + i + "] [ " + j + " ] ");

                }
            }
        }
        return sum;
    }
}
