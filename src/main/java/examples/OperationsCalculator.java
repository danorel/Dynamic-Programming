package examples;

public class OperationsCalculator {
    public static String calculate(
            int N
    ) {
        return calculate(
                1,
                N
        );
    }

    public static String calculate(
            int starter,
            int N
    ) {
        StringBuilder operations = new StringBuilder();
        /*
            Initialize the array of number calculation
         */
        int[] operators = new int[N + 1];
        operators[0] = starter;
        operators[1] = starter + 1;
        /*
            minimum - the minimum value of operators
         */
        int   minimum   = 0;
        for(int index = 2; index < N + 1; ++index) {
            minimum = operators[index - 1] + 1;
            if(index % 2 == 0)
                minimum = Math.min(minimum, operators[index / 2] + 1);
            if(index % 3 == 0)
                minimum = Math.min(minimum, operators[index / 3] + 1);
            operators[index] = minimum;
        }
        /*
            Print the output code
         */
        int index = N;
        while(index > 1){
            if(operators[index] == operators[index - 1] + 1){
                operations
                        .append("1");
                index--;
            } else if(index % 2 == 0 && operators[index] == operators[index / 2] + 1){
                operations
                        .append("2");
                index /= 2;
            } else {
                operations
                        .append("3");
                index /= 3;
            }
        }
        return operations.toString();
    }

}
