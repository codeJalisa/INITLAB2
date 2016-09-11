package Hewitt.Jalisa.InitializationLab2;

import java.util.Arrays;

/**
 * Created by jalisahewitt on 9/10/16.
 */
public class ThingContainer {


   private ColorfulThing[] colorfulThings;

    public ThingContainer(int n){
        colorfulThings = new ColorfulThing[n];
    }

    public void addColor(ColorfulThing color){
        for(int i=0; i<colorfulThings.length;i++){
            if(colorfulThings[i]==null){
                colorfulThings[i]= color;
                return;
            }
        }
        System.out.println("ThingContainer is full, sorry.");

    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;
    }

    public void printThings(){
        System.out.println(Arrays.toString(this.getColorfulThings()));

    }

    public ColorfulThing Pop(){
        for(int x = colorfulThings.length-1; x >= 0; x--){
            if(colorfulThings[x] != null){
                ColorfulThing y = colorfulThings[x];
                colorfulThings[x] = null;
                return y;
        }
        }

        return null;

    }
    public ColorfulThing remove(ColorfulThing.Color removeColor) {
        for (int x= 0; x <= colorfulThings.length - 1; x++) {
            if (colorfulThings[x].getColor() == removeColor) {
                ColorfulThing y = colorfulThings[x];
                colorfulThings[x] = null;
                return y;

            }

        }
        return null;
    }
    public ColorfulThing remove(ColorfulThing rc){
        for (int x = colorfulThings.length - 1; x >= 0; x--) {
            if (colorfulThings[x] == rc) {

                ColorfulThing y = colorfulThings[x];
                colorfulThings[x] = null;
                return y;

            }
        }
        return null;


    }

}
