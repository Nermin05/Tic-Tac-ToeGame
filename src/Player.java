public class Player {
    private char currentPlayer;

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(char currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void switchPlayer() {
        if (getCurrentPlayer() == 'X') {
            setCurrentPlayer('O');
        } else {
            setCurrentPlayer('X');
        }
    }

}
