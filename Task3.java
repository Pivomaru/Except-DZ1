import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать)

public class Task3 {
    public static void main(String[] args) {
        //        int[] arr1 = null;
                int[] arr1 = {4, 2, 4, 3, 9};
                int[] arr2 = {1, 5, 4, 5, 3};
                int[] arr3 = null;
        
                if(arr3 == null){
                    throw new RuntimeException("Массив не должен быть равен null!");
                }
                System.out.println(Arrays.toString(difOf(arr1, arr2)));
                difOf(arr3, arr2);
            }
        
            private static int[] difOf(int[] arr1, int[] arr2) {
                if (arr1 == null || arr2 == null) {
                    throw new RuntimeException("Массив не должен быть равен null!");
                }
                if (arr1.length != arr2.length) {
                    throw new RuntimeException("Длины массивов должны быть одинаковыми!");
                }
        
                int[] arr3 = new int[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] - arr2[i];
                }
                return arr3;
            }
}

