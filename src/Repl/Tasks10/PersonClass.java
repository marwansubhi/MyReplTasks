package Repl.Tasks10;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PersonClass {
    private String firstName, lastName, ssn;

    private int birthMonth, birthday, birthYear;


    public PersonClass(String firstName, String lastName, String ssn, int birthMonth, int birthday, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthMonth = birthMonth;
        this.birthday = birthday;
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getBirthday(){

        return birthMonth+"/"+birthday+"/"+birthYear;
    }

    public boolean verifySSN(String parameter){
        if (ssn.equals(parameter))return true;
        else return false;
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", birthMonth=" + birthMonth +
                ", birthday=" + birthday +
                ", birthYear=" + birthYear +
                '}';
    }
}
class PersonObj{
    public static void main(String[] args) {
        PersonClass p1 = new PersonClass("Marwan","Subhi","095856793",4,13,1986);

        System.out.println(p1);
        p1.setFirstName("Ali");
        System.out.println(p1);
        System.out.println(p1.verifySSN("095856795"));

        System.out.println(p1.getFirstName());

        System.out.println(p1.getBirthday());
    }
}