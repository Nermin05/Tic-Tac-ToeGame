import java.util.Scanner;

public class Process {
    Player player=new Player();
    Board board;
    public Process() {
        board=new Board();
    }
    private boolean checkForWin() {
  for(int i=0;i<3;i++) {
  if(board.getBoard()[i][0]==board.getBoard()[i][1] && board.getBoard()[i][1]==board.getBoard()[i][2] && board.getBoard()[i][0] != '*') {
      return true;
  }
  }
  for(int j=0;j<3;j++) {
      if(board.getBoard()[0][j]==board.getBoard()[1][j] && board.getBoard()[1][j]==board.getBoard()[2][j] && board.getBoard()[0][j]!='*') {
          return true;
      }
  }
  if((board.getBoard()[0][0]==board.getBoard()[1][1] && board.getBoard()[1][1]==board.getBoard()[2][2] && board.getBoard()[0][0]!='*') ||
          (board.getBoard()[0][2] == board.getBoard()[1][1] && board.getBoard()[1][1] == board.getBoard()[2][0] && board.getBoard()[0][2] != '*'))
  {
            return true;
        }
  return false;
    }
    private boolean isDraw() {
  for (int i=0;i<3;i++) {
      for(int j=0;j<3;j++) {
          if (board.getBoard()[i][j] == '*'){
              return false;
          }
      }
  }
        return true;
    }
    public void game() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Start game!");
        player.setCurrentPlayer('X');
        while (true) {
            board.printBoard();
            System.out.println("Current player:" + player.getCurrentPlayer());

            System.out.println("Enter row: ");
            int row = scanner.nextInt() - 1;
            System.out.println("Enter column: ");
            int col = scanner.nextInt() - 1;
            if (board.isValidMove(row, col)) {
                board.makeMove(row, col, player.getCurrentPlayer());
                if (checkForWin()) {
                    System.out.println(player.getCurrentPlayer() + " wins!");
                    break;
                } else if (isDraw()) {
                    System.out.println("Game is ended!");
                    break;
                }
                player.switchPlayer();
            }
            else {
                System.out.println("Try again!");
            }

        }
        scanner.close();
    }
}
