package be.kuleuven;

import be.kuleuven.sandbox.*;
<<<<<<< HEAD

=======
>>>>>>> d6f8b418b623b4f59ca616687d41a93ee799dfea
import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new FishingNet(),
                new Kiting(),
<<<<<<< HEAD
                new BucketOfWater(),
                new Ijsbeer()

=======
                new StrandStoel(),
                new BucketOfWater(),
                new Jellyfish(),
                new Sneeuw(),
                new Dog(),
                new Raket()
          
>>>>>>> d6f8b418b623b4f59ca616687d41a93ee799dfea
        );


           System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
       
            playItem.play();
       }
    }
}
