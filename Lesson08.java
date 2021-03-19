class Student {
  String name;

  public double calculateAvg(double[] data) {
    double sum = 0;
    for (int i = 0; i < data.length; i++) {
      sum += data[i];
    }
    double avg = sum / data.length;
    return avg;
  }

  public String judge(double avg) {
    String result;
    if (avg >= 60) {
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
  }

}

public class Lesson08 {
  public static void main(String[] args) {
    Student a001 = new Student();
    a001.name = "sato";
    double[] data = { 40, 65, 50, 10, 30 };

    double avg = a001.calculateAvg(data);
    String result = a001.judge(avg);

    System.out.println(avg);
    System.out.println(a001.name + " => " + result);

    Student a002 = new Student();
    a002.name = "tanaka";
    double[] data = { 80, 65, 55, 89, 50 };

    double avg = a002.calculateAvg(data);
    String result = a002.judge(avg);

    System.out.println(avg);
    System.out.println(a002.name + " => " + result);
  }
}