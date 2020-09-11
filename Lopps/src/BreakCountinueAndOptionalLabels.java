public class BreakCountinueAndOptionalLabels {

    public static void main(String[] args) {

        // break statement stop the loop

        int[][] array = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};

        end:
        for (int row = 0; row < array.length ; row++) {
            for (int col = 0; col < array[row].length; col++) {

                if (array[row][col] == 0 ){

                    break end;
                }

                System.out.println("break when meet ZERO " + array[row][col]);

            }

        }

        // continue statement skip and keep the loop moving

        int[][] array1 = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};

        end:
        for (int row = 0; row < array1.length ; row++) {
            for (int col = 0; col < array1[row].length; col++) {

                if (array1[row][col] == 0 ){

                    continue end;
                }

                System.out.println("skip and continue when meet ZERO " + array[row][col]);

            }

        }

    }
}
