/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04truthbeloy;

/**
 *
 * @author Karl
 */
public class Ex04TruthBeloy {
    public static void main(String[] args) {
        Poly poly1 = new Poly("Tetrahedron", 4, 6);
        Poly poly2 = new Poly("Hexahedron/Cube", 6, 12);
        Poly poly3 = new Poly("Octahedron", 8, 12);
        
        Song fs1 = new Song("Perfect", "Ed Sheeran");
        Song fs2 = new Song("Thinking Out Loud", "Ed Sheeran");
        
        Singer singer1 = new Singer("Ed Sheeran", 0, 0, fs1);
        Singer singer2 = new Singer("Howard Hamlin", 0, 0, fs1);
        
        System.out.printf("Polyhedron 1%n"
                + "Name: %s%n"
                + "Number of sides: %d%n"
                + "Number of edges: %d%n%n", poly1.getPolyName(), poly1.getSides(), poly1.getEdges());
        System.out.printf("Polyhedron 2%n"
                + "Name: %s%n"
                + "Number of sides: %d%n"
                + "Number of edges: %d%n%n", poly2.getPolyName(), poly2.getSides(), poly2.getEdges());
        System.out.printf("Polyhedron 3%n"
                + "Name: %s%n"
                + "Number of sides: %d%n"
                + "Number of edges: %d%n%n", poly3.getPolyName(), poly3.getSides(), poly3.getEdges());
        
        singer1.performForAudience(12);
        singer1.changeFavSong(fs2);
        singer1.performForAudience(120, singer1, singer2);
    }
    
}
