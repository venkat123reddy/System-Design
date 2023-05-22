package SnakesLadders.Models;

public class Player {
    public String name;
    public Position position;
    Player(String name)
    {
        this.name=name;
        this.position= new Position();
    }
}
