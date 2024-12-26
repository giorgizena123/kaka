public class Music extends Playable {
    private String title;
    private int duration;
    private String genre;
    private Artist artist;


    public Music(String title, int duration, String genre, Artist artist) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.artist = artist;
    }


    public Music(String title, int duration, String genre) {
        this(title, duration, genre, null);
    }


    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public Artist getArtist() {
        return artist;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + (artist != null ? artist.getName() : "Unknown artist"));
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + title);
    }

    public Music getNext() {
        return null;
    }

    public void setNext(Music music) {
    }
}
