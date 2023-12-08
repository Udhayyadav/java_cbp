
package java_cbp;
import java.util.*;;

/**
 * playlist_main
 */

 class  Song{

    String name;
    Double duration;

    public Song(String name,Double duration)
    {
        this.name=name;
        this.duration=duration;

    }

    void print()
    {
        System.out.println("name :"+this.name);
        System.out.println("time :"+this.duration);
    }

    
}


public class playlist_main {

    public static LinkedList<Song> songs = new LinkedList<>();

    public static void main(String[] args) {

        LinkedList<String> Song = new LinkedList<String>();
   
        Song s1 = new Song("mimmi",4.15);


        songs.add(s1);
        Song s2 = new Song("baarat",4.15);


        songs.add(s2);

    //    System.out.println(songs.get(0));
        // System.out.println("first songin the playlist:");
        // System.out.println("name:" + songs.get(0).name);
        // System.out.println("duration:" + songs.get(0).duration);
        // songs.get(0).print();

        for(Song i:songs)
        {
            i.print();
        }

    }
}