public class Person {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String social_status;


    public Person(int id, String name, String surname, String patronymic, int age, String social_status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.social_status = social_status;

    }

    public int getId() { 
        return id;
    }

    public String getName() { 
        return name;
    }

    public String getSurname() { 
        return surname;
    }

    public String getPatronymic() { 
        return patronymic;
    }

    public int getAge() { 
        return age;
    }

    public String getSocial_status() { 
        return social_status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSocial_status(String social_status) {
        this.social_status = social_status;
    }

    public String getInfo() {
        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s", id, name, surname, patronymic, age, social_status);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
