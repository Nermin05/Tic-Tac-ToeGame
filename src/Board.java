public class Board {
    private char[][] board;

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public Board() {
   setBoard(new char[3][3]);
   boardSet();
}
private void boardSet() {
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) {
            board[i][j]='*';
        }
    }}
public void printBoard() {
    System.out.println("Current Gameboard:");
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
public boolean isValidMove(int row,int col) {
    if( row<3 && col<3 && row>=0 && col>=0 && board[row][col]=='*'){
        return true;
    }
    return false;
}
public void makeMove(int row,int col,char player) {
    board[row][col]=player;
}



}
