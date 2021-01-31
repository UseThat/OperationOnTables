public class TableActions {

    public int returnTableWithBiggestSum(int tableA[][], int tableB[][]){
        int sum1 = 0;
        int sum2 = 0;

        sum1 =  countTableSum(tableA);
        sum2 =  countTableSum(tableB);
        if(sum1 > sum2){
            return sum1;
        }else return sum2;

    }


    private int countTableSum(int table[][]){
        int sum = 0;
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table[i].length;i++){
                sum += table[i][j];
            }

        }

        return sum;
    }
}
