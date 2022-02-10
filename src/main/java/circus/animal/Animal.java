package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    public abstract String speak();

    public int getValue() {
        return 10;
    }
}
