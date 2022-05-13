package model;

public class Player {
    private int number;
    private String name;
    private Position position;

    public Player() {}

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Player(int number, String name, Position position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
