public class Task2 {
    public static void main(String[] args) {
        String[][] arr = {{"5","6","2","1","4"},{"5","6","2","1","4"},
                {"5","6","2","1","4"},
                {"5","6","2","1","4"},{"5","6","2","1"}};
        System.out.println(sum2d(arr));
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt((arr[i][j]));
                sum+= val;
            }
        }
        return sum;
    }
}
//2 исключения  -> NumberFormatException, ArrayIndexOutOfBoundsException.