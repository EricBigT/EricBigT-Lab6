import java.util.Random;
public class TypeC extends Thing {
    private boolean moveRight = true;

    public TypeC(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        // zig-zag diagonal pattern
        if (moveRight){ 
            rightTurn();
        }
        else {
            leftTurn();
        }
        moveRight = !moveRight;
    }
}
