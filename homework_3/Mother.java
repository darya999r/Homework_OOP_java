public class Mother extends Person implements MotherInterface{
    private Integer sonId;
    private Integer daughterId;
    private Integer husbandId;

    public Mother(int id, String name, String surname, String patronymic, int age, String social_status, 
    Integer sonId, Integer daughterId, Integer husbandId) {
        super(id, name, surname, patronymic, age, social_status);
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

        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s;%n\teye_color: %s; skin_color: %s; sonId: %d; daughterId: %d; husbandId: %d", getId(), getName(), getSurname(), getPatronymic(), getAge(), getSocial_status(), eye_color, skin_color, sonId, daughterId, husbandId);
    }

    @Override
    public void slimness() {
        System.out.println("\tSlimness = 80%"); 
    }

    @Override
    public void thick_eyebrows() {
        System.out.println("\tThick eyebrows = 60%");
    }
}
