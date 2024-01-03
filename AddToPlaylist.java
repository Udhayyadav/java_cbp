package java_cbp;

import java.util.Scanner;
import java.util.LinkedList;

public class AddToPlaylist {

    public static void addToPlaylist(Scanner scanner, LinkedList<Song> songs, LinkedList<Playlist> playlists) {
        int choice;
        do {
            System.out.println("Add to Playlist menu:");
            System.out.println("1) adds song to existing playlist");
            System.out.println("2)create new playlist and add song");
            System.out.println("3)Exit Add to Playlist Menu");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                   { addSongToExistingPlaylist(scanner, songs, playlists);
                    break;}
                case 2:
                    {createPlaylistAndAddSong(scanner, songs, playlists);
                    break;} }
        } while (choice != 3);
    }

    private static void addSongToExistingPlaylist(Scanner scanner, LinkedList<Song> songs, LinkedList<Playlist> playlists) {
        System.out.println("please Enter playlist name:");
        scanner.nextLine(); 
        String playlistName = scanner.nextLine();
        Playlist playlist = findOrCreatePlaylist(playlistName, playlists);

        System.out.println("Enter song id toadd to playlist '" + playlistName + "':");
        int songId = scanner.nextInt();
        Song selectedSong = SongsId(songId, songs);

        if (selectedSong != null) {
            playlist.addSong(selectedSong);
        } else {
            System.out.println("invalid song id");   }
    }

    private static void createPlaylistAndAddSong(Scanner scanner, LinkedList<Song>songs, LinkedList<Playlist> playlists) {
        System.out.println("Enter new playlist name:");
        scanner.nextLine();
        String playlistName = scanner.nextLine();
        Playlist newPlaylist = new Playlist(playlistName);
        playlists.add(newPlaylist);
        System.out.println("Playlist '" + playlistName + "' created.");

        System.out.println("Enter song id to add to the new playlist:");
        int songId =scanner.nextInt();
        Song selectedSong =SongsId(songId, songs);

        if (selectedSong != null) {
            newPlaylist.addSong(selectedSong);
        } else {
            System.out.println("Invalid song id.");}
    }

    private static Playlist findOrCreatePlaylist(String playlistName, LinkedList<Playlist> playlists) {
        for (Playlist playlist :playlists) {
            if (playlist.name.equalsIgnoreCase(playlistName)) {
                return playlist;}
        }
        Playlist newPlaylist =new Playlist(playlistName);
        playlists.add(newPlaylist);
        System.out.println("Playlist '" + playlistName + "'created.");
        return newPlaylist;
    }

    private static Song SongsId(int songId, LinkedList<Song> songs) {
        for (Song song :songs) {
            if (song.id == songId) {
                return song;}
        }
        return null;
    }
}

class Playlist {
    String name;
    LinkedList<Song> songs = new LinkedList<>();
    public Playlist(String name) {
        this.name = name;
    }
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song '" + song.name + "' added to playlist '" + name + "'.");
    }
}
