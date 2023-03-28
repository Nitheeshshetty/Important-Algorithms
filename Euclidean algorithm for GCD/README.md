The Euclidean algorithm is a way to find the greatest common divisor of two positive integers. GCD of two numbers is the largest number that divides both of them. A simple way to find GCD is to factorize both numbers and multiply common prime factors.<br/>
 Euclidean Algorithm for GCD :
 -----------------------------
    1. If we subtract a smaller number from a larger one (we reduce a larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
    2. Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find the remainder 0.
