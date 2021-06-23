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
public class BlueCards extends GroupOfCards{
    
    public BlueCards(int size) {
        super(size);
        
        ArrayList<Card> cards = new ArrayList<>();
        
        cards.add(new Card (Color.BLUE, Number.ZERO));
        cards.add(new Card (Color.BLUE, Number.ONE));
        cards.add(new Card (Color.BLUE, Number.TWO));
        cards.add(new Card (Color.BLUE, Number.THREE));
        cards.add(new Card (Color.BLUE, Number.FOUR));
        cards.add(new Card (Color.BLUE, Number.FIVE));
        cards.add(new Card (Color.BLUE, Number.SIX));
        cards.add(new Card (Color.BLUE, Number.SEVEN));
        cards.add(new Card (Color.BLUE, Number.EIGHT));
        cards.add(new Card (Color.BLUE, Number.NINE));
        cards.add(new Card (Color.BLUE, Number.SKIP));
        cards.add(new Card (Color.BLUE, Number.REVERSE));
        cards.add(new Card (Color.BLUE, Number.DRAW_TWO));
        cards.add(new Card (Color.BLUE, Number.WILD));
        
        cards.add(new Card (Color.BLUE, Number.ONE));
        cards.add(new Card (Color.BLUE, Number.TWO));
        cards.add(new Card (Color.BLUE, Number.THREE));
        cards.add(new Card (Color.BLUE, Number.FOUR));
        cards.add(new Card (Color.BLUE, Number.FIVE));
        cards.add(new Card (Color.BLUE, Number.SIX));
        cards.add(new Card (Color.BLUE, Number.SEVEN));
        cards.add(new Card (Color.BLUE, Number.EIGHT));
        cards.add(new Card (Color.BLUE, Number.NINE));
        cards.add(new Card (Color.BLUE, Number.SKIP));
        cards.add(new Card (Color.BLUE, Number.REVERSE));
        cards.add(new Card (Color.BLUE, Number.DRAW_TWO));
        cards.add(new Card (Color.BLUE, Number.WILD_D4));
    
       
        
        
        super.setCards(cards);
       
        
       
    }
    
}
