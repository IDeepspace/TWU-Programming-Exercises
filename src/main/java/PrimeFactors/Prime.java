package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Prime {

  private List<Integer> results = new ArrayList<>();


  private List main() {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for (int i = 2; i < n; i++) {
      while (n != i) {
        if (n % i == 0) {
          n = n / i;
          results.add(i);
        } else {
          break;
        }
      }
    }
    results.add(n);
    return results;
  }

  public static void main(String[] args) {
    Prime prime = new Prime();
    System.out.println(prime.main());
  }
}
