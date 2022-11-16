package exercise06truthbeloykarl;

public class FireType extends Monster {
    public FireType(String n, int m, int base) {
        super(n, "fire", "grass", "water", m, base);
        {
            setAtk((int)(Math.round(0.7*base)));
            setDef((int)(Math.round(1.3*base)));
        }  
    }
    
    @Override
    public void special() {
        if(getHP() >= 0.1*getMaxHP()) {
            System.out.println(getName() + " leveled up its attack by 2!");
            setAtk(getAtk() + 2);
        }
    }
}