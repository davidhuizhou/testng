package com.dzhou.testng;

/**
 * Created by huizhou on 11/28/15.
 */
public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {

        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
