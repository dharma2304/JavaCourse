package OOPS.Inheritance;

/*
 Here Female class is inheriting the HumanBeing class with the help of extends keyword .
By doing this Female class will have all the properties of HumanBeing clas
 */
public class Female extends HumanBeing {
    private String breasts;
    private String vagina;


    public Female(){
        super();
    }

    public Female(String breasts, String vagina){
        super();
        this.breasts = breasts;
        this.vagina = vagina;
    }

}
