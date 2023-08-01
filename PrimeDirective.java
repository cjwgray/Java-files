// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  public static boolean isPrime(int number){
    if ( number > 1){
      for (int i = 2;i < number;i++){
        if (number % i == 0){
          return true;
        }
      }
      return false;
    }
    return false;
  }
  public ArrayList<Integer> onlyPrimes(int numbers[]){
    ArrayList<Integer>primes = new ArrayList<Integer>();
    for (int i : numbers){
      if (isPrime(i) == true){
        primes.add(i);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(isPrime(7));
    System.out.println(isPrime(28));
    System.out.println(isPrime(2));
    System.out.println(isPrime(0));

    
    System.out.println(pd.onlyPrimes(numbers));
  }  

}