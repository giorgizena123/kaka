public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("Song1", 180, "Pop");
        Music music2 = new Music("Song2", 240, "Rock");
        Music music3 = new Music("Song3", 300, "Jazz");

        Album album1 = new Album("Best Hits", 2023);
        album1.addMusic(music1);
        album1.addMusic(music2);

        Album album2 = new Album("New Sounds", 2024);
        album2.addMusic(music3);

        Artist artist1 = new Artist("luka");
        artist1.addAlbum(album1);
        artist1.addAlbum(album2);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist1);


        Music foundMusic = library.searchMusic("Song1");
        if (foundMusic != null) {
            System.out.println("Found Music: " + foundMusic.getTitle());
        } else {
            System.out.println("Music not found.");
        }


        Music randomMusic = library.giveRandomMusic();
        if (randomMusic != null) {
            System.out.println("Random Music: " + randomMusic.getTitle());
            randomMusic.play();
            randomMusic.stop();
        }

        artist1.displayInfo();
        album1.displayInfo();
    }
}
