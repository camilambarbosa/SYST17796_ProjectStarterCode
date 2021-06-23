/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author camilabarbosa
 */
public class GreenCards extends GroupOfCards  {
    
    public GreenCards(int size) {
        super(size);
        
        ArrayList<Card> cards = new ArrayList<>();
        
        cards.add(new Card (Color.GREEN, Number.ZERO));
        cards.add(new Card (Color.GREEN, Number.ONE));
        cards.add(new Card (Color.GREEN, Number.TWO));
        cards.add(new Card (Color.GREEN, Number.THREE));
        cards.add(new Card (Color.GREEN, Number.FOUR));
        cards.add(new Card (Color.GREEN, Number.FIVE));
        cards.add(new Card (Color.GREEN, Number.SIX));
        cards.add(new Card (Color.GREEN, Number.SEVEN));
        cards.add(new Card (Color.GREEN, Number.EIGHT));
        cards.add(new Card (Color.GREEN, Number.NINE));
        cards.add(new Card (Color.GREEN, Number.SKIP));
        cards.add(new Card (Color.GREEN, Number.REVERSE));
        cards.add(new Card (Color.GREEN, Number.DRAW_TWO));
        cards.add(new Card (Color.GREEN, Number.WILD));
        
        cards.add(new Card (Color.GREEN, Number.ONE));
        cards.add(new Card (Color.GREEN, Number.TWO));
        cards.add(new Card (Color.GREEN, Number.THREE));
        cards.add(new Card (Color.GREEN, Number.FOUR));
        cards.add(new Card (Color.GREEN, Number.FIVE));
        cards.add(new Card (Color.GREEN, Number.SIX));
        cards.add(new Card (Color.GREEN, Number.SEVEN));
        cards.add(new Card (Color.GREEN, Number.EIGHT));
        cards.add(new Card (Color.GREEN, Number.NINE));
        cards.add(new Card (Color.GREEN, Number.SKIP));
        cards.add(new Card (Color.GREEN, Number.REVERSE));
        cards.add(new Card (Color.GREEN, Number.DRAW_TWO));
        cards.add(new Card (Color.GREEN, Number.WILD_D4));
        
          super.setCards(cards);
    }
    
}
