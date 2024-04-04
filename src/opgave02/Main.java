package opgave02;

import com.sun.javafx.scene.SceneUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));
        System.out.println("Den første person der er 44 år er " + peopleArray.findFirst(p -> p.getAge() == 44));
        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        System.out.println("Den første person der hvis navn starter med S: " + peopleArray.findFirst(p -> p.getName().startsWith("S")));
        System.out.println("Den person der har mere end et i i deres navn: " + peopleArray.findFirst(p -> {
            int count = 0;
            for(char c : p.getName().toCharArray()) {
                if(c == 'i') count++;
            }
            if(count >= 2) return true;
            else return false;
        }));
        System.out.println("De første person som har et navn der er lige så lang som deres alder: " + peopleArray.findFirst(p -> {
            if(p.getName().length() == p.getAge()) return true;
            else return false;
        }));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
