package circus.animal;

import circus.Asset;

import java.util.Comparator;
import java.util.Locale;

public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();

    public static Comparator AnimalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.name.toLowerCase().compareTo(animal2.name.toLowerCase());
        }
    };
}
