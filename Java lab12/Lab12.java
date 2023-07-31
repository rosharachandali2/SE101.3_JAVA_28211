
package com.mycompany.lab12;


public class Lab12 {

    public static void main(String[] args) {
           while(true){
              RedLightThread rt = new RedLightThread();
              rt.run();
              
              YellowLightThread yt = new YellowLightThread();
             yt.run();
              
              GreenLightThread gt = new GreenLightThread();
              gt.run();
            }
    }
}
