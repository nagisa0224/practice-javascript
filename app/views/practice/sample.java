public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int number = 7;
        if (isEven(number)) {
            System.out.println(number + "は偶数です。");
        } else {
            System.out.println(number + "は奇数です。");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}


public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
