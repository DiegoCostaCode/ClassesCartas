package Carta;

import java.util.ArrayList;
import java.util.List;

public class Carta {
    private String name;
    private String lang;
    private String released_at;
    private String manaCost;
    private String type_Line;
    private String set_name;
    private String illustrated_by;
    private String rarity;
    private Boolean print;
    private int power;
    private int toughness;

    public Carta(){}

    public Carta(String name, String lang, String released_at, String manaCost, String type_Line) {
        this.name = name;
        this.lang = lang;
        this.released_at = released_at;
        this.manaCost = manaCost;
        this.type_Line = type_Line;
    }

    public Carta(String name, String lang, String released_at, String manaCost, String type_Line, String set_name, String illustrated_by, String rarity, Boolean print, int power, int toughness) {
        this.name = name;
        this.lang = lang;
        this.released_at = released_at;
        this.manaCost = manaCost;
        this.type_Line = type_Line;
        this.set_name = set_name;
        this.illustrated_by = illustrated_by;
        this.rarity = rarity;
        this.print = print;
        this.power = power;
        this.toughness = toughness;
    }

    @Override
    public String toString() {
        return "///////// Carta /////////" +
                "\r\n name: " + name +
                "\r\n lang: " + lang +
                "\r\n released_at: " + released_at +
                "\r\n manaCost: " + manaCost +
                "\r\n type_Line: " + type_Line +
                "\r\n set_name: " + set_name +
                "\r\n illustrated_by='" + illustrated_by +
                "\r\n rarity: " + rarity +
                "\r\n print: " + print +
                "\r\n power: " + power +
                "/ toughness: " + toughness;
    }
}

