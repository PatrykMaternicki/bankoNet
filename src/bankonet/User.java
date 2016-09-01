/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankonet;

public class User implements IState {
    
    private int counter;
    private String password = "";
    private boolean isBlock;

    public String getPassword() {
        return password;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean checkState(){
        return isBlock;
    }

    public boolean isIsBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }
    
    public void changeState (boolean State){
        setIsBlock(State);
    }
    
User (int counter, String password, boolean isBlock){
    
this.counter = counter;
this.password = password;
this.isBlock = isBlock;
}

    
}
