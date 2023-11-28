package fr.efrei.factory;
import fr.efrei.domain.Person;
import fr.efrei.util.Helper;

public class PersonFactory {
    public static Person createPerson(int age){
        if (Helper.isNullOrZero(age))
            return null;

        return new Person.Builder()
                .setAge(age)
                .build();

    }

}
