import java.util.Scanner;
public class Provas {
    private Scanner sc = new Scanner(System.in);
    public void Buble_sort ()
    {
//        The following two arrays have IDs and names:
//        ids = {35, 98, 23, 43, 50};
//        names = {“John”, “Peter”, “Mariah”, “Bill”, “Chris”};
//        The IDs and names are in the respective positions in each array, id number 35 is for John, 98 for Peter, 23 for Mariah, 43 for Bill and 50 for Chris.
//        The corresponding IDs and names are in the same position in the array.
//        Sort the ids array (and names) in ascending order changing the id value to a new position starting value at 1. Ex:
//        {“23 – Mariah”, “35 – John”, “43 – Bill”, “50 – Chris”, “98 - Peter”} sorted
//        {“1 – Mariah”, “2 – John”, “3 – Bill”, “4 – Chris”, “5 - Peter”} ids changed to position starting at 1
//        However, for even positions the name should be replaced by “N/A”. Expected result is an array like:
//        {“1 – Mariah”, “2 – N/A”, “3 – Bill”, “4 – N/A”, “5 - Peter”};

        int [] ids = {35, 98, 23, 43, 50};
        String[] names = {"John", "Peter", "Mariah", "Bill", "Chris"};
        for (int j=0; j< ids.length-1; j++)
        {
            for(int i=0; i< ids.length -1; i++)
            {
                if (ids[i] > ids[i+1])
                {
                    int valor = ids[i];
                    String valor_nome = names[i];

                    ids[i] = ids[i+1];
                    names[i] = names[i+1];

                    ids[i+1] = valor;
                    names[i+1] = valor_nome;
                }
            }
        }
        for(int i=0;i< ids.length;i++)
        {
            if(i%2==1)
            {
                names[i] = "N/A";
            }
            System.out.println((i+1)+" - "+names[i]);
        }
    }
}