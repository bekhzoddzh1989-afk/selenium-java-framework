package Java_Faker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Intro {


    @Test
    public void TestFaker() {

        Faker faker = new Faker();

        String name = faker.name().fullName();
        System.out.println(name);
        String lastname = faker.name().lastName();
        System.out.println(lastname);

        String address = faker.address().fullAddress();
        System.out.println(address);

        String city = faker.address().cityName();
        System.out.println(city);

        String zipcode = faker.address().zipCode();
        System.out.println(zipcode);

        String numbers = faker.numerify("###-###-####");
        System.out.println(numbers);



    }



}
