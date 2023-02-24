package units;

import java.util.ArrayList;


public class Arbalester extends Shooter {

    public Arbalester(String side, int x, int y) {
        super("Arbalester", side, "Mikle", 10, 6, 4, 3, 2, 3, 16, x, y);
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик";
    }

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
                        temp = distanceToEnemy;
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
                        temp = distanceToEnemy;
                    }
                    }                            
                giveDamage(team1.get(nearIndex));                     
                shoot = shoot - 1;              
            }
        }
    }
}

