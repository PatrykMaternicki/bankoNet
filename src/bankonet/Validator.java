/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankonet;

import java.util.List;


public class Validator implements IValidState{
    
    public IState creditCard;
    private UserObserver observer;

    public Validator(IState creditCard, UserObserver observer) {
        this.creditCard = creditCard;
        this.observer = observer;
    }
    
    private boolean isCorectValid = true;

    public boolean isIsCorectValid() {
        return isCorectValid;
    }

    public void setIsCorectValid(boolean isCorectValid) {
        this.isCorectValid = isCorectValid;
    }


    
    
    
    public void isCorect(String inputPIN)
    {
        String usedString = creditCard.getPassword();
        System.out.print(usedString);
        System.out.print(inputPIN);
        if (usedString.equals(inputPIN))
        {
           
           observer.resetCounter();
        }
        else {
            observer.addCounter();
            changeState(false);
        }
            
    }

   

    public boolean getState() {
    return isIsCorectValid();
    }
    
    public void changeState(boolean State) {
   setIsCorectValid(State);
    }
    
   
}  

