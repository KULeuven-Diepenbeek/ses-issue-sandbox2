package be.kuleuven;

<<<<<<< HEAD

import be.kuleuven.sandbox.BucketOfWater;
import be.kuleuven.sandbox.FishingNet;
import be.kuleuven.sandbox.Kiting;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.Zwemmen;

import be.kuleuven.sandbox.*;

=======
import be.kuleuven.sandbox.*;
>>>>>>> IceCreamUpdate

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new FishingNet(),
                new Kiting(),
<<<<<<< HEAD

                new Zwemmen(),
                new BucketOfWater()

                new BucketOfWater(),
                new Ijsbeer()
                new Kamperen(),
                new StrandStoel(),
                new BucketOfWater(),
                new Jellyfish(),
                new Sneeuw(),
                new Dog(),
                new Raket()

=======
                new BucketOfWater(),
                new IceCream()
>>>>>>> IceCreamUpdate
        );


           System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
       
            playItem.play();
       }
    }
}
