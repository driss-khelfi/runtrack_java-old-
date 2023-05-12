public class Facture {
    public static void main(String[] args) {

        float prix = 49.99f;

        int quantite = 3;

        float montant = prix*quantite;
        float tva = montant/5;
        float tarifTTC = montant+tva;

        System.out.println("le montant total est:"+ montant);
        System.out.println("le montant de la taxe est:"+ tva);
        System.out.println("me montant total à payer est:"+tarifTTC);


    }
}
