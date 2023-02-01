import java.util.Scanner;
import java.util.*;
public class Unirio_lista
{
    private Scanner sc = new Scanner(System.in);
    public void contador_pares()
    {
//        totalPares: a função recebe como parâmetro um array de inteiros e retorna um  número inteiro indicando o total de números pares existentes no array.

        String array;
        System.out.print("Digite um numero inteiro: ");

    }
    public void busca_binaria()
    {
        int[] vetor = new int[8];
        for ( int i = 0; i<vetor.length;i++)
        {
            vetor[i] = i * 2;
            System.out.println(i + " - valor: " + vetor[i]);
        }

        System.out.print("Qual numero você busca ? :");
        int buscado = Integer.parseInt(sc.next());
        boolean achou = false;
        int inicio = 0, meio, fim = vetor.length - 1;
        while (inicio<=fim)
        {
            meio = (int) ((inicio + fim) / 2);
            if(vetor[meio] == buscado)
            {
                achou = true;
                break;
            }
            else if (vetor[meio]<buscado)
            {
                inicio = meio + 1;
            }
            else
            {
                fim = meio - 1;
            }
        }
        if (achou == true)
        {
            System.out.println("O numero foi encontrado !");
        }
        else
        {
            System.out.println("O numero não foi encontrado ?");
        }
    }
}
