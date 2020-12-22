package Repl.Tasks11;

public class Person {

    private String firstName, lastName, ssn;

    private int birthmonth, birthday, birthyear;


    public Person(String firstName, String lastName, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {

        return birthmonth + "/" + birthday + "/" + birthday;
    }

    public boolean verifySSN(String parameter) {

        if (parameter.equalsIgnoreCase(ssn)) return true;
        else return false;
    }




}

class PersonObj{
    public static void main(String[] args) {
//        Person person = new Person("Marwan", "Subhi"10,25,1900,"123-45-6789");
//        System.out.println(person.getBirthday());
//        person.setFirstName("John");
//        person.setLastName("Doe");
//        System.out.println(person.getFirstName());
//        System.out.println(person.getLastName());


    }
}


/*

Create the a Person class with the following:

Class Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

Create a public method called verifySSN that takes in a String parameter and returns a boolean.  It will check the parameter against the person's SSN and return true or false based on whether they match.

Complete the questions on Classroom.
 */