import java.util.Scanner;

public class lista2_5 {
    // Exercício 5: Faça um programa que leia três coordenadas num espaço 2D e indique se
    // formam um triângulo, juntamente com o seu tipo (equilátero, isósceles e escaleno)
    // ○ Equilátero: todos os lados iguais
    // ○ Isósceles: dois lados iguais
    // ○ Escaleno: todos os lados diferentes
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int x, y;
        double a, b, c;
        boolean tri = false;
        System.out.println("Digite as coordenadas de A");
        System.out.print("X: ");
        x = kb.nextInt();
        System.out.print("Y: ");
        y = kb.nextInt();
        a = Math.sqrt(x*x + y*y);
        System.out.println("Digite as coordenadas de B");
        System.out.print("X: ");
        x = kb.nextInt();
        System.out.print("Y: ");
        y = kb.nextInt();
        b = Math.sqrt(x*x + y*y);
        System.out.println("Digite as coordenadas de C");
        System.out.print("X: ");
        x = kb.nextInt();
        System.out.print("Y: ");
        y = kb.nextInt();
        c = Math.sqrt(x*x + y*y);
        kb.close();
        if (a < b + c && b < c + a && c < b + a)
            tri = true;
        if (tri){
            
        }
    }
}