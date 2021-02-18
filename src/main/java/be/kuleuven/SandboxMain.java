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
                new BucketOfWater(),
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
                new Wind()
        );


           System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
       
            playItem.play();
       }
    }
}
