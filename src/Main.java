public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Object Factory!");
        Ponies p;
        p = new Ponies("Sarah",  "Purple", 5);
        System.out.println(p.isUnicorn);
        p.isUnicorn=true;
        System.out.println(p.isUnicorn);
        System.out.println(p.name);
        p.describePony();


        p.describePony();




        Ponies r;
        r = new Ponies("pName", "Maroon",45.2);
        r.isPegasus = true;
        r.isUnicorn = true;
        r.describePony();

        Ponies a;
        a = new Ponies ("Teddy",  "Red",5);

        Ponies l;
        l = new Ponies ("Anne","Blue",12);

        bedrooms br;
        br = new bedrooms ("Twin","Maroon",20 );
        br.describebedrooms();


    }
}