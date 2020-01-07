package exercises;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String niNumber;

    public Person(String firstName, String lastName, int age, String niNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.niNumber = niNumber;
    }

    public boolean equals(Person other) {
        if (other == null) {
            return false;
        }
            if (this.niNumber.equals(other.niNumber)) {
                return true;
            } else {
                return false;
            }
        }
    }
