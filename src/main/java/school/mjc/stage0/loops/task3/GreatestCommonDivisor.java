package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        for (int i = (first > second ? first : second); i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
