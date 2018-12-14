package SR1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, -9, 2, 4, -6, 3, -1, -7, 6, 8};
        System.out.println(numbers.length);
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i]--;
            }
            if (numbers[i] > 0) {
                numbers[i]++;
            }
        }
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

    }

}



