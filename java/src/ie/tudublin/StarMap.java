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
        colorMode(HSB);
    }

    @Override
    public void setup() {
        // TODO Auto-generated method stub
        super.setup();
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


    }
}
