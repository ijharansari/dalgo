/* 

1   2               3   1
            =>  
3   4               4   2
8ha522

-Store first row and first column in array
-rotate last row to columdfg sdf
-for rotating second last row, re

*/
public class Rotate {

    public void rotate(int[][] matrix) {
        int tempArr[] = new int[matrix.length * matrix.length];
        int index =0;
        //converting 2d array into 1d
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                tempArr[index] = matrix[i][j];
                index++;
            }
        }

        for(int i=0; i<matrix.length; i++) {
            index = tempArr.length + i;
            for(int j=0; j<matrix.length; j++) {
                index = index - matrix.length;
                if(index >= 0) {
                    matrix[i][j] = tempArr[index];
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Rotate rotate = new Rotate();
        int matrix[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        rotate.rotate(matrix);
    }
}
