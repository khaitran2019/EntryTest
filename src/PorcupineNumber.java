public class PorcupineNumber {

    public static void main(String[] args) {
        System.out.println("138: " + findNextPorcupineNumber(138));
        System.out.println("139: " + findNextPorcupineNumber(139));
        System.out.println("500: " + findNextPorcupineNumber(500));
    }

    private static int findNextPorcupineNumber(int num){
        int result = 0;
        for(int i = num + 1; i< Integer.MAX_VALUE;i++){
            if(isPorcupineNumber(i)){
                result = i;
                break;
            }
        }
        return result;
    }
    public static boolean isPorcupineNumber(int num) {
        boolean result = false;
        // is a prime
        if (PrimeCount.isPrime(num)) {
            // end with 9
            if (num % 10 == 9) {
                // next prime end with 9
                int nextPrime = nextPrime(num);
                if (nextPrime % 10 == 9) {
                    System.out.println("Next prime of " + num + ": " + nextPrime);
                    result = true;
                }

            }
        }

        return result;
    }

    public static int nextPrime(int num) {
        int result = 0;

        for (int i = num + 1; i < Integer.MAX_VALUE; i++) {
            if (PrimeCount.isPrime(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

}
