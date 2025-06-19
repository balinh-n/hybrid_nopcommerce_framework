package commons;

import com.github.javafaker.Faker;

public class GenerateData {
    public static GenerateData generateData() {
        return new GenerateData();
    }
    public String firstName() {
        return new Faker().name().firstName();
    }

    public String lastName() {
        return new Faker().name().lastName();
    }

    public String email() {
        return new Faker().internet().emailAddress();
    }

    public String password() {
        return new Faker().internet().password(8, 12, true, true, true);
    }

}