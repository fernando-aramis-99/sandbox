public class Main
{
    private static Lista_01 lista = new Lista_01();
    private static Unirio_lista unilista = new Unirio_lista();
    private static int valor = -1;

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        menu_lista();
        menu_unilista();
    }
    public static void menu_lista()
    {
        do
        {
            System.out.print("Menu - Lista 1" +
                    "\n1 - Transformar idade em dias" +
                    "\n2 - Calcular média aritmética" +
                    "\n3 - Reajuste de saldo" +
                    "\n4 - Quantidade de salários" +
                    "\n5 - Antecessor e Sucessor" +
                    "\n0 - Sair" +
                    "\n  - Selecione o programa: ");
            switch (valor)
            {
                case 0: break;
                case 1: lista.idade_dias();break;
                case 2: lista.media_aritmetica();break;
                case 3: lista.ajuste_saldo();break;
                case 4: lista.quant_salario();break;
                case 5: lista.ante_sucessor();break;
                default: System.out.println("! Seleção Invalida !");break;
            }
        } while (valor != 0);
    }
    public static void menu_unilista()
    {
        do
        {
            System.out.print("Menu - Unirio Lista" +
                    "\n1 - Contador de pares" +
                    "\n2 - *Calcular média aritmética" +
                    "\n3 - Reajuste de saldo" +
                    "\n4 - Quantidade de salários" +
                    "\n5 - Antecessor e Sucessor" +
                    "\n0 - Sair" +
                    "\n  - Selecione o programa: ");
            switch (valor)
            {
                case 0: break;
                case 1: unilista.contador_pares();break;
                case 2: lista.media_aritmetica();break;
                case 3: lista.ajuste_saldo();break;
                case 4: lista.quant_salario();break;
                case 5: lista.ante_sucessor();break;
                default: System.out.println("! Seleção Invalida !");break;
            }
        } while (valor != 0);
    }
}