package diamondExercise;

public class IsoscelesTriangle {

  private static void topTriangle(int line) {
    for (int i = 1; i <= line; i++) {
      // 控制打印空格
      for (int j = 1; j <= line - i; j++) {
        System.out.print(" ");
      }
      // 控制打印*
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 3;
    topTriangle(n);
  }
}
