package codeSignal;

public class Matrix {
    public static void main(String[] arg) {
        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[i].length; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
        int cost = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    break;
                }
                cost += matrix[j][i];
            }
        }
//        return cost;
        System.out.println(cost);
    }
}