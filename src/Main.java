import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] one = {1, 2, 3};
        float[] two = {1.57f,7.654f,9.986f};
        int[] three = {14,23,45,78,93};
        System.out.println("Задание 2");
        System.out.print(one[0]+",");
        System.out.print(one[1]+",");
        System.out.print(one[2]);
        System.out.println();
        System.out.print(two[0]+",");
        System.out.print(two[1]+",");
        System.out.print(two[2]);
        System.out.println();
        System.out.print(three[0]+",");
        System.out.print(three[1]+",");
        System.out.print(three[2]+",");
        System.out.print(three[3]+",");
        System.out.println(three[4]);
        System.out.println("Задание 3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = two.length-1;i>=0;i--){
            System.out.print(two[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        int [] number = {1,2,3};
        for (int i=0;i<number.length;i++){
            if (number[i]%2==1){
                number[i]=number[i]+1;
            }
        }
        System.out.println(Arrays.toString(number));



    }
}