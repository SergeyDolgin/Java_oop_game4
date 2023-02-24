package units;

import java.util.ArrayList;

/**Снайпер*/
public class Sniper extends Shooter {

    public Sniper(String side, int x, int y){
        super("Sniper____", side, "Eagle", 15, 12, 9, 10, 8, 10, 32, x, y);
             
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Снайпер";}


    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2){
        // алгоритм стрельбы только во врагов
        if (this.side == "LIGHT") {
            if (this.health <= 0) { System.out.println("Этот герой мертв"); }
            if (this.shoot <= 0) {     System.out.println("У этого героя нет стрел"); }
            else {
                /** Поиск наиболее приближённого врага */
                Double distanceToEnemy; 
                Double temp = Point2D.Distance(team2.get(0));
                Integer nearIndex = 0; 
                for (int i = 1; i < 10; i++) {
                    distanceToEnemy = Point2D.Distance(team2.get(i));
                    if (distanceToEnemy < temp) {
                        nearIndex = i;
                    }
                    }                            
                giveDamage(team2.get(nearIndex));                     
                shoot = shoot - 1;              
            }
        }
        if (this.side == "DARK") {
            if (this.health <= 0) { System.out.println("Этот герой мертв"); }
            if (this.shoot <= 0) {     System.out.println("У этого героя нет стрел"); }
            else {
                /** Поиск наиболее приближённого врага */
                Double distanceToEnemy;
                Double temp = Point2D.Distance(team1.get(0));
                Integer nearIndex = 0; 
                for (int i = 1; i < 10; i++) {
                    distanceToEnemy = Point2D.Distance(team1.get(i));
                    if (distanceToEnemy < temp) {
                        nearIndex = i;
                    }
                    }                            
                giveDamage(team1.get(nearIndex));                     
                shoot = shoot - 1;              
            }
        }
    }
}
