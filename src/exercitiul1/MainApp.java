package exercitiul1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MainApp {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc=new Scanner(new File("C:\\Users\\macov\\Desktop\\java_laboratoare\\lab3ex1\\src\\exercitiul1\\in.txt"));
        List<Parabola> puncte=new ArrayList<>();

        while(sc.hasNextInt()) {
            double a=sc.nextInt();
            double b=sc.nextInt();
            double c=sc.nextInt();
            puncte.add(new Parabola(a,b,c));
        }


        System.out.println("Lista contine punctele:");
        for(Parabola p:puncte) {
            System.out.println(p+" | "+Arrays.toString(p.Varf()));
        }
        System.out.println("\n");


        System.out.println("Mijlocul segmentului de la punctul (1,7,3) la fiecare punct:");
        for(Parabola p:puncte) {
            System.out.println(Arrays.toString(p.Mij_Segment(1,7,3)));
        }
        System.out.println("\n");


        System.out.println(Arrays.toString(Segment_mijloc(puncte.get(0), puncte.get(1))));
        System.out.println("\n");

        System.out.println(Lungime_doi(puncte.get(0), puncte.get(1)));
        System.out.println("\n");


        for(Parabola p:puncte) {
            System.out.println(p.Lungime_unu(1,7,3));
        }
        System.out.println("\n");

    }

    public  static double[] Segment_mijloc(Parabola p1, Parabola p2) {
        double x=(p1.Varf()[0]+p2.Varf()[0])/2;
        double y=(p1.Varf()[1]+p2.Varf()[1])/2;
        return new double[] {x,y};
    }

    public  static double Lungime_doi(Parabola p1, Parabola p2) {
        return Math.hypot(p2.Varf()[0]-p1.Varf()[0],p2.Varf()[1]-p1.Varf()[1]);
    }
}
