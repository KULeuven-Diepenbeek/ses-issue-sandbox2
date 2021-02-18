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

                new Vissen()

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




                new BucketOfWater(),
                new LekkerBiertje(),


                new BucketOfWater(),
                new IceCream(),


                new LekkerBiertje(),
                new Wind(),
                new BucketOfWater(),
                new LekkerBiertje(),
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
