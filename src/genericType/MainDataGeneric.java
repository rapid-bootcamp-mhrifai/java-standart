package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Ahmad Roni");
        System.out.println("data1 Value "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(1234567);
        System.out.println("data2 Value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data2 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product = new Product("Obat Awet Muda",1000000.0);
        data4.setData(product);
        System.out.println("data4 Value "+ data4.getData());

        DataGeneric<Animal> data5 = new DataGeneric<Animal>();
        //data5.setData(new Animal("cat", 4));
        Animal animal = new Animal("Cat",4);
        data5.setData(animal);
        System.out.println("data5 Value "+ data5.getData());


        DataGeneric<Car> data6 = new DataGeneric<Car>();
        data6.setData(new Car("Mercy",2000.00,200));
        System.out.println("data6 Value "+ data6.getData());


    }
}
