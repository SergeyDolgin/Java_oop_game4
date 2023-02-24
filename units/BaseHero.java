package units;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Interface {
    protected String hero;
    protected String side;
    protected String name;
    protected int health;
    protected int speed;
    protected int maxDamage, minDamage;
    protected int attack;
    protected int protection;
    protected static Random r;
    protected Point2D pointXY;

    /** Конструктор который отвечает за инициализацию */
    public BaseHero(String hero, String side, String name, int health, int attack, int speed, int maxDamage, int minDamage, int protection, int x, int y) {
        this.hero = hero;
        this.side = side;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.attack = attack;
        this.protection = protection;
        pointXY = new Point2D(x, y);
    }

    /** Метод получения информации */
    public String getInfo() {
        
        return String.format("Hero: %s Name: %s Health: %d Endurance: %d Speed: %d, maxDamage: %d, minDamage: %d",
                this.hero, this.name, this.health, this.speed, this.maxDamage, this.minDamage,
                this.getClass().getSimpleName());
    }

    public int getSpeed() {
        return speed;
    }
    
        public int getHP(){
        return health;
    }

    public void setHP(int health) {
        this.health = this.health - health;
    }

    public void getDamage(int damage) {
        if (this.health - damage > 0) {
            this.health = this.health - damage;
        }
    }

    public void giveDamage(BaseHero target) {
        int damage = (this.maxDamage + this.minDamage)/2;
        target.setHP(damage - target.protection);
    }
    
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    }

    public String getSide() {
        return side;
    }



}


