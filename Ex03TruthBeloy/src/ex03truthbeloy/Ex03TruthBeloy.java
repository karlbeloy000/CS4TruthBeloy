/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03truthbeloy;

/**
 *
 * @author Karl
 */
public class Ex03TruthBeloy {
    public static void main(String[] args) {
        Poly poly1 = new Poly("Tetrahedron", 4, 6);
        Poly poly2 = new Poly("Hexahedron/Cube", 6, 12);
        Poly poly3 = new Poly("Octahedron", 8, 12);
        
        Song fs1 = new Song("Perfect", "Ed Sheeran");
        Song fs2 = new Song("Thinking Out Loud", "Ed Sheeran");
        
        Singer newSinger = new Singer("Ed Sheeran", 0, 0, fs1);
        
        System.out.printf("Polyhedron 1%n"
                + "Name: %s%n"
                + "Number of sides: %d%n"
                + "Number of edges: %d%n%n", poly1.polyName, poly1.sides, poly1.edges);
        System.out.printf("Polyhedron 2%n"
                + "Name: %s%n"
                + "Number of sides: %d%n"
                + "Number of edges: %d%n%n", poly2.polyName, poly2.sides, poly2.edges);
        System.out.printf("Polyhedron 3%n"
                + "Name: %s%n"
                + "Number of sides: %d%n"
                + "Number of edges: %d%n%n", poly3.polyName, poly3.sides, poly3.edges);
        
        newSinger.performForAudience(12);
        newSinger.changeFavSong(fs2);
    }
    
}
