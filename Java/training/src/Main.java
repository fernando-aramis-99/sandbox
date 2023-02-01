import java.util.Scanner;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        idade_dias();
    }

    public static void idade_dias()
    {
        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
        // Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

        int dias = 0;

        System.out.print("Digite a sua idade, no formato DD/MM/AAAA: ");

        String input = sc.next();
        String [] valores = input.split("/", 3);

//        for(String s : valores) { System.out.println("resultado: " + s); }

        dias += Integer.parseInt(valores[0]);
        dias += (Integer.parseInt(valores[1]) * 30);
        dias += (Integer.parseInt(valores[2]) * 365);

        System.out.println("A quantidade de dias transcorridos foram: " + dias);
    }

}