
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

        Scanner sc=new Scanner(System.in);

        int choice;
        LinkedList<String> Song = new LinkedList<String>();
   
        Song s1 = new Song("mimmi",4.15);


        songs.add(s1);
        Song s2 = new Song("baarat",4.15);


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
            }

        }while(choice!=-1);

    }
}