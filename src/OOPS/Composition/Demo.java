package OOPS.Composition;

import OOPS.Composition.Components.GraphicCard;
import OOPS.Composition.Components.Processor;
import OOPS.Composition.Laptop.Laptop;

public class Demo {
    public static void main(String [] args){
        Laptop lappy = new Laptop();
        System.out.println(lappy);
        /*
          In a laptop class we are instantiating the  Processor class and GraphicCard class . If we want to access the
          properties inside a Processor/GraphicCard classes we need to generate the getters for the processor and graphic card classes
        */

        System.out.println(lappy.getProcessor().getBrand());
        System.out.println(lappy.getGraphicCard().getSeries());


        Processor processor = new Processor(
                "intel", "7200u", 7, 4, 4 , "6MB", "2.5 GHz", "2.5 Ghz", "3.1 Ghz"
        );

        GraphicCard graphicCard = new GraphicCard(
                "Nvidia", 1050, "4GB"
        );
        Laptop gamingLaptop = new Laptop(17, processor, "DDR4", "2TB", graphicCard, null, "backlit");

        System.out.println(gamingLaptop);

        gamingLaptop.gamingMode();
        System.out.println(gamingLaptop.getProcessor().getFrequency());
    }
}
