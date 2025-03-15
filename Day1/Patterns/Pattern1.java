
public class Pattern1 {
    public static void main(String args[]) {

        int numOfRows = 4;
        int numOfCols = 5;

        for (int row = 1; row <= numOfRows; row++) {

            for (int col = 1; col <= 5; col++) {

                if (row == 1 || col == 1 || row == numOfRows || col == numOfCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}