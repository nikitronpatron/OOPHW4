public class Box<T extends Fruit> {
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void add(T t) {
        weight += t.getWeight(t);
    }

    public void moveTo(Box<? super T> target) {
        target.setWeight(target.getWeight() + this.weight);
        this.weight = 0;
    }

}