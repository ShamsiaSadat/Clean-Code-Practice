package chapter1.clean.code;

public class BadCode {
    public static void main(String[] args) {
        doStuff();
    }

    private static boolean someCondition(int number) {
        return number % 2 == 0;
    }

    public static void doStuff() {
        int d = 0;
        for ( int i = 0; i <34; i++) {
            if (someCondition(i)) {
                d += i;
            }
        }
        System.out.println(d);
    }
}
