package examples;

public class LadderCost {
    public static double calculate(
            double[] costs,
            int      length
    ) {
        return calculate(
                costs,
                length,
                0,
                10
        );
    }

    public static double calculate(
            double[] costs,
            int      length,
            double   min,
            double   max
    ) {
        /*
            Initialize first two values of the costs array.
            Output starter steps!
         */
        System.out.println("Initialization of costs array...");
        for(int level = 0; level < length; ++level) {
            costs[level] = min + Math.random() * (max - min);
            System.out.println(
                    new StringBuilder()
                        .append("Cost of level #")
                        .append(level + 1)
                        .append(" equals ")
                        .append(costs[level])
            );
        }
        System.out.println();
        for(int level = 2; level < length; ++level) {
            costs[level] += Math.min(
                    costs[level - 1],
                    costs[level - 2]);
            System.out.println(
                    new StringBuilder()
                            .append("New cost per level ")
                            .append(level + 1)
                            .append(" equals ")
                            .append(costs[level])
            );
        }
        return costs[length - 1];
    }
}

