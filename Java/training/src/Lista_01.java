import java.util.Scanner;
import java.util.*;
public class Lista_01
{
    private Scanner sc = new Scanner(System.in);
    public void idade_dias()
    {
//        Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
//         Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

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
    public void media_aritmetica()
    {
//        Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

        float media_a, media_b, soma_media, media_media;

        media_a = (8f+9f+7f)/3f;
        media_b = (4f+5f+6f)/3f;
        soma_media = media_a + media_b;
        media_media = (media_a+media_b)/2;

        System.out.println("A média aritmética dos números 8,9,7 é : "+ media_a);
        System.out.println("A média aritmética dos números 4,5,6 é : "+ media_b);
        System.out.println("A soma das médias é : "+ soma_media);
        System.out.println("A média das médias é : "+ media_media);
    }
    public void ajuste_saldo()
    {
//        Informar um saldo e imprimir o saldo com reajuste de 1%.

        float saldo;

        System.out.print("Informe o saldo: ");

        saldo = Float.parseFloat(sc.next());
        saldo += saldo * 0.01;

        System.out.println("O saldo com reajustado em 1% é: " + saldo);
    }
    public void quant_salario()
    {
//        Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)

        float salario;

        System.out.print("Digite o valor do salário: ");
        salario = Float.parseFloat(sc.next());
        System.out.println("A quantidade de salários minimos obtidos é de: " +(salario/1302f));
    }
}