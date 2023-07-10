public class Main {
    public static void main(String[] args) {
        int d[][] = {{1,2,3,4},{4,5,6,5},{7,8,9,3}};
        int e[][] = {{5,8,1},{2,9,7},{6,3,2}};

        Matrix matrix1 = new Matrix(4,3);
        Matrix matrix2= new Matrix(3,5);
        matrix1.printMatrix();
        System.out.println("\n\n\n");
        matrix2.printMatrix();

        matrix1.inputMatrix(d,3,4);
        matrix2.inputMatrix(e,3,3);

        matrix1.printMatrix();
        System.out.println("\n\n\n");
        matrix2.printMatrix();
        System.out.println("\n\n\n");
        Matrix matrix3 = matrix1.add(matrix2);
        matrix3.printMatrix();
    }
}
