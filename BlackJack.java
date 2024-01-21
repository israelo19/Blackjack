
/**
 * @Israel Ogwu
 * 
 * BlackJack game
 * 01/21/2023
 * 
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class BlackJack { // this is the game, the game itself
    private class Card { // this class creates the cards
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }

        public String toString() {
            return type + "-" + value;
        }
    }

    ArrayList<Card> deck; // A deeck is a "collection" of cards so it would make sense to use an
                          // ArrayList.
    // ^^Pun not intended lol
    Random random = new Random(); // created to shuffle deck.

    public void startGame() { // method that starts the game, it will call other methods
        makeDeck(); // creates the deck
        shuffleDeck(); // shuffles the deck

    }

    public void makeDeck() { // using the collections framework, ArrayList, it creates a collection of cards
                             // and fills in the deck accordingly
        deck = new ArrayList<Card>();
        String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] types = { "C", "D", "H", "S" };

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Card card = new Card(types[i], values[j]);
                deck.add(card);
            }
        }
        System.out.println(deck);
    }

    public void shuffleDeck() {
        // deck = new ArrayList<Card>();

        for (int i = 0; i < deck.size(); i++) {
            int j = random.nextInt(deck.size());
            Card currCard = deck.get(i);
            Card rand = deck.get(j);
            deck.set(i, rand);
            deck.set(j, currCard);
        }
        System.out.println("Shuffled:");

        System.out.println(deck);

    }
}
