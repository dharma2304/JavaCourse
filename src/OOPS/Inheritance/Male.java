package OOPS.Inheritance;

/*
 Here Male class is inheriting the HumanBeing class with the help of extends keyword .
By doing this Male class will have all the properties of HumanBeing clas
 */
public class Male extends HumanBeing{

    private String chest;
    private String penis;

    public Male(){
        super();
        this.chest="chest";
        this.penis ="penis";
    }

    public Male(String chest, String penis){
        super();
        this.chest=chest;
        this.penis = penis;
    }

    public String getChest() {
        return chest;
    }

    public String getPenis() {
        return penis;
    }

    @Override
    public String toString() {
        return "Male{" +
                "chest='" + chest + '\'' +
                ", penis='" + penis + '\'' +
                '}';
    }

    public void describe() {
        System.out.println("I  am male human being");
    }
}
