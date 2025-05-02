import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        System.out.println(Arrays.toString(one));
        float[] two = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(two));
        int[] three = new int[5];
        three[0] = 14;
        three[1] = 23;
        three[2] = 45;
        three[3] = 78;
        three[4] = 93;
        System.out.println(Arrays.toString(three));
        System.out.println("Задание 2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i] + ", ");
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание 4");
        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                number[i] = number[i] + 1;
            }
        }
        System.out.println(Arrays.toString(number));


    }
}