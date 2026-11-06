package ma.projet;

public class TestTripletH {

    public static void main(String[] args) {

        // Integer, String et Double
        TripletH<Integer, String, Double> th =
                new TripletH<>(42, "Answer", 3.14);

        th.affiche();
       

        System.out.println(th.toList());

        // String, Integer et Boolean
        TripletH<String, Integer, Boolean> th2 =
                new TripletH<>("Alice", 30, true);

        th2.affiche();

        // Utilisation des getters
        Integer a = th.getPremier();
        String b = th.getSecond();
        Double c = th.getTroisieme();

        System.out.println("Premier : " + a);
        System.out.println("Deuxième : " + b);
        System.out.println("Troisième : " + c);
    }
}
