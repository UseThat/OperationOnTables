public class TableActions {

    public static int returnTableWithBiggestSum(int[][] tableA, int[][] tableB){

        return Math.max(countTableSum(tableA),countTableSum(tableB));

    }

    public static void returnBiggestStringTable (String [] tableA, String [] tableB){
      if(countCharInTable(tableA)>countCharInTable(tableB)){
          for (String str:
               tableA) {
              System.out.println(str);
          }
      }else if(countCharInTable(tableA)<countCharInTable(tableB)){
          for (String str:
                  tableA) {
              System.out.println(str);
          }
      }else System.out.println("Table are equals");
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

    private static int countCharInTable(String [] table){
        int count = 0;

        for (String s : table) {
            for (int j = 0; j < s.length(); j++) {
                count++;
            }
        }

        return count;
    }
}
