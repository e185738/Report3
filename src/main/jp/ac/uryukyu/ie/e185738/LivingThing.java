package jp.ac.uryukyu.ie.e185738;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent){
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, getName(), damage);
            wounded(damage);
        }
    }

    public void wounded(int damege){
        hitPoint -= damege;
        if (hitPoint < 0){
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }

    }
}