public class Test
{
    public static void exemple1()
    {
        int n ;
        System.out.println("entrez un entier" ) ;
        n = Console.lireI() ;
        System.out.println(n) ;
        byte nOctet ;
        System.out.println("entrez un byte" ) ;
        nOctet = Console.lireB() ;
        System.out.println(nOctet) ;
        System.out.println("c’est fini. Tapez <ret>" ) ;
        Console.lireC() ;
    }
    public static int lireI() // Lire un entier
    {
        int n = 0;
        try
        {
            n = Integer.parseInt(Console.lireStr());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Format incorrect");
            System.exit(0);
        }
        return n ;
    }
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
       /* exemple1();
        lireI();*/
        char c = '8';
        switch (c)
        {
            case '1':
            case '3':
            case '5':
            case '7':
            case '9':
                System.out.println("c est un chiffre impair");
                break;
            case '0':
            case '2':
            case '4':
            case '6':
            case '8':
                System.out.println("c est un chiffre pair");
                break;
            case ' ':
                System.out.println("c est un espace");
                break;
            default :
                System.out.println("ce n'est ni un chiffre ni un espace");
        }
    }
}
