import java.util.Scanner;

// Class representing the Tic Tac Toe game
public class TicTacToe {
    private char[][] board; // 2D array to represent the Tic Tac Toe board
    private char currentPlayer; // Variable to track the current player ('X' or 'O')
    private boolean gameWon; // Boolean to check if the game has been won

    // Constructor to initialize the game
    public TicTacToe() {
        board = new char[3][3]; // Initialize a 3x3 board
        currentPlayer = 'X'; // Set the starting player to 'X'
        gameWon = false; // Set the initial game status to not won
        initializeBoard(); // Call the method to initialize the board
    }

    // Method to initialize the board with empty spaces
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) { // Loop through each row
            for (int j = 0; j < 3; j++) { // Loop through each column
                board[i][j] = '-'; // Set each cell to '-'
            }
        }
    }

    // Method to print the current state of the board
    public void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) { // Loop through each row
            for (int j = 0; j < 3; j++) { // Loop through each column
                System.out.print(board[i][j] + " "); // Print the value in each cell
            }
            System.out.println(); // Print a new line after each row
        }
    }

    // Method to change the current player
    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Toggle between 'X' and 'O'
    }

    // Method to place a move on the board
    public boolean placeMove(int row, int col) {
        // Check if the move is valid (within bounds and cell is empty)
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer; // Place the current player's symbol
            return true; // Return true if the move was successful
        }
        return false; // Return false if the move was invalid
    }

    // Method to check if the current player has won
    public boolean checkWin() {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            // Check rows for a win
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) || 
                // Check columns for a win
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true; // Return true if a win is found
            }
        }
        // Check main diagonal and anti-diagonal for a win
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) || 
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    // Main method to run the game
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); // Create a new instance of the game
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        while (!game.gameWon) { // Loop until the game is won
            game.printBoard(); // Print the current board
            System.out.println("Player " + game.currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt(); // Get row input from the user
            int col = scanner.nextInt(); // Get column input from the user

            if (game.placeMove(row, col)) { // Attempt to place the move
                game.gameWon = game.checkWin(); // Check if the move won the game
                if (!game.gameWon) {
                    game.changePlayer(); // Change the player if the game is not won
                }
            } else {
                System.out.println("This move is not valid."); // Inform the user of an invalid move
            }
        }

        game.printBoard(); // Print the final board
        System.out.println("Player " + game.currentPlayer + " wins!"); // Announce the winner
        scanner.close(); // Close the scanner
    }
}
