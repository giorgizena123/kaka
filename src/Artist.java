
public class Artist {
    private String name;
    private Album firstAlbum;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAlbum(Album album) {

        if (firstAlbum == null) {
            firstAlbum = album;
            return;
        }


        Album currentAlbum = firstAlbum;
        while (currentAlbum.getNext() != null) {
            currentAlbum = currentAlbum.getNext();
        }


        currentAlbum.setNext(album);
    }

    public void removeAlbum(Album album) {
        if (firstAlbum == null) {
            return;
        }


        if (firstAlbum == album) {
            firstAlbum = firstAlbum.getNext();
            return;
        }


        Album currentAlbum = firstAlbum;
        while (currentAlbum.getNext() != null && currentAlbum.getNext() != album) {
            currentAlbum = currentAlbum.getNext();
        }


        if (currentAlbum.getNext() != null) {

            currentAlbum.setNext(currentAlbum.getNext().getNext());
        }
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
        Album currentAlbum = firstAlbum;
        while (currentAlbum != null) {
            currentAlbum.displayInfo();
            currentAlbum = currentAlbum.getNext();
        }
    }

    public Artist getNext() {
        return null;
    }

    public void setNext(Artist artist) {
    }
}
