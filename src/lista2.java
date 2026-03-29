import java.util.Scanner;

public class lista2 {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("oi");
        atividade4(kb);
        kb.close();
    }

    public static void atividade1(Scanner kb){
//         Exercício 1: Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e
//         divisão entre elas.
        int num1, num2;
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        System.out.printf("Soma = %d \nDiferenca = %d \nProduto = %d\nDivisao = %d", num1+num2, num1-num2, num1*num2, num1/num2);
        atividade2(num1, num2);
    }
    public static void atividade2(int num1, int num2){
    //     Exercício 2: Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.
        System.out.println((float)num1);
        System.out.println((float)num2);
    }
    public static void atividade3(Scanner kb){
//         Exercício 3: Leia uma variável t com um tempo qualquer em segundos e imprima esse
//         valor em hora, minuto e segundo.
        int sec = kb.nextInt();
        int min = 0, hora = 0;
        if (sec >= 60){
            min = sec/60;
            sec = sec%60;
        }
        if (min >= 60){
            hora = min/60;
            min = hora%60;
        }
        System.out.printf("%d h, %d min, %d seg\n", hora, min, sec);
    }
    public static void atividade4(Scanner kb){
//         Exercício 4: Faça um programa que leia a distância percorrida por um carro, o tempo gasto
//         e a quantidade de gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e
//         o consumo de combustível (Km/l).
        System.out.println("Digite a distancia percorrida: ");
        int dist = kb.nextInt();
        System.out.println("Digite o tempo gasto");
        int time = kb.nextInt();
        System.out.println("Digite a gasolina gasta: ");
        int gas = kb.nextInt();
        System.out.printf("%d km/h \n%d km/l", dist/time, dist/gas);
    }
}
