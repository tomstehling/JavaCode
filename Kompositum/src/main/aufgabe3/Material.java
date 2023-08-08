package main.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Material extends Component {
    public Material(String name, Integer price) {
        super(name, price);
    }

    @Override
    public void add(Component component) {
        // A material cannot contain other components, so this method is not implemented
    }

    @Override
    public void remove(Component component) {
        // A material cannot contain other components, so this method is not implemented
    }


    @Override
    public boolean contains(Component c) {
        return false;
    }

    @Override
    public Integer fetchTotalPrice() {
        return price;
    }

    @Override
    public List<Material> fetchMaterialList() {
        List<Material> materialList = new ArrayList<>();
        materialList.add(this);
        return materialList;
    }
}


