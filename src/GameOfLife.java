public class GameOfLife {
  public static void main(String [] args) {
    new GameOfLife();
  }

  public GameOfLife() {

    for(int column = 0; column < 10; column++) {
      for(int row = 0; row < 10; row++) {
        System.out.println("Column: " + column + "\nRow: " + row);
        // Create object with these coordinates? new Cell(column, row)
      }
    }

  }
}
