package triangle;

import java.util.stream.IntStream;

public class DrawOneRightTriangle {

  private static final String chr = "*";

  private int line;

  private DrawOneRightTriangle(int line) {
    this.line = line;
  }

  private void print(int num) {
    IntStream.range(0,num).forEach(t -> System.out.print(chr));
  }

  private void printTriangle() {
    for (int i = 0; i < line; i++) {
      print(i + 1);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 3;
    DrawOneRightTriangle drawOneRightTriangle = new DrawOneRightTriangle(n);
    drawOneRightTriangle.printTriangle();
  }
}
