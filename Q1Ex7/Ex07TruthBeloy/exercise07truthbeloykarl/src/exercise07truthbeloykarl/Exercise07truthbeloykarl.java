package exercise07truthbeloykarl;
public class Exercise07truthbeloykarl {

    public static void main(String[] args) {
        Monster fuecoco = new FireType("Fuecoco", 200, 45);
        Monster sprigatito = new GrassType("Sprigatito", 240, 30);
        Monster quaxly = new WaterType("Quaxly", 220, 60);
        
        Location nueva = new Location("Nueva Montana", "rice");
        Location ramil = new Location("Ramil Jail", "Fear");
        
        Character michael = new Trainer("Michael Iti", nueva);
        Character jhonibelz = new NPC("Jhonibelz", nueva);
        
        System.out.println("FIRE vs. GRASS");
        while (!(fuecoco.getHP() == 0 || sprigatito.getHP() == 0)) {
            fuecoco.attack(sprigatito);
            sprigatito.attack(fuecoco);
            fuecoco.special();
            sprigatito.attack(fuecoco);
        }
        System.out.println();
        
        fuecoco.restoreHealth();
        sprigatito.restoreHealth();
        
        System.out.println("GRASS vs. WATER");
        while (!(sprigatito.getHP() == 0 || quaxly.getHP() == 0)) {
            quaxly.attack(sprigatito);
            sprigatito.attack(quaxly);
            quaxly.special();
            quaxly.attack(sprigatito);
            sprigatito.special();
            quaxly.attack(sprigatito);
            sprigatito.attack(quaxly);
        }
        System.out.println();

        sprigatito.restoreHealth();
        quaxly.restoreHealth();
        
        System.out.println("FIRE vs. WATER");
        while (!(fuecoco.getHP() == 0 || quaxly.getHP() == 0)) {
            quaxly.attack(fuecoco);
            fuecoco.special();
            fuecoco.attack(quaxly);
            quaxly.special();
            quaxly.attack(fuecoco);
            fuecoco.attack(quaxly);
            quaxly.special();
        }
        System.out.println();
        
        nueva.interact();
        quaxly.interact();
        jhonibelz.interact();
    }
    
}
