package DAA;

public class graph {
    public static void addedge(int [][] mat,int i,int j) {
        mat[i][j] = 1;
        mat[j][i] = 1;

    }

    public static void displayMatrix(int [][] mat) {
        for(int[] row: mat) {
            for(int val: row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int [][] mat = new int[V][V];

        addedge(mat, 0, 1);
        addedge(mat, 0, 2);
        addedge(mat, 1, 2);
        addedge(mat, 2, 3);

        System.out.println("Adjency Matrix representation");
        displayMatrix(mat);
    }
}
