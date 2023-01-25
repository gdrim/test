public class Rook extends ChessPiece {
    public Rook(String color) {
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
        if (toLine == line || toColumn == column ) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String getSymbol() {
        return "R";
    }
}
