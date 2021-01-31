public class TableActions {

    public static int returnTableWithBiggestSum(int[][] tableA, int[][] tableB){

        return Math.max(countTableSum(tableA),countTableSum(tableB));

    }


    private static int countTableSum(int[][] table){
        int sum = 0;
        for (int[] ints : table) {
            for (int anInt : ints) {
                sum += anInt;
            }

        }

        return sum;
    }
}
