package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class NumberToWords {

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int tempNumber = number;
            int count = 0;
            while (tempNumber > 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
            return count;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber > 0) {
            int lastDigit = tempNumber % 10;
            reverse = reverse * 10 + lastDigit;
            tempNumber = tempNumber / 10;
        }
        if (number >= 0) {
            return reverse;
        }else {
            return -reverse;
        }
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid value");
        } else {

            int tempNumber = reverse(number);
            int reverseNumber = reverse(number);

            while (tempNumber > 0) {
                int lastDigit = tempNumber % 10;
                tempNumber = tempNumber / 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Two");
                        break;
                }

            }
            for (int i = 0; i < (getDigitCount(number) - getDigitCount(reverseNumber)); i++){
                System.out.println("Zero");

            }
        }

    }
}
