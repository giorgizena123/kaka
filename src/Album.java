public class Album {
    private String name;
    private int releaseYear;
    private Music firstMusic;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void addMusic(Music music) {
        if (firstMusic == null) {
            firstMusic = music;
        } else {
            Music currentMusic = firstMusic;
            while (currentMusic.getNext() != null) {
                currentMusic = currentMusic.getNext();
            }
            currentMusic.setNext(music);
        }
    }

    public void removeMusic(Music music) {
        if (firstMusic == null) {
            return;
        }
        if (firstMusic == music) {
            firstMusic = firstMusic.getNext();
            return;
        }
        Music currentMusic = firstMusic;
        while (currentMusic.getNext() != null && currentMusic.getNext() != music) {
            currentMusic = currentMusic.getNext();
        }
        if (currentMusic.getNext() != null) {
            currentMusic.setNext(currentMusic.getNext().getNext());
        }
    }

    public void displayInfo() {
        System.out.println("Album: " + name + ", Year: " + releaseYear);
        Music currentMusic = firstMusic;
        while (currentMusic != null) {
            currentMusic.displayInfo();
            currentMusic = currentMusic.getNext();
        }
    }

    public Album getNext() {
        return null;
    }

    public void setNext(Album album) {
    }
}
