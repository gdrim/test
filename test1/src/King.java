
public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!checkTrajectory(line, column, toLine, toColumn)) {
            return false;
        } else if (line == toLine && column == toColumn) {
            return false;
        } else if (!chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkTrajectory(int line, int column, int toLine, int toColumn) {
        System.out.println( line+toLine+column+toColumn );
        if (Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){

        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
