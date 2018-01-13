/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice.BinarySearchTrees;

/**
 *
 * @author srivemul
 */
public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char userMarkerToken, char aiMarkerToken) {
        userMarker = userMarkerToken;
        aiMarker = aiMarkerToken;
        winner = '-';
        board = this.setBoard();
    }

    private char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean valid = withInRange(spot) && !isTaken(spot);
        if (valid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return valid;
    }

    private boolean withInRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    private boolean isTaken(int number) {
        return board[number - 1] != '-';
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("------------");
            }
            System.out.print(" | " + (i + 1));
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        boolean diagonalsAndMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || FirstCol()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || ThirdCol()) && board[8] != '-';
        if (diagonalsAndMiddles) {
            winner = board[4];
        } else if (topAndFirst) {
            winner = board[0];
        } else if (bottomAndThird) {
            winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;
    }

    private boolean topRow() {
        return (board[0] == board[1]) && (board[1] == board[2]);
    }

    private boolean middleRow() {
        return (board[3] == board[4]) && (board[4] == board[5]);
    }

    private boolean bottomRow() {
        return (board[6] == board[7]) && (board[7] == board[8]);
    }

    private boolean FirstCol() {
        return (board[0] == board[3]) && (board[3] == board[6]);
    }

    private boolean secondCol() {
        return (board[1] == board[4]) && (board[4] == board[7]);
    }

    private boolean ThirdCol() {
        return (board[2] == board[5]) && (board[5] == board[8]);
    }

    private boolean leftDi() {
        return (board[0] == board[4]) && (board[4] == board[8]);
    }

    private boolean rightDi() {
        return (board[2] == board[4]) && (board[4] == board[6]);
    }
    public boolean isTheBoardFilled() {
      for (int i = 0; i < board.length; i++) {
          if (board[i] == '-') {
              return false;
          }
      }
      return true;
  }
     public String gameOver() {
      boolean didSomeoneWin = isThereAWinner();
      if (didSomeoneWin) {
          return "We have a winner! The winner is " + this.winner + "'s";
      } else if (isTheBoardFilled()) {
          return "Draw: Game Over!";
      } else {
          return "notOver";
      }
      
  }

}
