public class ArrayValueCalculator {
    public static int doCals(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Input array must be 4x4 in size.");
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new
                            ArrayDataException("Invalid data at position ( "
                            + i + " , " + j + " ) : " + array[i][j], e);
                }
            }
        }
        return sum;
    }
}
