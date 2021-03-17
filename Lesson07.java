class Lesson07 {
  public static void main(String[] args) {

    int arr[] = { 2, 4, 6, 8, 10 };
    int sum = 0;

    for (int i = 0; i <= 4; i++) {
      sum += arr[i];
    }
    System.out.println(sum);
    // for文の中でfor文を回す
    // for (int i = 0; i <= 2; i++) {
    // for (int j = 0; j <= 2; j++) {
    // System.out.println(i + "-" + j);
    // }
    // }

    // break continueを利用する
    // for (int i = 0; i <= 4; i++) {
    // if (i == 3) {
    // // break;
    // continue;
    // }
    // System.out.println(i);
    // }

  }
}