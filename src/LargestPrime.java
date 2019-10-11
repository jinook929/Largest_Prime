public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }

        int prime = -1;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
//                System.out.println("divisor = " + i);
                int counter = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        counter++;
                        break;
                    }
                }
                if (counter == 0) {
                    prime = i;
                }
            }
        }

        return prime;
    }
}
