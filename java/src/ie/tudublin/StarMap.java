package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet{
    ArrayList<Star> stars = new ArrayList<Star>();

    @Override
    public void settings() {
        // TODO Auto-generated method stub
        super.settings();
    }

    @Override
    public void setup() {
        // TODO Auto-generated method stub
        super.setup();
        loadData();
    }

    public void loadData(){
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow row: table.rows())
        {
            Star s = new Star(row);
            stars.add(s);
        }
    }




}
