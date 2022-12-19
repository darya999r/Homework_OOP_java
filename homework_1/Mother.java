public class Mother extends Person{
    private Integer sonId;
    private Integer daughterId;
    private Integer husbandId;

    public Mother(int id, String name, String surname, String patronymic, int age, String social_status, 
    String hair_color, String eye_color, Integer sonId, Integer daughterId, Integer husbandId) {
        super(id, name, surname, patronymic, age, social_status, hair_color, eye_color);
        this.sonId = sonId;
        this.daughterId = daughterId;
        this.husbandId = husbandId;
    }

    public Integer getSonId() {
        return sonId;
    }

    public Integer getDaughterId() {
        return daughterId;
    }

    public Integer getHusbandId() {
        return husbandId;
    }

    public void setSonId(Integer sonId) {
        this.sonId = sonId;
    }

    public void setDaughterId(Integer daughterId) {
        this.daughterId = daughterId;
    }

    public void setHusbandId(Integer husbandId) {
        this.husbandId = husbandId;
    }

    @Override
    public String getInfo() {

        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s;%n\thair_color: %s; eye_color: %s; sonId: %d; daughterId: %d; husbandId: %d", getId(), getName(), getSurname(), getPatronymic(), getAge(), getSocial_status(), getHair_color(), getEye_color(), sonId, daughterId, husbandId);
    }
}
