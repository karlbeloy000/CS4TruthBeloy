/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04truthbeloy;

/**
 *
 * @author Karl
 */
public class Poly {
    private String polyName;
    private int sides;
    private int edges;
    
    public Poly(String pn, int ps, int pe) {
        polyName = pn;
        sides = ps;
        edges = pe;
    }
    
    public String getPolyName() {
        return polyName;
    }
    
    public int getSides() {
        return sides;
    }
    
    public int getEdges() {
        return edges;
    }
}
