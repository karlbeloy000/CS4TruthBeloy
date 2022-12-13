/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise09truthbeloykarl;

/**
 *
 * @author Karl
 */
import java.util.*;

public class Trainer extends Character implements Interactive {
    private Monster activeMonster;
    private ArrayList<Monster> team;
    
    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l){
        super(n, l);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void inspect(Interactive i) {
        interact();
    }
    
    public static class AlreadyCapturedException extends Exception {
        public AlreadyCapturedException() {
        }
        public AlreadyCapturedException(String message) {
            super(message);
        }

    }
    public static class NotInTeamException extends Exception {
        public NotInTeamException() {
        }
        public NotInTeamException(String message) {
            super(message);
        }

    }
    
    public void sureCapture(Monster m) throws AlreadyCapturedException {
        boolean contained = false;
        if(team.contains(m)) {
            contained = true;
        }
        else {
            team.add(m);
            System.out.printf("%s was successfully captured.%n", m.getName());
        }
        if(contained) {
            throw new AlreadyCapturedException(m.getName() + " is already in team.");
        }
    }
    public void release(Monster m) throws NotInTeamException{
        boolean excluded = false;
        if(team.contains(m)) {
            team.remove(m);
            System.out.printf("%s was released from the team.%n", m.getName());
        }
        else {
            excluded = false;
        }
        if(!excluded) {
            throw new NotInTeamException(m.getName() + " was never in the team.");
        }
    }
}

