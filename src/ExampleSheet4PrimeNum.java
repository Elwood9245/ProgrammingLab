
public class ExampleSheet4PrimeNum {

    //Check if it is a prime number.
    public static boolean isPrime(int num){
        for (int i = 2; i < num/2; ++i){
            // If num is divisible by any i, it's not prime
            // num/2 is not compulsory.
            if (num % i == 0)
                return false;// Return false if divisible
        }
        return true;// Return true if no divisors were found, meaning num is prime
    }

    // Method to list all prime numbers up to a given number
    public static void listPrimes(int num){
        for (int i = 2; i <= num; ++i) {
            if (isPrime(i)) //Calling isPrime method. if the method return true, then print.
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        listPrimes(100);
    }
}
