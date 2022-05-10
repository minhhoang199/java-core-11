package model;

public class Movie extends film {
    private double time; //hours

    @Override
    public String toString() {
        return "Movie{" + super.toString() +
                ", time=" + time +
                '}';
    }

    public Movie() {}

    public Movie(int id, String title, String type, String director, day publishedDay, double time) {
        super(id, title, type, director, publishedDay);
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Time: " + this.getTime());
    }
}
