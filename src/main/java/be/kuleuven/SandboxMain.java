package be.kuleuven;

import be.kuleuven.sandbox.BucketOfWater;
import be.kuleuven.sandbox.FishingNet;
import be.kuleuven.sandbox.Kiting;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.Playable;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new FishingNet(),
                new Kiting(),
                new BucketOfWater()
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
