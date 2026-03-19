import java.util.Scanner;

public class lista1{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        lista1 questoes = new lista1();
        questoes.atividade1(kb);
        questoes.atividade2(kb);
        questoes.atividade3(kb);
        kb.close();
    }
    
    public void atividade1(Scanner kb){
        // 1 - Crie um programa que peça ao usuário para digitar seu nome e, em seguida, exiba uma
        // mensagem personalizada com o nome informado.
        // Exemplo de entrada:
        // Digite seu nome: Rebeca
        // Exemplo de entrada:
        // Olá, Rebeca! Bem-vindo ao Java!
        System.out.println("ATIVIDADE 1");
        System.out.print("Digite seu nome: ");
        String nome = kb.nextLine();
        System.out.println("Olá "+nome+"! Bem-vindo(a) ao Java!");
    }
    public void atividade2(Scanner kb){
        // 2 - Crie um programa que converta uma temperatura fornecida em graus Celsius para Fahrenheit usando a fórmula:
        // F=(C×1.8)+32
        // Exemplo de entrada:
        // Digite a temperatura em Celsius: 25
        // Exemplo de saída:
        // 25°C equivalem a 77°F
        System.out.println("ATIVIDADE 2");
        System.out.print("Digite uma temperatura em Celcius: ");
        float Celcius = kb.nextFloat();
        float Fahrenheit = (Celcius * 1.8f)+32;
        System.out.println(Celcius+"°C equivalem a "+Fahrenheit+"°F");
    }
    public void atividade3(Scanner kb){
        // 3 - Crie um programa que peça um número ao usuário e diga se ele é par ou ímpar.
        // Exemplo de entrada:
        // Digite um número: 10
        // Exemplo de saída:
        // O número 10 é par.
        System.out.print("Digite um número: ");
        int num = kb.nextInt();
        if (num % 2 == 0) System.out.println("O número é par.");
        else System.out.println("O número é ímpar.");
    }
    public void atividade4(Scanner kb){
        //muito grande pra fzr dnv ;)
        // preciso achar um jeito de o terminal nao fechar assim que eu digito o ultimo input
    }
}