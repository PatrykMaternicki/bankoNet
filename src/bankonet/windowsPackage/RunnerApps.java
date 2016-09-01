/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankonet.windowsPackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patryk
 */
public class RunnerApps implements Runabble {
  
    
   public void run(int timer)
   {
       try {
           Thread.sleep(2000);
       } catch (InterruptedException ex) {
           Logger.getLogger(RunnerApps.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    

}
