package java_cbp;

import java.util.LinkedList;

public class Favorites_song {
    
   public static LinkedList<Song> favoriteSongs=new LinkedList<>();

   public static void addfavorate(int id)
   {
         
        for(Song song:favoriteSongs)
        {
            if(song.id==id)
            {
                System.out.println("Already added to favorites");
                return;
            }
        }

        for(Song song:playlist_main.songs)
        {
            if(song.id==id)
            {
                favoriteSongs.add(song);
                System.out.println(song.name + " added to favorites.");
                return;
            }
        }

        System.out.println("Song with Id :"+id+" not found.");
   
   }
   public static void printfavorite()
   {
      System.out.println("Favorite song");
        for(Song song:favoriteSongs)
        {
            song.print();
        }
   }

   public static void deleteFromFavorite(int id){
    for(Song song:favoriteSongs)
    {   
        if(song.id==id)
        {  
            favoriteSongs.remove(song);
            System.out.println("Song is Successfully removed.");
            return;
        }  
    
    }
    System.out.println("Id is not found.");

   }
}
