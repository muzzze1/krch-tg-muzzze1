package less3;

public class example {
    public static void main(String[] args) {
        int a = 1;
        setInt(a);
        System.out.println(setInt(a));
    }

    public static int setInt(int a) {
        a = 2;
        return a;
    }
}
