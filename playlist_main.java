
package java_cbp;
import java.util.*;;

/**
 * playlist_main
 */

 class  Song{
    int id;
    String name;
    Double duration;

    public Song(int id,String name,Double duration)
    {
        this.id=id;
        this.name=name;
        this.duration=duration;

    }

    void print()
    {
        System.out.println("Id :"+this.id);
        System.out.println("Name :"+this.name);
        System.out.println("Duration :"+this.duration);
    }

    
}


public class playlist_main {

    public static LinkedList<Song> songs = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int choice;
        LinkedList<String> Song = new LinkedList<String>();
   
        Song s1 = new Song(1,"mimmi",4.15);


        songs.add(s1);
        Song s2 = new Song(2,"baarat",4.15);


        songs.add(s2);

        Song_iterator play=new Song_iterator();



    //    System.out.println(songs.get(0));
        // System.out.println("first songin the playlist:");
        // System.out.println("name:" + songs.get(0).name);
        // System.out.println("duration:" + songs.get(0).duration);
        // songs.get(0).print();


        do{

            System.out.println("enter any option ");
            System.out.println("1)play next song ");
            System.out.println("2)enter previous song ");
            System.out.println("3)Show all Songs ");
            System.out.println("4)Add song to favorite");
            System.out.println("5)show favorite songs");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:{
                    
                     play.nextsong();
                     break;
                }
                case 2:
                {
                    play.previoussong();
                    break;
                }
                case 3:
                {
                    for(Song it:songs)
                     {
                       it.print();
                    }
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
                }
            }

        }while(choice!=-1);

    }
}