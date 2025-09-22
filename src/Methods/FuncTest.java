package Methods;

public class FuncTest {
    public static void main(String[] args) {

        playSound(3);
        System.out.println("------------------");
        System.out.println();
        secondSOund(4);

        System.out.println(fib(13));

    }

    static void playSound (int numOfSounds) {
        for (int i = 0; i < numOfSounds ; i++) {
            System.out.println("Sound!");
        }
    }

    static void secondSOund (int numOfSounds) {
        while (numOfSounds > 0) {
            System.out.println(numOfSounds + "\tSecond sound!");
            numOfSounds--;
        }
    }

    static int fib (int n) {
        if (n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }

    }
}
