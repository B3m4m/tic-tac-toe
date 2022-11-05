public class Main {
    public static void main(String[] args) {

        int dimension = 3;
        char[][] board = {{'O', 'X', 'X'},
                {'O', 'X', ' '},
                {' ', 'O', 'O'}};
        Main.printplans(board);
        }


    public static void printplans(char[][] board) {
        int dimension = board.length;

        System.out.print("\t");

        for (int i = 0; i < dimension; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}