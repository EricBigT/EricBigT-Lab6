import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir; 
    protected int timeSinceLast;
    protected char lab;
    protected Random rand = new Random(System.currentTimeMillis());

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0; // start facing north (same as original)
        this.timeSinceLast = 0;
    }

    // movement rules differ by subclass
    public abstract void maybeTurn(Random rand);

    // shared behavior
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public void step() {
        final int[] dc = {0, 1, 0, -1};
        final int[] dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    public void move() {
        maybeTurn(rand);
        step();
    }

    public void display() {
        System.out.println(row + " " + col + " " + lab);
    }


}
