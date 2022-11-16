package exercise06truthbeloykarl;

public class GrassType extends Monster {
    public GrassType(String n, int m, int base) {
        super(n, "grass", "water", "fire", m, base);
        {
            setAtk(base);
            setDef(base);
        }  
    }
    
    @Override
    public void special() {
        setHP((int)(Math.round(getHP() + getMaxHP()*0.2)));
        System.out.println(getName() + " leveled up its HP to " + getHP() + "!");
    }
}