package ie.tudublin;

import processing.data.TableRow;

public class Star {
    private String hab;
    private String displayName;
    private String distance;
    private float xG;
    private float yg;
    private float zg;
    private double absMag;
    
    public Star(String hab, String displayName, String distance, float xG, float yg, float zg, double absMag) {
        this.hab = hab;
        this.displayName = displayName;
        this.distance = distance;
        this.xG = xG;
        this.yg = yg;
        this.zg = zg;
        this.absMag = absMag;
    }

    public Star(TableRow row){
        this(
            row.getString("HabHyg"),
            row.getString("Display Name"),
            row.getString("Distance"), 
            row.getFloat("Xg"),
            row.getFloat("Yg"),
            row.getFloat("Zg"),
            row.getDouble("AbsMag")
        );
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String hab) {
        this.hab = hab;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public float getxG() {
        return xG;
    }

    public void setxG(float xG) {
        this.xG = xG;
    }

    public float getYg() {
        return yg;
    }

    public void setYg(float yg) {
        this.yg = yg;
    }

    public float getZg() {
        return zg;
    }

    public void setZg(float zg) {
        this.zg = zg;
    }

    public double getAbsMag() {
        return absMag;
    }

    public void setAbsMag(double absMag) {
        this.absMag = absMag;
    }

   
    
}

