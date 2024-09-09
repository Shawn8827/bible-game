package com.company.GameView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.company.Main;
import com.company.Sprite.*;

public abstract class GameView {

    protected ArrayList<Sprite> elements;
    protected Door door;
    protected ImageIcon img;

    // GameView 會把所有東西畫出來
    public void drawView(Graphics g) {
        // 背景圖片icon
        img.paintIcon(null, g, 0, 0);
        //畫一個微黑色的遮罩
        g.setColor(new Color(0f, 0f, 0f, 0.3f));
        g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
        // 元素icon
        for (Sprite s : elements) {
            s.draw(g);
        }
    }

    public Door getDoor() {
        return this.door;
    }

    public ArrayList<Sprite> getElements() {
        return this.elements;
    }

}


