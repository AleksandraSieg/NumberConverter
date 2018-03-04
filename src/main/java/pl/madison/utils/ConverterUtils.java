package pl.madison.utils;

import java.util.ArrayList;
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

    public static String fromDecimalToOctal(int number) {
        String result = "";

        do {
            result = result + number % 8;
            number = (number - number % 8) / 8;
        } while (number > 0);

        char[] arr1 = result.toCharArray();
        char[] arr2 = new char[arr1.length];

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr2[i] = arr1[(arr1.length - 1) - i];
        }

        return new String(arr2);
    }

    public static int fromOctalToDecimal(List<Integer> number) {
        int sum = 0;

        for (int i = 0; i < number.size(); i++) {
            sum = (int) (sum + Math.pow(8, i) * number.get(i));
        }

        return sum;
    }

    public static List<String> fromDecimalToHexadecimal(int number) {
        List<String> numberHexaDecimal = new ArrayList<>();

        do {
            if (0 <= number % 16 && number % 16 <= 9) {
                numberHexaDecimal.add("" + number % 16);
            } else if (number % 16 == 10) {
                numberHexaDecimal.add("A");
            } else if (number % 16 == 11) {
                numberHexaDecimal.add("B");
            } else if (number % 16 == 12) {
                numberHexaDecimal.add("C");
            } else if (number % 16 == 13) {
                numberHexaDecimal.add("D");
            } else if (number % 16 == 14) {
                numberHexaDecimal.add("E");
            } else if (number % 16 == 15) {
                numberHexaDecimal.add("F");
            }
            number = (number - number % 16) / 16;
        } while (number > 0);

        List<String> reverseNumber = new ArrayList<>();

        for (int i = numberHexaDecimal.size() - 1; i >= 0; i--) {
            reverseNumber.add(numberHexaDecimal.get(i));
        }

        return reverseNumber;
    }
}
