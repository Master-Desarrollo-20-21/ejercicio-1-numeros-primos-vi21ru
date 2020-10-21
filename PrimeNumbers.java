
public class PrimeNumbers {

	private static int MAX_NUMBER = 50;

	public boolean isPrime(int number) {

		boolean prime = true;
		for (int i = number - 1; i >= 2; i--) {
			if (number % i == 0) {
				prime = false;
			}
		}
		return prime;
	}

	public void sumPrimesOnFirstFiftyNumbers() {

		int sum = 0;
		for (int i = 0; i <= MAX_NUMBER; i++) {
			if (isPrime(i))
				sum += i;
		}
		System.out.println(String.format("La suma de numeros primos en los %d primeros numeros es: %d", MAX_NUMBER, sum));
	}

	public void FiftyPrimeNumbersSum() {

		int sum = 0;
		int primeCounter = 0;
		int number = 1;
		while (primeCounter <= MAX_NUMBER) {
			if (isPrime(number)) {
				sum += number;
				primeCounter++;
			}
			number++;
		}
		System.out.println(String.format("La suma de los %d primeros numeros primos es: %d", MAX_NUMBER, sum));
	}

	public static void main(String[] args) {

		PrimeNumbers primes = new PrimeNumbers();

		primes.FiftyPrimeNumbersSum();
		primes.sumPrimesOnFirstFiftyNumbers();
	}

}
