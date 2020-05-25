package PatronStrategie.Comparator;

import java.util.Comparator;

public class ComparatorNomSalaire implements Comparator<Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        int nameCompare = o1.getNom().compareTo(o2.getNom());
        int salaireCompare = Double.compare(o1.getSalaire(),o2.getSalaire());
        if ( nameCompare!= 0){
            return nameCompare;
        }
        return salaireCompare;
    }
}
