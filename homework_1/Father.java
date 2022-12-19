public class Father extends Person{
    private Integer sonId;
    private Integer daughterId;
    private Integer wifeId;

    public Father(int id, String name, String surname, String patronymic, int age, String social_status, 
    String hair_color, String eye_color, Integer sonId, Integer daughterId, Integer wifeId) {
        super(id, name, surname, patronymic, age, social_status, hair_color, eye_color);
        this.sonId = sonId;
        this.daughterId = daughterId;
        this.wifeId = wifeId;
    }

    public Integer getSonId() {
        return sonId;
    }

    public Integer getDaughterId() {
        return daughterId;
    }

    public Integer getWifeId() {
        return wifeId;
    }

    public void setSonId(Integer sonId) {
        this.sonId = sonId;
    }

    public void setDaughterId(Integer daughterId) {
        this.daughterId = daughterId;
    }

    public void setWifeId(Integer wifeId) {
        this.wifeId = wifeId;
    }

    @Override
    public String getInfo() {

        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s;%n\thair_color: %s; eye_color: %s; sonId: %d; daughterId: %d; wifeId: %d", getId(), getName(), getSurname(), getPatronymic(), getAge(), getSocial_status(), getHair_color(), getEye_color(), sonId, daughterId, wifeId);
    }

    
}
