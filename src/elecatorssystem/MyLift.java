/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecatorssystem;

/**
 *
 * @author krazybee
 */
public class MyLift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome"); 
        // RequestListenerThread to read requested floor and add to Set 
        Thread requestListenerThread = new Thread(new RequestListener(), 
                "RequestListenerThread"); 
        // RequestProcessorThread to read Set and process requested floor 
        Thread requestProcessorThread = new Thread(new RequestProcessor(), 
                "RequestProcessorThread"); 
         
        Elevator.getInstance().setRequestProcessorThread(requestProcessorThread); 
         
        requestListenerThread.start(); 
        requestProcessorThread.start(); 
         
         
   
        
    }
    
}
