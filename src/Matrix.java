public class Matrix {
    private int row;
    private int col;

    private int data[][];
    public Matrix(){
        row = col = 0;
    }
    public Matrix(int row,int col){
        this.row = row;
        this.col = col;
        data = new int[row][col];
    }
    public void printMatrix(){
        for (int i=0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }

    public Matrix add(Matrix matrix){
        Matrix result;
        if(this.row == matrix.row && this.col == matrix.col){
            result = new Matrix(row,col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result.data[i][j] = this.data[i][j] + matrix.data[i][j];
                }
            }

        }
        else{
            System.out.println("Matrix -- Addition of two matrices " +
                    "is not possible because there order is not same");
        }
        return result;
    }
}
