/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankonet;

public interface IState  {
    public boolean checkState();
    public void changeState(boolean State);
    public int getCounter();
    public String getPassword();
    public void setCounter(int counter);
 
}
