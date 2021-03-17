class Lesson05 {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;

    int a = 8;
    int b = 12;
    int c = 20;

    int d = 19;
    int e = 21;

    d++;
    e--;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);

    System.out.println(x > y);
    System.out.println(x < y);

    System.out.println(x == y);
    System.out.println(x != y);

    System.out.println(a >= 5 && a <= 10);
    System.out.println(b >= 5 && b <= 10);

    System.out.println(a == 3 || b == 3);
    System.out.println(a == 1 || b == 1);

    System.out.println(a += 10);
    System.out.println(c += b);

    System.out.println(d);
    System.out.println(e);

  }
}