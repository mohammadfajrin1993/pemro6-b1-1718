/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertSembilan;

/**
 *
 * @author STUDENT
 */
public class Caller {
    public void register(Callback callback){
        callback.methodToCallback();
    }
    
    public static void main(String[] args) {
      //contoh 1
        Caller c = new Caller();
        Callback callback = new CallBackimpl();
        c.register(callback);
        //contoh 2
        c.register(new Callback(){
          @Override
            public void methodToCallback() {
               System.out.print("callback 2");
            }      
        });
    
    }
}
