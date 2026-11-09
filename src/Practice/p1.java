package Practice;

public class p1 {
    public static void main(String[] args) {
        String beforeReverseLetter = "J@va the be$t!123";
        char[] chars = beforeReverseLetter.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if(!Character.isLetter(chars[left])){
                left++;
                continue;
            }

            if(!Character.isLetter(chars[right])){
                right--;
                continue;
            }
            char tmp = chars[left];     // меняем местами края
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;                     // сдвигаем указатели навстречу
            right--;
        }
        System.out.println(new String(chars));

    }
}

