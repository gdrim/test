
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
        System.out.println(line + toLine + column + toColumn);
        if (Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (board.getChessPiece(i, j) != null && board.getChessPiece(i, j).canMoveToPosition(board, i, j, line, column)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
