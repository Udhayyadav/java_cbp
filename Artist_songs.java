package java_cbp;

import java.util.*;

public class Artist_songs {

    public static void artist_list()
    {
     Set<String> set1=new HashSet<String>();

     for(Song song:playlist_main.songs)
     {
         set1.add(song.artist);
     }
    // System.out.println(set1);

     for(String artist:set1)
     {
        System.out.println("Artist :"+artist);

        for(Song song:playlist_main.songs)
        {
            if(song.artist==artist)
            {
                System.out.println(song.name);
            }
        }

        System.out.println();
     }

    }

}
