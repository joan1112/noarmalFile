package LertView;

import java.awt.*;
import javax.swing.*;


public class CustomeView{





    public CustomeView(){
        Frame jp1 = new Frame();
        Button bt = new Button("button1");
        Button bt2 = new Button("button2");

        FlowLayout lay = new FlowLayout(FlowLayout.RIGHT,20,40);

        jp1.add(bt);
        jp1.add(bt2);
        jp1.setLayout(lay);
        jp1.setVisible(true);
        jp1.setSize(200, 200);


    }
    void  RUN(){

    }



}
