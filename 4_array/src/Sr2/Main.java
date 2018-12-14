package Sr2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, -9, 2, 4, -6, 3, -1, -7, 10, 8};
        int r = 5;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % r == 0) {
                sum+=numbers[i];


            }


        }
        System.out.println(sum);

    }

}

