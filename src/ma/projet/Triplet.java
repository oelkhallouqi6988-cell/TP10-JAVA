package ma.projet;


/**
 * Classe générique permettant de stocker trois objets du même type.
 * @param <T> type des trois éléments
 */
public class Triplet<T> {

    private  T premier;
    private T second;
    private final T troisieme;

    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }
    public void swapPremierSecond() {
    	T temp = premier ;
    	premier = second;
    	second = temp;
    }
    

    public void affiche() {
        System.out.println("Triplet : ["
                + premier + ", "
                + second + ", "
                + troisieme + "]");
    }
}