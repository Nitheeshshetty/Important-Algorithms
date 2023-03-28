The Sieve of Eratosthenes is the simplest prime number sieve. It is a Prime number algorithm to search all the prime numbers in a given limit.This algorithm filters out the prime number in an iterative approach. The filtering process starts with the smallest prime number. A Prime is a natural number that is greater than 1 and has only two divisors, viz., 1 and the number itself.In the sieve of the Eratosthenes method, a small prime number is selected first, and all the multiples of it get filtered out. The process runs on a loop in a given range.
<br/>
<br/>
Algorithmic Steps of Sieve of Eratosthenes :
--------------------------------------------
    1. Create a list of numbers from 2 to the given range n. We start with 2 as it is the smallest and first prime number.
    2. Select the smallest number on the list, x (initially x equals 2), traverse through the list, and filter the corresponding composite numbers by marking all the multiples of the selected numbers.
    3. Then choose the next prime or the smallest unmarked number on the list and repeat step 2.
    4. Repeat the previous step until the value of x should be lesser than or equal to the square root of n (x<=Sieve of Eratosthenes Algorithm).
    5. After those four steps, the remaining unmarked numbers would be all the primes on that given range n.
