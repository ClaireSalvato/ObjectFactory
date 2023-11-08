public class Ponies {
    //true/false -> boolean
    //numbers -> int, double
    //words -> String

    public boolean isUnicorn = false;
    public boolean isPegasus = false;
    public double size = 20.56;
    public String name = "Thoroughbred";
    public String color = "Maroon";

    public Ponies(
            String pName, String pColor, double pSize
    ){
        System.out.println("made a new pony");
        isUnicorn = false;
        isPegasus = false;
        size = pSize;
        name = pName;
        color = pColor;
        isUnicorn = true;

    }

    public void describePony(){
        System.out.println("This is " + name+" . They are the color " + color + " with a size of " + size);
    }
}
