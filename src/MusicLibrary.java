
public class MusicLibrary {
    private Artist artistHead;
    private Album albumHead;
    private Music songHead;

    public void addArtist(Artist artist) {
        if (artistHead == null) {
            artistHead = artist;
        } else {
            Artist current = artistHead;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(artist);
        }
    }

    public void removeArtist(Artist artist) {
        if (artistHead == null) {
            return;
        }
        if (artistHead == artist) {
            artistHead = artistHead.getNext();
            return;
        }
        Artist current = artistHead;
        while (current.getNext() != null && current.getNext() != artist) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    public Music searchMusic(String title) {
        Music current = songHead;
        while (current != null) {
            if (current.getTitle().equals(title)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public Music giveRandomMusic() {
        if (songHead == null) {
            return null;
        }
        int count = 0;
        Music current = songHead;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        int randomIndex = (int) (Math.random() * count);
        current = songHead;
        for (int i = 0; i < randomIndex; i++) {
            current = current.getNext();
        }
        return current;
    }
}
