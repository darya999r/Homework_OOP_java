public class Father extends Person implements FatherInterface{
    private Integer sonId;
    private Integer daughterId;
    private Integer wifeId;

    public Father(int id, String name, String surname, String patronymic, int age, String social_status, 
    Integer sonId, Integer daughterId, Integer wifeId) {
        super(id, name, surname, patronymic, age, social_status);
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

        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s;%n\thair_color: %s; hair: %s; nose: %s; sonId: %d; daughterId: %d; wifeId: %d", getId(), getName(), getSurname(), getPatronymic(), getAge(), getSocial_status(), hair_color, hair, nose, sonId, daughterId, wifeId);
    }

    @Override
    public void growth() {
        System.out.println("\tGrowth = 185cm");
    }



    
}
