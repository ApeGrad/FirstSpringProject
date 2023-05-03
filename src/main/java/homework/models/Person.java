package homework.models;
import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty
    @Size(min = 15, message = "Name should be in this format: Boris Braga Sergeevich")
    private String fullName;

    @Min(value = 1930,message = "U cannot be more than 90 years")
    private int yearOfBirth;

    public Person(){

    }
    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
