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
public class YellowCards extends GroupOfCards {
    
    public YellowCards(int size) {
        super(size);
        
        ArrayList<Card> cards = new ArrayList<>();
        
        cards.add(new Card (Color.YELLOW, Number.ZERO));
        cards.add(new Card (Color.YELLOW, Number.ONE));
        cards.add(new Card (Color.YELLOW, Number.TWO));
        cards.add(new Card (Color.YELLOW, Number.THREE));
        cards.add(new Card (Color.YELLOW, Number.FOUR));
        cards.add(new Card (Color.YELLOW, Number.FIVE));
        cards.add(new Card (Color.YELLOW, Number.SIX));
        cards.add(new Card (Color.YELLOW, Number.SEVEN));
        cards.add(new Card (Color.YELLOW, Number.EIGHT));
        cards.add(new Card (Color.YELLOW, Number.NINE));
        cards.add(new Card (Color.YELLOW, Number.SKIP));
        cards.add(new Card (Color.YELLOW, Number.REVERSE));
        cards.add(new Card (Color.YELLOW, Number.DRAW_TWO));
        cards.add(new Card (Color.YELLOW, Number.WILD));
        
        cards.add(new Card (Color.YELLOW, Number.ONE));
        cards.add(new Card (Color.YELLOW, Number.TWO));
        cards.add(new Card (Color.YELLOW, Number.THREE));
        cards.add(new Card (Color.YELLOW, Number.FOUR));
        cards.add(new Card (Color.YELLOW, Number.FIVE));
        cards.add(new Card (Color.YELLOW, Number.SIX));
        cards.add(new Card (Color.YELLOW, Number.SEVEN));
        cards.add(new Card (Color.YELLOW, Number.EIGHT));
        cards.add(new Card (Color.YELLOW, Number.NINE));
        cards.add(new Card (Color.YELLOW, Number.SKIP));
        cards.add(new Card (Color.YELLOW, Number.REVERSE));
        cards.add(new Card (Color.YELLOW, Number.DRAW_TWO));
        cards.add(new Card (Color.YELLOW, Number.WILD_D4));
        
        
          super.setCards(cards);
    }
    
}
