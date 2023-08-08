package main.aufgabe3;

import java.util.List;

public abstract class Component {
    protected String name;
    protected Integer price;

    public Component(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract boolean contains(Component c);
    public abstract Integer fetchTotalPrice();
    public abstract List<Material> fetchMaterialList();
}
