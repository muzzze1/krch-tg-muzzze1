package les2;

public class Main {
    public static void main(String[] args) {
        int[] num = {85, 42, 91, 67, 55, 78, 34, 90, 61, 73};
        int max = num[0];
        int min = num[0];
        double srArif = 0;
        int shest = 0;
        int sum = 0;
        boolean sdal = true;
        char[] letterGrades;

        // посчитал сумму массива и среднее арифметическое
        for (int number : num) {
            sum += number;
            srArif = sum / num.length;
        }

        // посчитал максимин массива
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) min = num[i];
            if (num[i] > max) max = num[i];
            if (num[i] > 60) shest++;
            if (shest < 10) sdal = false;
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(srArif);
        System.out.println(shest);
        System.out.println(sdal);

    }
}