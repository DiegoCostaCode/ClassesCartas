import Carta.Carta;

import java.util.ArrayList;
import java.util.Arrays;

public class Display {
    public static void main(String[] args) {


        var carta1 = new Carta(
                "Ghalta", "EN", "17/11/2023", "{5}{G}{G}{G}", "Legendary Creature — Elder Dinosaur", "Lost Caverns of Ixalan", "Sidharth Chaturvedi", "Mythic", true, 12, 12
        );

        ArrayList<String> related_uris = new ArrayList<String>();

        related_uris.add("tcgplayer_infinite_articles");
        related_uris.add("tcgplayer_infinite_decks");
        related_uris.add("edhrec");

        ArrayList<String> purchase_uris = new ArrayList<String>();
        purchase_uris.add("tcgplayer");
        purchase_uris.add("cardmarket");
        purchase_uris.add("cardhoarder");


        System.out.println(carta1.toString());

        System.out.println("\r\n Related Uris");
        System.out.println( Arrays.toString( related_uris.toArray() ) );

        System.out.println("\r\n Purchase Uris");
        System.out.println( Arrays.toString( purchase_uris.toArray() ) );

    }
}
