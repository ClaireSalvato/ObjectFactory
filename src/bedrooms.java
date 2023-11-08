public class bedrooms {

    public boolean isClean = true;
    public boolean isMessy = false;
    public double size = 20;
    public String name = "Bedroom";
    public String color = "Maroon";
    public boolean isRug = true;


    public bedrooms(
            String pName, String pColor, double pSize
    ) {
        System.out.println("made my bedroom");
        isClean = true;
        isMessy = false;
        isRug = true;
        size = pSize;
        name = pName;
        color = pColor;
        isClean = true;

    }

    public void describebedrooms(){
        System.out.println("This is " + name+" . They are the color " + color + " with a size of " + size + "It have a rug." + "It is a twin sized bed, henc the name Twin." + "It is " + isClean + "that the bedroom is clean.");
    }
}


