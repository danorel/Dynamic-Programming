import examples.CheapestPath;
import examples.LadderCost;
import examples.OperationsCalculator;

public class App {
    public static void main(String[] args) {
        System.out.println(
                "General minimizing cost to the last ladder equals " +
                LadderCost.calculate(
                        new double[6],
                        6
                )
        );
        System.out.println(
                "General minimum code per transform equals " +
                OperationsCalculator.calculate(
                        17
                )
        );
        System.out.println(
                "General minimum kilogram cost to pass through matrix equals " +
                 CheapestPath.calculate(
                         7,
                         7
                 )
        );
    }
}
