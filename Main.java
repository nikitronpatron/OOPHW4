// Есть классы: GoldenApple -> Apple -> Fruit
// Orange -> Fruit
// Есть класс Box. Нужно:
// 1. Организовать его так, чтобы он мог хранить только фрукты какого-то типа
// 2. Реализовать методы добавления фрукта, пересыпания в другую коробку, получение сумарного веса
// Ограничения:
// В коробку с апельсинами нельзя добавить яблоки
// В коробку с золотыми яблоками нельзя добавить апельсины и яблоки
// Пересыпать из коробки с золотыми яблоками в коробку с яблоками можно!
// 3.* Реализовать итерируемость по коробке

public class Main
{
    public static void main(String[] args)
    {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(new Apple(2)); // яблоко к яблокам
        // appleBox.add(new Orange(2)); не работает
        appleBox.add(new GoldenApple(2)); // золотое яблоко к яблокам
        // orangeBox.add(new Apple(2)); не работает
        orangeBox.add(new Orange(2)); // апельсин к апельсинам
        // goldenAppleBox.add(new Apple(2)); не работает
        goldenAppleBox.add(new GoldenApple(2)); // золотое яблоко к золотым яблокам
        fruitBox.add(new Apple(2)); // яблоко к фруктам

        System.out.println(appleBox.getWeight());
        System.out.println(goldenAppleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(fruitBox.getWeight());
        System.out.println();

        goldenAppleBox.moveTo(appleBox);
        // goldenAppleBox.moveTo(orangeBox); не работает
        System.out.println(goldenAppleBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println();

        appleBox.moveTo(fruitBox);
        System.out.println(appleBox.getWeight());
        System.out.println(fruitBox.getWeight());
        System.out.println();

        orangeBox.moveTo(fruitBox);
        System.out.println(orangeBox.getWeight());
        System.out.println(fruitBox.getWeight());
    }
}