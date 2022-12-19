public class Son extends Person {
    private Integer motherId;
    private Integer fatherId;
    private Integer brotherId;
    private Integer sisterId;

    public Son(int id, String name, String surname, String patronymic, int age, String social_status, 
                String hair_color, String eye_color, Integer motherId, Integer fatherId, Integer brotherId, Integer sisterId) {
        super(id, name, surname, patronymic, age, social_status, hair_color, eye_color);
        this.motherId = motherId;
        this.fatherId = fatherId;
        this.brotherId = brotherId;
        this.sisterId = sisterId;
    }

    public Integer getMotherId() {
        return motherId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public Integer getBrotherId() {
        return brotherId;
    }

    public Integer getSisterId() {
        return sisterId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public void setBrotherId(Integer brotherId) {
        this.brotherId = brotherId;
    }

    public void setSisterId(Integer sisterId) {
        this.sisterId = sisterId;
    }

    @Override
    public String getInfo() {

        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s;%n\thair_color: %s; eye_color: %s; motherId: %d; fatherId: %d; brotherId: %d; sisterId: %d", getId(), getName(), getSurname(), getPatronymic(), getAge(), getSocial_status(), getHair_color(), getEye_color(), motherId, fatherId, brotherId, sisterId);
    }
}
