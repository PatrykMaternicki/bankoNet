
package bankonet;

public class UserObserver {
    
    private IState creditCard;

    public UserObserver(IState creditCard) {
        this.creditCard = creditCard;
    }

   
    
    public boolean checkUser(){
    if (creditCard.getCounter() == 3){
        creditCard.changeState(false);
    }
    if (creditCard.checkState()){
        return true;
    }
    if (!creditCard.checkState()){
        return false;
    }
    return false;
    }
     public void addCounter()
    {
        int nowCounter = creditCard.getCounter();
        int afterCounter = nowCounter + 1;
        creditCard.setCounter(afterCounter);
    }
    public void resetCounter(){
        creditCard.setCounter(0);
    }
    
}
