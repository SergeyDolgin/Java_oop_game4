package units;

public class Shooter extends BaseHero{
    int shoot;
    
        public Shooter(String hero, String side, String name, int health, int attack, int speed, int maxDamage, int minDamage,int protection, int shoot, int x, int y) {
            super(hero, side, name, health, attack, speed, maxDamage, minDamage, protection, x, y);
            this.shoot = shoot;
    
        }
        
        public String getInfo() {
            return String.format("%s Ammunition: %d Gun: %s Markmanship: %d", 
            super.getInfo());       
        }
}       



// public abstract class Archer extends Attacking_class {

//     protected int shots;

//     public Archer(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int attack, int shots, Point pointXY) {
//         super(name, defense, minDamage, maxDamage, hp, speed, attack, pointXY);
//         this.shots = shots;
//     }

//     @Override
//     public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2){
        
//     }
// }