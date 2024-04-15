import java.util.Random;

class _4RandDemo {
    public static void main(String args[]) {
        Random r = new Random();
        double val;
        double sum = 0;
        int bell[] = new int[10];

        for (int i = 0; i < 100; i++) { // Generate 100 random numbers
            val = r.nextGaussian();
            sum += val;
            double t = -2;

            for (int x = 0; x < 10; x++, t += 0.5) {
                if (val < t) {
                    bell[x]++;
                    break;
                }
            }
        }

        System.out.println("Average of values: " + (sum / 100));

        for (int i = 0; i < 10; i++) {
            for (int x = bell[i]; x > 0; x--)
                System.out.print("*");
            System.out.println();
        }
    }
}