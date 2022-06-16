package at.campus02.iwi.cookathome;

public class CookSubscription {
    public int age;
    public boolean vegan;
    public boolean veggie;
    public int activePerWeek;
    String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek){
        String erg=" ";
        if(vegan==true){
            erg="Vegan";
        }
        else if(veggie){
            erg="Veggie";
        }
        else if(activePerWeek>=4 && age<=60){
            erg="Fish";
        }
        else if(age<20 || age>60){
            erg="Veggie";
        }
        else
        {
            erg="Vegan";
        }
        return erg;
    }
    public double[] suggestPrice(String box, int age){
        double [] erg =new double[2];

       double  erstePreis=0;
       double zweitePreis=0;
       if(box.equals("Fish")){
           if(age<=25){
               erstePreis=39.90;
           }
           else{
               erstePreis=49.90;
           }
           zweitePreis=80.0;
       }
       if(box.equals("Veggie")){
           if(age<=25 || age>60){
               erstePreis=19.90;
           }
           else{
               erstePreis=29.90;
           }
           zweitePreis=42.00;
       }
        if(box.equals("Vegan")){
            erstePreis=15.00;
            if(age<=30){
                zweitePreis=45.00;

            }
            else{
                zweitePreis=49.90;
            }
        }
        erg[0]=erstePreis;
        erg[1]=zweitePreis;
        return erg;
    }
}