package model;

public class Serial extends film{
    private int numberEpisodes;
    private double averageTime;


    public Serial(int id, String title, String type, String director, day publishedDay, int numberEpisodes, double averageTime) {
        super(id, title, type, director, publishedDay);
        this.numberEpisodes = numberEpisodes;
        this.averageTime = averageTime;
    }

    @Override
    public String toString() {
        return "Serial{" + super.toString() +
                ", numberEpisodes=" + numberEpisodes +
                ", averageTime=" + averageTime +
                '}';
    }

    public Serial() {}



    public int getNumberEpisodes() {
        return numberEpisodes;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void setNumberEpisodes(int numberEpisodes) {
        this.numberEpisodes = numberEpisodes;
    }

    public void setAverageTime(double averageTime) {
        this.averageTime = averageTime;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of episodes: " + this.getNumberEpisodes());
        System.out.println("Average time: " + this.getAverageTime());
    }
}
