package exercise09truthbeloykarl;

public class WaterType extends Monster {
    public WaterType(String n, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
        {
            setAtk((int)(Math.round(0.7*base)));
            setDef((int)(Math.round(1.3*base)));
        }  
    }
    
    @Override
    public void special() {
        if(getHP() >= 0.1*getMaxHP()) {
            System.out.println(getName() + " leveled up its defense by 2!");
            setDef(getDef() + 2);
        }
    }
}
