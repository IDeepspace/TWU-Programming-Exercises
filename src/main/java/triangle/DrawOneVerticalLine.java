package triangle;

import java.util.stream.IntStream;

public class DrawOneVerticalLine {
  private static final String chr = "*";

  private int num;


  private DrawOneVerticalLine(int num) {
    this.num = num;
  }

  private void print() {
    IntStream.range(0,num).forEach(t -> System.out.println(chr));
  }

  public static void main(String[] args) {
    int n = 3;
    DrawOneVerticalLine drawOneVerticalLine = new DrawOneVerticalLine(n);
    drawOneVerticalLine.print();
  }
}
