import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//test
public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour, quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        //nombrePremier();
        //initialisationTableau();

    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        System.out.println("La valeur de delta est egale a : " + delta);

        if (delta > 0) {
            System.out.println("Ce polynome admet 2 racines reelles");
            int x1 = (int) ( ((-b) + Math.sqrt(delta)) / 2 * a);
            int x2 = (int) ( ((-b) - Math.sqrt(delta)) / 2 * a);
        }

        else if (delta == 0) {
            System.out.println("Ce polynome admet une racine double");
            int x0 = (int) (-b) / 2 * a ;
        }

        else {
            System.out.println("Ce polynome n'admet pas de racine reelle, on a : "+
                    "x1 = ((-"+b+") + i sqrt(-"+delta+")) / 2 * "+a+") "+
                    "x2 = ((-"+b+") - i sqrt(-"+delta+")) / 2 * "+a+") ");
        }
    }
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier ");
        int unEntier = scanner.nextInt();
        if (unEntier % 2 == 0)
            System.out.println("Le nombre est pair. Ce nombre est "+unEntier+"" );
        else
            System.out.println("Le nombre est impair. Ce nombre est "+unEntier+"" );
    }

    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer deux entiers ");
        int premierEntier = scanner.nextInt();
        int secondEntier = scanner.nextInt();
        int max = 0 ;
            if (premierEntier > secondEntier){
                max = premierEntier;
                System.out.println("Le maximum des 2 entiers est "+premierEntier+"" );
            }
            else {
                max= secondEntier;
                System.out.println("Le maximum des 2 entiers est "+secondEntier+"" );
            }
    }

    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer deux entiers ");
        int premierEntier = scanner.nextInt();
        int secondEntier = scanner.nextInt();
        int min = 0 ;
        if (premierEntier > secondEntier){
            min = secondEntier;
            System.out.println("Le minimum des 2 entiers est "+secondEntier+"" );
        }
        else {
            min = premierEntier;
            System.out.println("Le minimum des 2 entiers est "+premierEntier+"" );
        }
    }

    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer deux chaines de caractere");
        String premiereChaine = scanner.next();
        String secondeChaine = scanner.next();
        if(premiereChaine.equals(secondeChaine))
            System.out.println("Les deux chaines de caractere sont égales");

    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
            System.out.println(n + "! = " + factorielle);
        }
    }

    public static void countdown() {
        for (int i=20; i >= 0; i-- ) {
            System.out.println(i);
        }
        System.out.println("BOOM !");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        double nb= scanner.nextDouble();
        double square = nb * nb;
        System.out.println("Le carré de "+ nb + " est: "+ square);
    }

    public static void tableMultiplication() {
        int taille = 10;
        System.out.format("      ");
        for (int t = 1; t <= taille; t++) {
            System.out.format("%4d", t);
        }
        System.out.println();
        for (int i = 1; i <= taille; i++) {
            System.out.format("%4d |", i);
            for (int j = 1; j <= taille; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer deux entiers ");
        int premierEntier = scanner.nextInt();
        int secondEntier = scanner.nextInt();
        int division = premierEntier / secondEntier;
        System.out.println("La division de "+premierEntier+" avec "+secondEntier+" est "+division);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        {int l;
            do
            {System.out.print("Saisir la longueur de la regle (superieur a 0) : ");
                l = scanner.nextInt();}
            while (l <= 0);
            System.out.print("|");
            for(int i=1;i<=l;i++){
                if(i%10 == 0)
                    System.out.print("|");
                else
                    System.out.print("-");
            }
        }
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        {int n;
            do
            {System.out.print("Veuillez saisir un entier positif : ");
                n = scanner.nextInt();}
            while (n <= 0);
            int c = 0;
            for(int i=1;i<=n;i++)
                if (n%i == 0)
                {
                    c++;
                }
            if (c==2)
                System.out.println(n + " est un nombre premier");
            else
                System.out.println(n + " n'est pas un nombre premier");
        }
    }

    public static void initialisationTableau() {
        int[] tableau = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i;

        for (i = 0; i < tableau.length; i++) {
            System.out.print("Entrer un entier : ");
            tableau[i] = scanner.nextInt();
        }
        int s=0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int min=tableau[0],max=tableau[0];
        System.out.print("[ ");
        for(i=0; i<tableau.length; i++) {
            System.out.print(tableau[i] + " ");
            s+=tableau[i];
            if(tableau[i] > max)
                max = tableau[i];
            if(tableau[i] < min)
                min = tableau[i];
            if(tableau[i]%2 == 0)
                list.add(tableau[i]);
            if(i%2==0)
                list2.add(tableau[i]);
        }
        System.out.println("]");
        System.out.println("Max : " + max + "\nMin : " + min);
        System.out.println("Somme des éléments : " + s);
        System.out.print("Nombre pair dans le tableau : [ ");
        for(i=0;i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");
        System.out.print("Nombre d'indice pair dans le tableau : [ ");
        for(i=0;i<list2.size();i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println("]");
        inverseTableau(tableau);
    }

    public static void inverseTableau(int[] tableau) {
        int l = tableau.length-1;
        int[] newtable = new int[tableau.length];
        for(int i=0;i<tableau.length;i++) {
            newtable[l]=tableau[i];
            l--;
        }
        System.out.print("Tableau inversé [ ");
        for(int i=0;i<newtable.length;i++) {
            System.out.print(newtable[i] + " ");
        }
        System.out.println("]");
    }

}