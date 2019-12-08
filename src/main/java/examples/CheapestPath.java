package examples;

public class CheapestPath {
    public static int calculate(
            int rows,
            int cols) {
        /*
            Define the minimum and maximum cost values
         */
        int
                min = 0,
                max = 10;
        int[][] costMatrix = new int[rows][cols];
        /*
            Initialization each position with its cost and visualize it
         */
        System.out.println("Starter matrix view: ");
        for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
                costMatrix[row][col] = (int)(min + Math.random() * (max - min));
                System.out.print(
                        costMatrix[row][col] +
                        " ");
            }
            System.out.println();
        }
        return calculate(
                costMatrix,
                rows,
                cols
        );
    }

    public static int calculate(
            int[][] costMatrix,
            int     rows,
            int     cols) {
        for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
                if(row - 1 < 0 && col - 1 < 0){
                    continue;
                }
                if(row - 1 < 0) {
                    costMatrix[row][col] += Math.min(
                            Integer.MAX_VALUE,
                            costMatrix[row][col - 1]
                    );
                } else if(col - 1 < 0) {
                    costMatrix[row][col] += Math.min(
                            costMatrix[row - 1][col],
                            Integer.MAX_VALUE
                    );
                } else {
                    costMatrix[row][col] += Math.min(
                            costMatrix[row - 1][col],
                            costMatrix[row][col - 1]
                    );
                }
            }
        }
        System.out.println("Matrix cost view: ");
        for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
                System.out.print(
                        costMatrix[row][col] +
                        " ");
            }
            System.out.println();
        }
        return costMatrix[rows - 1][cols - 1];
    }
}
