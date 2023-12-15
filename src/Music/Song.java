package Music;

public class Song {
    private String name;
    private Double duration;
    private Styles style;

    public Song(String name, Double duration, Styles style) {
        this.name = name;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Styles getStyle() {
        return style;
    }

    public void setStyle(Styles style) {
        this.style = style;
    }

    public String toString() {
        return "Name: " + getName() +
                ", Duration: " + getDuration() +
                ", Style: " + getStyle();
    }

}
