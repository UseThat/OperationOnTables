public class TestClass {
    public static void main(String[] args) {
        int [][]firstTable = {{1,2,3,4},{333}};
        int [][]secondTable = {{223,4,1},{1,1,1}};
        System.out.println(TableActions.returnTableWithBiggestSum(firstTable,secondTable));
        String [] firstStringTable = {"aa","aaa","aaaba"};
        String [] secondStringTable = {"aa","aaa","aaaa"};
        TableActions.returnBiggestStringTable(firstStringTable,secondStringTable);
    }
}
