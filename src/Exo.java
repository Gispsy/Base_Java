public class Exo
{
    final static double PI=3.1416;
    public static void exo1()
    {
        double rayon;
        double perimetre;

        System.out.println("Entrer le rayon: ");
        rayon = Console.lireD();
        perimetre = 2 * rayon * PI ;
        System.out.print("Le périmètre vaut: ");
        System.out.println(perimetre);
    }

    public static  void exo2()
    {
        int nX = 54;
        int nY = 25;
        int nZ = nX;
        nX = nY;
        nY = nZ;
        System.out.println(nX);
        System.out.println(nY);

    }

    public static void exoAddition()
    {
        double p;
        double d;
        double resultat;


        System.out.println("Entrer la premiere valeur : ");
        p = Console.lireD();
        System.out.println("Entrer la deuxième valeur : ");
        d = Console.lireD();
        resultat = p + d;
        System.out.println(resultat);

    }

    public static void exoDiviseur()
    {
        int p;
        double d;
        double resultat;


        System.out.println("Entrer la premiere valeur : ");
        p = Console.lireI();
        System.out.println("Entrer la deuxième valeur : ");
        d = Console.lireD();
        resultat = p / d;
        System.out.println(resultat);
    }

    public static void exoTempérature()
    {
        double v;
        double C;
        double F;
        double resultat;

        System.out.println("Entrer la temperature : ");
        F = Console.lireI();
        C = (F-32)/(5f/9f);
        resultat = C;
        System.out.println(resultat);
    }

    public static  void exoMoyen()
    {
        double Note1;
        double Note2;
        double Note3;
        double calcule;
        double resultat;

        System.out.println("Entrer la note coefficient de 3 : ");
        Note1 = Console.lireI();
        System.out.println("Entrer la note coefficient de 2 : ");
        Note2 = Console.lireI();
        System.out.println("Entrer la note coefficient de 1 : ");
        Note3 = Console.lireI();

        calcule = (Note1 * 3) + (Note2 * 2) + (Note3 * 1);
        resultat = calcule / 6;
        System.out.println(resultat);
    }

    public static  void exoHeure()
    {
        double S;
        double H;
        double M;
        double resultatM;
        double resultatH;

        System.out.println("Entrer le nombre de second a convertir : ");
        S = Console.lireD();
        M = S/60f;
        resultatM = M;
        H = S/3600f;
        resultatH = H;
        System.out.println("Il est " + resultatH + ":" + resultatM);
    }

    public static  void exoASCII()
    {
        char L;
        int nx = 0x41;

        System.out.println("Saisir un entier ");
        L = (char)Console.lireI();
        System.out.println(L);

    }
    public static void main(String[] args)
    {
        /* exo1();
           exo2();
           exoAddition();
        exoDiviseur();
        exoTempérature();
        exoMoyen();
        exoHeure();*/
        exoASCII();



    }
}
