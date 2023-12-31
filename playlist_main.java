
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
            System.out.println("4)Add song to favorite");
            System.out.println("5)show favorite songs");
            System.out.println("6)Remove from fav ");
            System.out.println("7)List songs by artist");

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
                    System.out.println("Enter song id to add into fav");
                    int songId=sc.nextInt();
                    Favorites_song.addfavorate(songId);
                    break;
                }

                case 5:
                {
                    Favorites_song.printfavorite();

                    break;
                }
                case 6:
                {
                    System.out.println("Enter song id to remove from fav");
                    int songId=sc.nextInt();
                    Favorites_song.deleteFromFavorite(songId);
                    break;
                }

                case 7:
                {
                    Artist_songs.artist_list();
                    break;
                }


            }

        }while(choice!=-1);

    }
}