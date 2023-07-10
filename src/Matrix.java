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
}
