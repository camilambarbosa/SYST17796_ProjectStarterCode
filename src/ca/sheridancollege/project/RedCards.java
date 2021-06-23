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
public class RedCards extends GroupOfCards{
    
    public RedCards(int size) {
        super(size);
        
        ArrayList<Card> cards = new ArrayList<>();
        
        cards.add(new Card (Color.RED, Number.ZERO));
        cards.add(new Card (Color.RED, Number.ONE));
        cards.add(new Card (Color.RED, Number.TWO));
        cards.add(new Card (Color.RED, Number.THREE));
        cards.add(new Card (Color.RED, Number.FOUR));
        cards.add(new Card (Color.RED, Number.FIVE));
        cards.add(new Card (Color.RED, Number.SIX));
        cards.add(new Card (Color.RED, Number.SEVEN));
        cards.add(new Card (Color.RED, Number.EIGHT));
        cards.add(new Card (Color.RED, Number.NINE));
        cards.add(new Card (Color.RED, Number.SKIP));
        cards.add(new Card (Color.RED, Number.REVERSE));
        cards.add(new Card (Color.RED, Number.DRAW_TWO));
        cards.add(new Card (Color.RED, Number.WILD));
        
        cards.add(new Card (Color.RED, Number.ONE));
        cards.add(new Card (Color.RED, Number.TWO));
        cards.add(new Card (Color.RED, Number.THREE));
        cards.add(new Card (Color.RED, Number.FOUR));
        cards.add(new Card (Color.RED, Number.FIVE));
        cards.add(new Card (Color.RED, Number.SIX));
        cards.add(new Card (Color.RED, Number.SEVEN));
        cards.add(new Card (Color.RED, Number.EIGHT));
        cards.add(new Card (Color.RED, Number.NINE));
        cards.add(new Card (Color.RED, Number.SKIP));
        cards.add(new Card (Color.RED, Number.REVERSE));
        cards.add(new Card (Color.RED, Number.DRAW_TWO));
        cards.add(new Card (Color.RED, Number.WILD_D4));
        
          super.setCards(cards);
    }
    
}
