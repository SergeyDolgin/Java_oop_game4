package units;

/**Монах*/
public class Monk extends Priest {

    public Monk(String side, int x, int y){
        super("Monk______", side, "Polit", 30, 12, 5, 4, 4, 7, x, y, 1);
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Монах: ";}

}