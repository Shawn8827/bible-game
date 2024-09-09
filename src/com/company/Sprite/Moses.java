package com.company.Sprite;

import com.company.GameView.DisasterView;
import com.company.GameView.RedSeaGameView;
import com.company.GameView.TenCommandmentsView;
import com.company.Main;
import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;
import com.company.Sprite.RedSeaViewSprite.Anubis;
import com.company.Sprite.RedSeaViewSprite.Cat;
import com.company.Sprite.RedSeaViewSprite.Pharaoh;
import com.company.Sprite.TemCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class Moses extends Sprite {

    public Moses(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon("Moses.png");
    }

    @Override
    public String overlap(int x, int y) {
        // 第一個場景 Disaster 的判斷
        if (Main.gameView instanceof DisasterView) {
            // Check for bugs and frogs
            ArrayList<Frog> frogs = ((DisasterView) Main.gameView).getFrogs();
            ArrayList<Bug> bugs = ((DisasterView) Main.gameView).getBugs();
            for (Frog f : frogs) {
                if (f.getRelativePosition() != null && x == f.getRelativePosition().x && y == f.getRelativePosition().y) {
                    return "Die";
                }
            }
            for (Bug b : bugs) {
                if (b.getRelativePosition() != null && x == b.getRelativePosition().x && y == b.getRelativePosition().y) {
                    return "Die";
                }
            }

            // Check for ice and tombstone
            ArrayList<Ice> ices = ((DisasterView) Main.gameView).getIceCubes();
            ArrayList<Tombstone> tombstones = ((DisasterView) Main.gameView).getStones();
            for (Tombstone s : tombstones) {
                if (s.getRelativePosition() != null && x == s.getRelativePosition().x && y == s.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            for (Ice i : ices) {
                if (i.getRelativePosition() != null && x == i.getRelativePosition().x && y == i.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            // check for door
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y) {
                return "Next level";
            }
        }
        //第二個場景 RedSea 的判斷
        else if (Main.gameView instanceof RedSeaGameView) {
            // Check for cats
            ArrayList<Cat> cats = ((RedSeaGameView) Main.gameView).getCats();
            for (Cat c : cats) {
                if (c.getRelativePosition() != null && x == c.getRelativePosition().x && y == c.getRelativePosition().y) {
                    return "Cannot move";
                }
            }

            // Check for anubis and pharaoh
            ArrayList<Anubis> anubis = ((RedSeaGameView) Main.gameView).getAnubis();
            ArrayList<Pharaoh> pharaohs = ((RedSeaGameView) Main.gameView).getPharaohs();
            for (Anubis a : anubis) {
                if (a.getRelativePosition() != null && x == a.getRelativePosition().x && y == a.getRelativePosition().y) {
                    return "Die";
                }
            }
            for (Pharaoh p : pharaohs) {
                if (p.getRelativePosition() != null && x == p.getRelativePosition().x && y == p.getRelativePosition().y) {
                    return "Die";
                }
            }
            //碰到門進下一關
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y) {
                return "Next level";
            }
        }
        //第三個場景 TenCommandment 的判斷
        else if (Main.gameView instanceof TenCommandmentsView) {
            ArrayList<Cat> cats = ((TenCommandmentsView) Main.gameView).getCats();
            ArrayList<Ice> ices = ((TenCommandmentsView) Main.gameView).getIces();
            ArrayList<Frog> frogs = ((TenCommandmentsView) Main.gameView).getFrogs();
            ArrayList<Pharaoh> pharaohs = ((TenCommandmentsView) Main.gameView).getPharaohs();
            for (Cat c : cats) {
                if (c.getRelativePosition() != null && x == c.getRelativePosition().x && y == c.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            for (Ice i : ices) {
                if (i.getRelativePosition() != null && x == i.getRelativePosition().x && y == i.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            for (Frog f : frogs) {
                if (f.getRelativePosition() != null && x == f.getRelativePosition().x && y == f.getRelativePosition().y) {
                    return "Die";
                }
            }
            for (Pharaoh p : pharaohs) {
                if (p.getRelativePosition() != null && x == p.getRelativePosition().x && y == p.getRelativePosition().y) {
                    return "Die";
                }
            }
            ArrayList<TenCommandment> stones = ((TenCommandmentsView) Main.gameView).getStones();
            for (TenCommandment stone : stones) {
                if (stone.getRelativePosition() != null && x == stone.getRelativePosition().x && y == stone.getRelativePosition().y) {
                    stone.setNullPosition();
                    ((TenCommandmentsView) Main.gameView).setCount(1);

                }
            }
            //收集到10顆stone
            if (((TenCommandmentsView) Main.gameView).getCount() == 10) {
                return "Game over";
            } else {
                return "none";
            }
        }

        //啥都沒碰到,沒事
        return "none";
    }
}
