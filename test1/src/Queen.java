

public class Queen extends ChessPiece {
    public Queen(String color) {
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
        if ( (line == toLine && column != toColumn) || (line != toLine && column == toColumn)) {
            return true;
        } else if (Math.abs(toLine - line) == Math.abs(toColumn - column) ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
