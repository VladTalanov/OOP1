import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){                
        List<Animal> animals = new ArrayList<Animal>();
            animals.add(new Bird("Геннадий","ВЛадимир"));
            animals.add(new Duck("Снуп","Иззи"));
            animals.add(new Fish("Софа","Лучик"));
            animals.add(new Cat("Гера","Бутч"));     
            animals.add(new Turtle("Леонардо","Донателло"));         

        for (Animal a: animals) a.toGo();
            System.out.println();
    
        for (Animal a: animals) a.fly();               
            System.out.println();
        
        for (Animal a: animals) a.swim();
            System.out.println();
    }
}