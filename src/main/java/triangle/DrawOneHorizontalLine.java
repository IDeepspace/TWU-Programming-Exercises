package triangle;

import java.util.stream.IntStream;

public class DrawOneHorizontalLine {

  private static final String chr = "*";

  private int num;


  private DrawOneHorizontalLine(int num) {
    this.num = num;
  }

  private void print() {
    IntStream.range(0,num).forEach(t -> System.out.print(chr));
  }

  public static void main(String[] args) {
    int n = 8;
    DrawOneHorizontalLine drawOneHorizontalLine = new DrawOneHorizontalLine(n);
    drawOneHorizontalLine.print();
  }
}
