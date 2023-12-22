package java_cbp;

import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

 class Song_iterator {
    
   private static ListIterator <Song> iterator= playlist_main.songs.listIterator();
   
   public static void nextsong()
    {
        if(iterator.hasNext())
        {
            Song it = iterator.next();
            System.out.println("playing next song:");
            it.print();
        }
        else
        {
            System.out.println("End of playlist");
        }
    }

    public static void previoussong()
    {
        if(iterator.hasPrevious())
        {
            Song it = iterator.previous();
            System.out.println("playing previous song");
            it.print();
        }
        else
        {
            System.out.println("Start of playlist");
        }
    }

//    public static void print()
//     {
//             System.out.println(iterator.next());
//     }
}
