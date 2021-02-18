package be.kuleuven;

import be.kuleuven.sandbox.*;
import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new FishingNet(),
                new Kiting(),
                new StrandStoel(),
                new BucketOfWater(),
                new Jellyfish(),
                new Sneeuw(),
                new Dog(),
                new Raket()
          
        );


           System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
       
            playItem.play();
       }
    }
}
