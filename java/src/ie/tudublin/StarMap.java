package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet{
    ArrayList<Star> stars = new ArrayList<Star>();
    private float border = 50;

    @Override
    public void settings() {
        // TODO Auto-generated method stub
        super.settings();
        size(800, 800);
       
    }

    @Override
    public void setup() {
        // TODO Auto-generated method stub
        super.setup();
        colorMode(HSB);
        loadData();
        printStars();
    }

    public void loadData(){
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow row: table.rows())
        {
            Star s = new Star(row);
            stars.add(s);
        }
    }

    public void printStars(){
        for(Star s: stars){
            //s.toString();
            println(s);
        }
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        super.draw();
        background(0);

        //grid
        for(int i = -5; i< 5; i++){
            //Location
            // float x = map(i, -5, 5, 0 + 50, width - 50);
            // float y = map(i, -5, 5, 0 + 50, height - 50);
            float x = map(i, 1, 10, 0 + 50, width - 50);
            float y = map(i, 1, 10, 0 + 50, height - 50);

            //Appearance
            fill(294, 100, 10);

            //draw 
            line(x, border, x, width - border);

           // line(y, border, x, height - border);

           // text
           text(i, x, border / 20);
        }

    }
}
