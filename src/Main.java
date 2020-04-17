/**
 * Class to rotate a matrix by 90 degree
 *
 * @author khnguyen
 */
public class Main {

    private char[][] matrix;

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * print 2D matrix array
     */
    public void printMatrix() {
        String result = "";
        for (char[] i : this.matrix) {
            result += "\n";
            for (char j : i) {
                result += j;
                result += " ";
            }
        }
        System.out.println(result);
    }

    /**
     * Get matrix's length
     * @return matrix dimension
     */
    public int getMatrixLength() {
        return matrix.length;
    }

    /**
     * Transpose Matrix
     * Ex:
     * |1,2,3|    |1,4,7|
     * |4,5,6| => |2,5,8|
     * |7,8,9|    |3,6,9|
     */
    public void transposeMatrix() {
        int size = getMatrixLength();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                char temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * Reverse Matrix
     * Ex:
     * |1,2,3|    |3,2,1|
     * |4,5,6| => |6,5,4|
     * |7,8,9|    |9,8,7|
     */
    public void reverseMatrix() {
        int size = getMatrixLength();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2; j++) {
                char temp = matrix[i][j];
                matrix[i][j] = matrix[i][size - j - 1];
                matrix[i][size - j - 1] = temp;
            }
        }
    }

    /**
     * Rotate matrix by 90 degree we do two step
     * First: transpose Matrix
     * Second: Reverse Matrix
     */
    public void rotateMatrixBy90Degree() {
        System.out.println("Input:");
        printMatrix();

        transposeMatrix();
        reverseMatrix();

        System.out.println("\nOutput after rotate:");
        printMatrix();
    }

    public static void main(String[] args) {
        //init matrix 4x4
        char[][] matrix = {
                {'1', '2', '3', '4'},
                {'5', '6', '7', '8'},
                {'9', '0', '1', '2'},
                {'3', '4', '5', '6'}};

        Main main = new Main();
        main.setMatrix(matrix);

        main.rotateMatrixBy90Degree();
    }

}
