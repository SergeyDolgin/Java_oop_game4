package units;

/**Колдун*/
public class Magician extends Priest {

    public Magician(String side, int x, int y){
        super("Magician__", side, "Harry", 30, 17, 9, 5, 5, 12, x, y, 1); 
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Колдун";}

}