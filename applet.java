import java.applet.*;
import java.awt.*;
import java.awt.*
;public class app extends Applet {
 
    public void paint(Graphics g) {
     
        int a=150,b=150,c=10,d=10;
        int p=180,q=150,r=10,s=10;
     
        g.setColor(Color.red);
        for(int i=0;i<15;i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){}
         
            g.drawOval(a, b, c, d);
            a=a-10;
            b=b-10;
            c+=8;
            d+=8;
            g.drawOval(p, q, r, s);
            p=p+3;
            q=q-10;
            r+=8;
            s+=8;
            
        }
        g.drawString("Hello World", 150,20);
    }
}

