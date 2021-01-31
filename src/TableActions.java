public class TableActions {

    public int returnTableWithBiggestSum(int[][] tableA, int[][] tableB){

        return Math.max(countTableSum(tableA),countTableSum(tableB));

    }


    private int countTableSum(int[][] table){
        int sum = 0;
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table[i].length;i++){
                sum += table[i][j];
            }

        }

        return sum;
    }
}
