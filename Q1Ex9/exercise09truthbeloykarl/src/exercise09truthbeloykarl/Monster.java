package exercise09truthbeloykarl;
import java.util.*;

public abstract class Monster implements Interactive {
    private String name, type, strongAgainst, weakAgainst;
    private int maxHP, hp, atk, def, xp, lvl;
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    protected Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public abstract void special();

    public void restoreHealth(){
        hp = maxHP;
    }
    
    public static class MonsterNotFoundException extends Exception {
        public MonsterNotFoundException() {
        }
        public MonsterNotFoundException(String message) {
            super(message);
        }
        
    }
    
    public static Monster selectMonster(String n) throws MonsterNotFoundException {
	boolean found = false;
	for(Monster m : monsterList){
		if(m.getName().equals(n)){
                        found = true;
			return m;
		}
	}
        if(!found) { 
            throw new MonsterNotFoundException("Monster doesn't exist.");
        }
	return null;
    }
    
    @Override
    public void interact() {
        System.out.println("Name: " + name + " | Type: " + type);
    }
}