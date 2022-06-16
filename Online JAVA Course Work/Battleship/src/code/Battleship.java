package code;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Battleship {

    static int[] ships = {2, 4};

    static Scanner input = new Scanner(System.in);

    static int max = IntStream.of(ships).sum();

    public static void main(String[] args) {

        int torps = 10;
        int hits = 0;

        String[][] board = new String[5][5];
        createBoard(board);

        for (int i = 0; i < ships.length; i++) {
            createShip(board, ships[i]);
        }

        while (torps > 0 && hits < max) {
            showBoard(board);
            hits = userFire(board, hits, torps);
            torps--;
        }

        endGame(hits, torps);

    }

    public static void createBoard(String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = "~";
            }
        }
    }

    public static void showBoard(String[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            System.out.print("\t" + (i+1));
        }
        for(int r = 0; r < board.length; r++) {
            System.out.println("");
            System.out.print(r+1);
            for(int c = 0; c < board[0].length; c++) {
                if (board[r][c] == "S") {
                    System.out.print("\t~");
                } else {
                    System.out.print("\t" + board[r][c]);
                }
            }
        }
    }

    public static int[] getDirection(int dir) {
        int xDir = 0;
        int yDir = 0;

        switch(dir) {
            case 0:
                xDir = 1;
                yDir = 0;
                break;
            case 1:
                xDir = 0;
                yDir = 1;
                break;
            case 2:
                xDir = -1;
                yDir = 0;
            case 3:
                xDir = 0;
                yDir = -1;
        }

        return new int[] {xDir, yDir};

    }

    public static void createShip(String[][] board, int size) {
        int col = (int)(Math.random() * board[0].length);
        int row = (int)(Math.random() * board[1].length);
        int dir = (int)(Math.random() * 4);

        while(!validShip(board, col, row, dir, size)) {
            col = (int)(Math.random() * board[0].length);
            row = (int)(Math.random() * board[1].length);
            dir = (int)(Math.random() * 4);
        }

        int dirx = getDirection(dir)[0];
        int diry = getDirection(dir)[1];

        for (int i = 0; i < size; i++) {
            row += dirx;
            col += diry;
            board[row][col] = "S";
        }

    }
    public static boolean validShip(String[][] board, int col, int row, int dir, int size) {
        int dirx = getDirection(dir)[0];
        int diry = getDirection(dir)[1];
        for (int i = 0; i < size; i++) {
            row += dirx;
            col += diry;

            if (row < 0 || row >= board.length) {
                return false;
            } else if (col < 0 || col >= board[0].length) {
                return false;
            } else if (board[row][col] != "~") {
                return false;
            }
        }

        return true;

    }

    public static int userFire(String[][] board, int hits, int torps) {
        int row;
        int col;
        System.out.println("");
        System.out.println("You have " + torps + " torpedoes left.");

        System.out.println("What row do you want to fire at?");
        row = input.nextInt();
        while (row < 1 || row > board.length) {
            System.out.println("Please choose a row between 1 and " + board.length);
            row = input.nextInt();
        }

        System.out.println("What column do you want to fire at?");
        col = input.nextInt();
        while (col < 1 || col > board[0].length) {
            System.out.println("Please choose a column between 1 and " + board[0].length);
            col = input.nextInt();
        }

        if (board[row - 1][col - 1] == "S") {
            hits++;
            System.out.println("HIT!");
            board[row - 1][col - 1] = "!";
        } else {
            System.out.println("MISS!");
            board[row - 1][col - 1] = "M";
        }
        return hits;
    }

    public static void endGame(int hits, int torps) {
        if (hits >= max) {
            System.out.println("You won the game with " + torps + " torpedoes left!");
        } else {
            System.out.println("You lost! Maybe next time!");
        }
    }


}
