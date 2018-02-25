package pl.madison.utils;

import java.util.List;

public class ConverterUtils {

    public static String fromDecimalToBinarySystem(int number) {
        String result = "";

        do {
            result = result + number % 2;
            number = (number - number % 2) / 2;
        } while (number > 0);

        char[] arr = result.toCharArray();
        char[] arr2 = new char[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr2[i] = arr[(arr.length - 1) - i];
        }

        return new String(arr2);
    }

    public static int fromBinarySystemToDecimal(List<Integer> charsOfNumbers) {
        int sum = 0;
        int id = charsOfNumbers.size() - 1;

        for (int i = 0; i < charsOfNumbers.size(); i++) {
            sum = (int) (sum + Math.pow(2, i) * charsOfNumbers.get(id - i));
        }

        return sum;
    }
}
