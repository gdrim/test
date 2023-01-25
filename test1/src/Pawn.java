public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!this.checkTrajectory(line, column, toLine, toColumn)) {
            return false;
        } else if (line == toLine && column == toColumn) {
            return false;
        } else if (!chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)) {
            return false;
        } else if (!chessBoard.checkPos(line) || !chessBoard.checkPos(column)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkTrajectory(int line, int column, int toLine, int toColumn) {
        if ( column != toColumn) {
            return false;
        }
        if (super.color.equals("White")) {
            if (toLine - line == 1) {
                return true;
            } else if (line == 1 && toLine - line == 2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (line - toLine == 1) {
                return true;
            } else if (line == 6 && line - toLine == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String getSymbol() {
            return "P";
    }
}
