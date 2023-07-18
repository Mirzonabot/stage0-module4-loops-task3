package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        t = (t < 0 ? -t : t);
        int sum = 0;
        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);

    }
}
