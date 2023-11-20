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