import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int[] array = new int[5];
        String[] strings = new String[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(1000);
        }
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
        changeArray(array.clone());

        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
    public static void changeArray(int[] array222){
        for (int i = 0; i < array222.length; i++) {
            array222[i] = 0;
        }
        for (int element : array222) {
            System.out.print(element + ", ");
        }
        System.out.println("printed from method");
    }
}
