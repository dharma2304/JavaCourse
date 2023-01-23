package OOPS.Composition.Laptop;

import OOPS.Composition.Components.GraphicCard;
import OOPS.Composition.Components.Processor;

public class Laptop {

     /*
      Composition is basically the inclusion of other classes in a class. This class is dependent on other classes.
      The parent class have HAS-A relationship with other classes which is different compared to inheritance (IS-A).
      */
     private float screen;
     private Processor processor;
     private String ram;
     private String hardDrive;
     private GraphicCard graphicCard;
     private String opticalDrive;
     private String keyBoard;

     public Laptop() {
          this.screen = 15.6f;
          this.processor = new Processor();
          this.ram = "DDR4";
          this.hardDrive = "2 TB";
          this.graphicCard = new GraphicCard();
          this.opticalDrive = "MLT Layer";
          this.keyBoard = "backlit";
     }

     public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphicCard, String opticalDrive, String keyBoard) {
          this.screen = screen;
          this.processor = processor;
          this.ram = ram;
          this.hardDrive = hardDrive;
          this.graphicCard = graphicCard;
          this.opticalDrive = opticalDrive;
          this.keyBoard = keyBoard;
     }



     @Override
     public String toString() {
          return "Laptop{" +
                  "screen=" + screen +
                  ", processor=" + processor +
                  ", ram='" + ram + '\'' +
                  ", hardDrive='" + hardDrive + '\'' +
                  ", graphicCard=" + graphicCard +
                  ", opticalDrive='" + opticalDrive + '\'' +
                  ", keyBoard='" + keyBoard + '\'' +
                  '}';
     }

     public float getScreen() {
          return screen;
     }

     public Processor getProcessor() {
          return processor;
     }

     public String getRam() {
          return ram;
     }

     public String getHardDrive() {
          return hardDrive;
     }

     public GraphicCard getGraphicCard() {
          return graphicCard;
     }

     public String getOpticalDrive() {
          return opticalDrive;
     }

     public String getKeyBoard() {
          return keyBoard;
     }

     public void gamingMode(){
          processor.setFrequency(processor.getMaxFrequency());
     }
}
