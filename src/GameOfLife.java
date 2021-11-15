public class GameOfLife {
  boolean GameOn;
  Cell Cells;
  public static void main(String [] args) {
    new GameOfLife();
  }

  public GameOfLife() {

    for(int column = 0; column < 10; column++) {
      for(int row = 0; row < 10; row++) {
        Cells = new Cell(column, row);

        // Create object with these coordinates? new Cell(column, row)

      }
    }

    GameOn = true;
    update();

  }

  public void update() {
    while(GameOn) {
      System.out.println("test");

      GameOn = false;
    }
  }
}
