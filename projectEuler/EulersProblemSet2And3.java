import java.math.BigInteger;

/**
 * @Abdullah some more problems from Euler problem set.
 */
public class EulersProblemSet2And3 {
    /**
     * @return the sum of all fibonnacci numbers that are even. Until one of the fibonnaci numbers reaches 4 million or above.
     * (This is the brute for method and its O(N) time.)
     */
    public int fibonacciEvenNumbers() {
        int prevTerm1 = 0;
        int prevTerm2 = 1;
        int prevSum = 0;
        int sumOfEvenTerms = 0;


        while (prevTerm1 < 4000000 | prevTerm2 < 4000000 | prevSum < 4000000) {

            prevSum = prevTerm1 + prevTerm2;
            if (prevSum % 2 == 1) {
                sumOfEvenTerms = prevSum + sumOfEvenTerms;
            }
            prevTerm1 = prevTerm2;
            prevTerm2 = prevSum;
        }

        return sumOfEvenTerms;
    }

    /**
     * doesn't work yet
     * @return the largest prime number from 600851475143 in O(n^2)time
     */
    public BigInteger largestPrimeNumber() {
        BigInteger currentNum = BigInteger.ZERO;
        BigInteger counter = BigInteger.ZERO;

        boolean check = true;
        boolean check2 = true;
BigInteger currentPrime = BigInteger.ZERO;
        BigInteger b = new BigInteger("600851475143");

        while (check = true) {

            if (currentNum.equals(b)){
                check = false;
                break;
            }
            currentNum.add(BigInteger.ONE);
            while(check2 == true ){
                if(counter.equals(currentNum)){
                    check2 = false;
                    break;
                }
                if(currentNum.gcd(counter).compareTo(BigInteger.TWO) != 0){
                    counter.add(BigInteger.ONE);
                }else{
                    currentPrime.add(currentNum.gcd(counter));
                    System.out.println(currentPrime);
                }
            }
        }
        return currentPrime;
    }

    public static void main(String[] args) {
        EulersProblemSet2And3 s = new EulersProblemSet2And3();

      //  System.out.println(s.fibonacciEvenNumbers());
        System.out.println(s.largestPrimeNumber());
    }
}
