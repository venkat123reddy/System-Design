package SnakesLadders.Models;

import java.util.List;

public class Board {
    private int size;
    private String [][]board;

    public List<Snakes> snakes;

    public  List <Ladders> ladders;

    public List <Player> players;

    public static Board boardObj = new Board();
    private Board()
    {

    }

    public void start(int totalPlayers)
    {

    }

    public static Board getBoardObj() {
        return boardObj;
    }

    public int getSize() {
        return size;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public void setSize(int size) {
        this.size = (size*size);
        this.board= new String[size][size];
    }

    public String[][] getBoard() {
        return board;
    }
}
