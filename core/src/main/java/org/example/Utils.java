package org.example;

public class Utils {
    static final StringUtils utils = new StringUtils();

    static boolean isAllPositiveNumbers(String... str) {


        for (String s : str) {
            if (!utils.isPositiveNumber(s)) {
                return false;
            }
        }

        return true;
    }
}
