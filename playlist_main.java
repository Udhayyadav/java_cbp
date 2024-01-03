
package java_cbp;
import java.util.*;;

/**
 * playlist_main
 */

 class  Song{
    int id;
    String name;
    String artist;
    Double duration;

    public Song(int id,String name,String artist,Double duration)
    {
        this.id=id;
        this.name=name;
        this.artist=artist;
        this.duration=duration;

    }

    void print()
    {
        System.out.println("Id :"+this.id);
        System.out.println("Name :"+this.name);
        System.out.println("Artist :"+this.artist);
        System.out.println("Duration :"+this.duration);
    }

    
}


public class playlist_main {

    public static LinkedList<Song> songs = new LinkedList<>();
    public static LinkedList<Playlist> playlists = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int choice;
       // LinkedList<String> Song = new LinkedList<String>();
   
        Song s1 = new Song(1,"mimmi","Ritviz",4.15);
        songs.add(s1);

        Song s2 = new Song(2,"baarat","Ritviz",4.15);
        songs.add(s2);

        Song s3 = new Song(3,"Not Ramaiya Vastavaiya","Anirudh",3.22);
        songs.add(s3);

        Song s4 = new Song(4,"Kalyana vayasu","Anirudh",4.02);
        songs.add(s4);

        Song s5 = new Song(5,"Mansuke","AR Rahman",5.12);
        songs.add(s5);

        Song s6 = new Song(6,"Maaro maaro","AR Rahman",5.42);
        songs.add(s6);

 Song s7 = new Song(7,"Lover","Taylor Swift",2.56);
        Song s8 = new Song(8,"Blank Space","Taylor Swift",4.56);
        Song s9 = new Song(9,"Anti-Hero","Taylor Swift",3.35);
        Song s10 = new Song(10,"Alaiponheraa","Shreya Ghoshal",4.56);
Song s11 = new Song(11,"papa mere papa","Shreya Ghoshal",3.54);
        Song s12 = new Song(12,"Sunn Raha Hai","Shreya Ghoshal",4.32);
        Song s13 = new Song(13,"Inkem Inkem","Sid Sriram",2.56);
     Song s14 = new Song(14,"Aradhya","Sid Sriram",4.44);
    Song s15 = new Song(15,"Srivalli","Sid Sriram",3.45);
        Song s16 = new Song(16,"Kadhale Kadhale","Shankar Mahadevan",4.21);
        Song s17 = new Song(17,"Shiv Tandav Stotram","Shankar Mahadevan",5.21);
 Song s18 = new Song(18,"Dilbaro","Shankar Mahadevan",4.32);

        songs.add(s7);
        songs.add(s8);
        songs.add(s9);
        songs.add(s10);
        songs.add(s11);
     songs.add(s12);
     songs.add(s13);
        songs.add(s14);
        songs.add(s15);
        songs.add(s16);
        songs.add(s17);
        songs.add(s18);
        Song_iterator play=new Song_iterator();



    //    System.out.println(songs.get(0));
        // System.out.println("first songin the playlist:");
        // System.out.println("name:" + songs.get(0).name);
        // System.out.println("duration:" + songs.get(0).duration);
        // songs.get(0).print();

        System.out.println("Now playing");

        s1.print();

        do{

            System.out.println("enter any option ");
            System.out.println("1)play next song ");
            System.out.println("2)enter previous song ");
            System.out.println("3)Show all Songs ");
            System.out.println("4)Add/delete song to favorite");
            System.out.println("5)show favorite songs");
          //  System.out.println("6)Remove from fav ");
            System.out.println("7)List songs by artist");
            System.out.println("8)Add to playlist");
            System.out.println("9)Show playlist");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:{
                   // System.out.println("Now playing");
                     play.nextsong();
                     break;
                }
                case 2:
                {
                   // System.out.println("Now playing");
                    play.previoussong();
                    break;
                }
                case 3:
                {
                    for(Song it:songs)
                     {
                       it.print();
                    }
                    break;
                }

                case 4:
                {
                    int option;
                    do {
                        System.out.println("1)To add into fav ");
                        System.out.println("2)To delete from fav");
                        System.out.println("3)EXit from fav");
                        option=sc.nextInt();

                        switch (option) {
                            case 1:
                            {
                                System.out.println("Enter song id to add into fav");
                                int songId=sc.nextInt();
                                Favorites_song.addfavorate(songId);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Enter song id to remove from fav");
                                 int songId=sc.nextInt();
                                 Favorites_song.deleteFromFavorite(songId);
                                break;
                            }
                            default:
                                  System.out.println("Invalid option");
                                break;
                        }
                    } while (option!=3);
                    
                }

                case 5:
                {
                    Favorites_song.printfavorite();
                    break;
                }

                case 7:
                {
                    Artist_songs.artist_list();
                    break;
                }

                case 8:
                {
                    AddToPlaylist.addToPlaylist(sc,songs, playlists);
                    break;
                }

                case 9:
                {
                    if (playlists.isEmpty()) {
                        System.out.println("No playlists available rigth now.");
                    }
                    else
                    {
                    for (Playlist playlist : playlists) {
                        System.out.println("Playlist: " + playlist.name);
                        System.out.println("Songs:");
                        for (Song song : playlist.songs) {
                            song.print();
                        }
                    }
                }
                }
            }
        }while(choice!=-1);

    }
}