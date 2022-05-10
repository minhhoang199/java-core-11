package model;

public class film {
    private int id;
    private String title, type, director;
    private day publishedDay;

    public film() {}

    public film(int id, String title, String type, String director, day publishedDay) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.director = director;
        this.publishedDay = publishedDay;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getDirector() {
        return director;
    }

    public day getPublishedDay() {
        return publishedDay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setPublishedDay(day publishedDay) {
        this.publishedDay = publishedDay;
    }

    //In thông tin film
    public void showInfo() {
        System.out.println("ID: " + this.getId());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Type: " + this.getType());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Published day: " + this.getPublishedDay());
    }

    @Override
    public String toString() {
        return "film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", director='" + director + '\'' +
                ", publishedDay=" + publishedDay +
                '}';
    }
}
