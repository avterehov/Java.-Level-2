import java.util.ArrayList;

public class FruitBox <T extends Fruit>{

    private ArrayList<T> list;

    public void addFruit (T... fruit){
        for ( int i = 0; i < fruit.length; i++){
            list.add(fruit[i]);
        }
    }

    public float getWeight() {

    return list.get(0).getWeight() * list.size();
    }


    public boolean compareWeight (FruitBox another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.00001;
    }

    public void tranfer (FruitBox <? super T> another){
        another.list.addAll(this.list);
        this.list.clear();

        }
    }



