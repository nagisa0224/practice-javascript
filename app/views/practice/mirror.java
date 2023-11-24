public class Mirror {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}


public class Mirror {
  public static void main(String[] args) {
    System.out.println("31 + 31の計算をしてください");
    System.out.println(31 + 31);
    System.out.println(6 * 6 * 3.14);
    System.out.println("答えは" + 64);
  }
}


public class Mirror {
  public static void main(String[] argse) {
    int x;
    x = 6;
    System.out.println(x * x * 3.14);
  }
}


// 行末までコメントアウト //

/* 複数行
   コメントできるよ */


public class Mirror {
  public static void main(String[] args) {
    int age = 20;
    System.out.println("私の年齢は" + age);
    age = 31;
    System.out.println("本当の年齢は" + age);
  }
}

// 上の段のageには20
// 下の段のageには31が代入されている(変数の上書き)


public class Mirror {
  public static void main(String[] args) {
    final double PI = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
  }
}

/* final 型 定数名 = 初期値;
   定数名には大文字を使用することが多い
   ちなみにdoubleは普通の少数を使用するときの型（例：円周率） */


// 3を変数aに、5を変数bにいれ、その積を変数cに入れて最後に以下の文を表示してください
// 縦幅3横幅5の長方形の面積は、15
public class Mirror {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int c = a * b;
    System.out.println("縦幅3横幅5の長方形の面積は、" + c);
  }
}


public class Mirror {
  public static void main(String[] args) {
    int a = 20;
    int b = a + 5;
    System.out.println(a);
    System.out.println(b);
  }
}


public class Mirror {
  public static void main(String[] args) {
    System.out.println("私の好きな記号は二重引用符（¥"）です");
  }
}

// 二重引用符を文字列に入れる場合は ¥" 
// ¥1200と表示させる場合は ¥¥1200 と表示される


public class Mirror {
  public static void main(String[] args) {
    int a = 100;
    a++;
    System.out.println(a);
  }
}


public class Mirror {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    System.out.println(++a + 50);
    System.out println(b++ + 50);
  }
}


public class Mirror {
  public static void main(String[] args) {
    float f = 3;
    double d = f;
    System.out.println(f);
    System.out.println(d);
  }
}


public class Mirror {
  public static void main(String[] args) {
    int age = (int)3.2;
    System.out.println(age);
  }
}

// 強制的な型の変換
// （変換式の型名）式


public class Mirror {
  public static void main(String[] args) {
    double d = 8.5 / 2;
    long 1 = 5 + 2L;
    System.out.println(d);
    System.out.println(l);
  }
}

public class Mirror {
  public static void main(String[] args) {
    String msg = "私の年齢は" + 23;
    System.out.println(msg);
  }
}


public class Mirror {
  public static void main(String[] args) {
    String name = "すがわら";
    System.out.print("私の名前は");
    System.out.print(name);
    System.out.print("です");
  }
}

// 上記のSystem.out.print()で改行なしで表示することができる
// 上記の出力結果　私の名前はすがわらです

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("偶数の個数: " + count);
        System.out.println("偶数の合計: " + sum);
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(", ");
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.print("奇数: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]);
                if (i < array.length - 2) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();

        System.out.print("偶数: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]);
                if (i < array.length - 2) {
                    System.out.print(", ");
                }
            }
        }
    }
}
