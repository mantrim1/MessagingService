/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class ConsoleOutputMessageStrategy implements OutputMessageStrategy {

    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
}
