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


import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("正の数です。");
        } else if (number < 0) {
            System.out.println("負の数です。");
        } else {
            System.out.println("ゼロです。");
        }
    }
}


import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1から7までの整数を入力してください: ");
        int day = scanner.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("日曜日");
                break;
            case 2:
                System.out.println("月曜日");
                break;
            case 3:
                System.out.println("火曜日");
                break;
            case 4:
                System.out.println("水曜日");
                break;
            case 5:
                System.out.println("木曜日");
                break;
            case 6:
                System.out.println("金曜日");
                break;
            case 7:
                System.out.println("土曜日");
                break;
            default:
                System.out.println("1から7までの数値を入力してください。");
        }
    }
}


import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("月の先頭3文字を入力してください: ");
        String monthAbbreviation = scanner.next().toLowerCase();
        
        int days;
        switch (monthAbbreviation) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                days = 31;
                break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
                days = 30;
                break;
            case "feb":
                days = 28; // うるう年の場合は29日になるが、ここでは簡略化
                break;
            default:
                System.out.println("正しい月の略語を入力してください。");
                return;
        }
        
        System.out.println(monthAbbreviation + " は " + days + " 日間あります。");
    }
}


import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("年を入力してください: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "年はうるう年です。");
        } else {
            System.out.println(year + "年はうるう年ではありません。");
        }
    }
}


