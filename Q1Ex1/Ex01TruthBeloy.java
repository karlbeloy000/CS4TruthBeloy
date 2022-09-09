/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01truthbeloy;

/**
 *
 * @author TRUTH
 */
public class Ex01TruthBeloy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Polyhedron 1");
        
        String poly1Name = "Pyramid/Tetrahedron";
        int poly1Sides = 4;
        int poly1Edges = 6;
        
        System.out.printf("\n Name: %s", poly1Name);
        System.out.printf("\n Number of Sides: %d", poly1Sides);
        System.out.printf("\n Number of Edges: %d \n", poly1Edges);
        
        System.out.print("\nPolyhedron 2");
        
        String poly2Name = "Cube/Hexahedron";
        int poly2Sides = 6;
        int poly2Edges = 12;
        
        System.out.printf("\n Name: %s", poly2Name);
        System.out.printf("\n Number of Sides: %d", poly2Sides);
        System.out.printf("\n Number of Edges: %d \n", poly2Edges);
        
        System.out.print("\nPolyhedron 3");
        
        String poly3Name = "Octahedron";
        int poly3Sides = 8;
        int poly3Edges = 12;
        
        System.out.printf("\n Name: %s", poly3Name);
        System.out.printf("\n Number of Sides: %d", poly3Sides);
        System.out.printf("\n Number of Edges: %d", poly3Edges);
        
        int totalSides = poly1Sides + poly2Sides + poly3Sides;
        boolean equalEdges = false;
        boolean equalSides = false;
        if(poly2Edges == poly3Edges) {
            equalEdges = true;
        }
        if(poly2Sides == poly3Sides) {
            equalSides = true;
        }
        
        System.out.printf("\n\nTotal number of sides: %d", totalSides);
        System.out.printf("\nA cube and an octahedron have the same number of edges: %b", equalEdges);
        System.out.printf("\nA cube and an octahedron have the same number of sides: %b\n\n", equalSides);
    }
    
}
