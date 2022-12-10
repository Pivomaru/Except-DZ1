import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;;

public class Task1 {

    public static void main(String[] args) {
        // firstExcept();
        // secondExcept();
        thirdExcept();
    }

    private static void firstExcept() {
        int a = 1;
        int b = 0;
        System.out.println(a / b);

    }

    private static void secondExcept() {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(array[6]);
    }

    private static void thirdExcept() {
        FileInputStream fil = new FileInputStream("test.txt");
        fil.read();
    }
}