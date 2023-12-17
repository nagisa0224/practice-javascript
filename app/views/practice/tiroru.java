import java.util.*;
public class Tiroru {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    
    int money = sc.nextInt();
    int n = sc.nextInt();
    int point = 0;
    
    for (int i = 0; i < n; i++) {
      int uc = sc.nextInt();
      if (point >= uc) {
        point -= uc;
      } else {
        money = money - uc;
        point += uc / 10;
      }
      System.out.println(money + " " + point);
    }
  }
}


import java.util.*;
public class Tiroru {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    
    int money = sc.nextInt();
    int n = sc.nextInt();
    int point = 0;
    
    for (int i = 0; i < n; i++) {
      int uc = sc.nextInt();
      if (point >= uc) {
        point -= uc;
      } else {
        money = money - uc;
        point += uc / 10;
      }
      System.out.println(money + " " + point);
    }
  }
}