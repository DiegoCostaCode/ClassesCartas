package Carta;

import java.util.ArrayList;
import java.util.List;

public abstract class Carta {
    private String Nome;
    private String URLdaimagem;
    private String Lang;
    private String ManaCost;
    private String Type_Line;
    private String descricao;
    private int Power;
    private int Toughness;
    private String Ilustrador;
    private int Data;
    private String Deck;
    private String Print;

    private List<String> Related_Uris = new ArrayList<>();
    private List<String> Purchase_Uris = new ArrayList<>();

}
