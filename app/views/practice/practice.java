System.out.println("Hello World");


int number = 3;
System.out.println(number);

String name = "Sato";
System.out.println(name);

System.out.println(number + 3);

System.out.println("私の名前は" + name + "です");

// 変数の内容を上書きする場合は 変数名 = 内容
name = "田中";


// switch文
int n = 1;
switch (n) {
  case 1 :
    System.out.println("大吉です");
    break;
  case 2 :
    System.out.println("吉です");
    break;
}

// breakはswitch文を終了する命令に使用。ないと次のcaseも実行されてしまいます！

int n = 2;
switch (n) {
  case 1 :
    System.out.println("クレープです");
    break;
  case 2 :
    System.out.println("パフェです");
    break;
}

int n = 3;
switch (n) {
  case 1 :
    System.out.println("大吉です");
    break;
  case 2 :
    System.out.println("吉です");
    break;
  default :
    System.out.println("凶です")；
    break;
}

int n = 1;
while (1 <= 5){
  System.out.println(i + "回ジャンプしました");
  i++;
}
