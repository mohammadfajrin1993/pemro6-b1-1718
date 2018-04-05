/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertdelapan;

/**
 *
 * @author STUDENT
 */
public class Main {
    public static void main(String[] args) {
      Superhero agus;
      agus = new Superhero();
      agus.mainPower();
      
      agus = new Superman();
      agus.mainPower();
      
      agus = new Batman();
      agus.mainPower();
      
    }
}
