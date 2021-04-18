package ie.tudublin;

public class Main
{
    public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }
    
    public static void main(String[] arg)
    {
        Main main = new Main();
		main.starMap();        
    }
}
