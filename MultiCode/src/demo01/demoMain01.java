package demo01;

public class demoMain01 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        // 向上转型
        animal.eat(); //猫吃鱼
//        animal.sleep() //错误

        giveAnimal(animal);
        //向下转型
        Cat cat = (Cat) animal;
        cat.sleep();

//        Dog dog = (Dog) animal; //错误写法
//        dog.wang();

    }

    public static void giveAnimal(Animal animal) {
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.wang();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.sleep();
        }
    }
}
