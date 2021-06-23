/**
 * SYST 17796 Project Base code.
 * 
 * CAMILA MIRANDA BARBOSA ID: 
 * DATE: 24 JUN, 2021
 */

package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public  class Card {
    //default modifier for child classes
    private Color color;
    private Number number;

    public Card(Color color, Number number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" + "color=" + color + ", number=" + number + '}';
    }
    
    

}

