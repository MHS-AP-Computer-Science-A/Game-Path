public class GamePathTester {
 public static void main(String[] args)
    {
        // Create the example grid from the problem
        String[][] data = {
            {"SE","SE","NE","NW","NW","SW","SE"},
            {"NE","SE","NE","SE","NE","SE","NE"},
            {"NW","NW","NE","NW","SE","SW","SE"},
            {"SE","SW","SE","SW","NE","SW","NW"},
            {"SW","NE","NW","NE","SE","NE","SW"}
        };

        GameGrid grid = new GameGrid(data);


        int result1 = grid.navigate(0, 0);
        System.out.println("Start at (0,0)");
        System.out.println("Expected: 7");
        System.out.println("Your result: " + result1);
        System.out.println();

        int result2 = grid.navigate(2, 1);
        System.out.println("Start at (2,1)");
        System.out.println("Expected: 5");
        System.out.println("Your result: " + result2);
        System.out.println();


        // Edge start near bottom-left
        int result3 = grid.navigate(4, 0);
        System.out.println("Start at (4,0)");
        System.out.println("Expected: 1");
        System.out.println("Your result: " + result3);
        System.out.println();

        // Edge start near top-right
        int result4 = grid.navigate(3, 1);
        System.out.println("Start at (3,1)");
        System.out.println("Expected: 2");
        System.out.println("Your result: " + result4);
        System.out.println();

        // Middle start
        int result5 = grid.navigate(3, 3);
        System.out.println("Start at (3,3)");
        System.out.println("Expected: 4");
        System.out.println("Your result: " + result5);
        System.out.println();


        System.out.println("===== DONE =====");
    }
}

