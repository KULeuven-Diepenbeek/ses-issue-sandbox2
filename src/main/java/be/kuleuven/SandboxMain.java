package be.kuleuven;




import be.kuleuven.sandbox.BucketOfWater;
import be.kuleuven.sandbox.FishingNet;
import be.kuleuven.sandbox.Kiting;
import be.kuleuven.sandbox.SandCastle;
<<<<<<< HEAD
import be.kuleuven.sandbox.Playable;
=======
import be.kuleuven.sandbox.Zwemmen;
import be.kuleuven.sandbox.*;
import be.kuleuven.sandbox.Wind;

>>>>>>> fa8f81000e2290cf7725f639b10aacd5a3374aa0

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new FishingNet(),
                new Kiting(),
                new Zwemmen(),
                new BucketOfWater(),
                new Zwemmen(),
                new BucketOfWater(),
                new Ijsbeer(),
                new Kamperen(),
                new StrandStoel(),
                new Jellyfish(),
                new Sneeuw(),
                new Dog(),
                new Raket(),
                new sleep(),
                new BucketOfWater(),
                new LekkerBiertje(),
                new Wind(),
                new BucketOfWater(),
                new LekkerBiertje()
        );


           System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
       
            playItem.play();
       }
    }
}

class ijsbeer implements Playable {
    SandboxMain lol = new SandboxMain();

    public void play() {

    }
}
