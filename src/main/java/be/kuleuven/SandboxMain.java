package be.kuleuven;

<<<<<<< HEAD



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

=======
import be.kuleuven.sandbox.*;
>>>>>>> 85ae6b1b4df77831de7983c448ff10798da8d013
import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new FishingNet(),
                new Kiting(),
                new BucketOfWater(),
                new Raket(),
                new Gocarten(),
                new Zee(),
                new Zwemmen(),
                new Ijsbeer(),
                new Kamperen(),
                new StrandStoel(),
                new Jellyfish(),
                new Sneeuw(),
                new Dog(),
                new Raket(),
                new sleep(),
                new LekkerBiertje(),
                new Wind(),
                new BucketOfWater(),
                new LekkerBiertje()
                new Wind()
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
