package units;

/**Крестьянин*/
public class Villager extends Warrior {
  

    public Villager(String side, int x, int y) {
        super("Villager__", side, "Green", 1, 1, 1, 1, 1, 1, x, y, 1);
       
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() {return "Я Крестьянин: ";}

}
