public class Son extends Person implements MotherInterface, FatherInterface{
    private Integer motherId;
    private Integer fatherId;
    private Integer brotherId;
    private Integer sisterId;

    public Son(int id, String name, String surname, String patronymic, int age, String social_status, 
                Integer motherId, Integer fatherId, Integer brotherId, Integer sisterId) {
        super(id, name, surname, patronymic, age, social_status);
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

        return String.format("id: %d; name: %s; surname: %s; patronymic: %s; age: %d; social_status: %s;%n\teye_color: %s; skin_color: %s; hair_color: %s; hair: %s; nose: %s;\n\tmotherId: %d; fatherId: %d; brotherId: %d; sisterId: %d", getId(), getName(), getSurname(), getPatronymic(), getAge(), getSocial_status(), eye_color, skin_color, hair_color, hair, nose, motherId, fatherId, brotherId, sisterId);
    }

    @Override
    public void slimness() {
        System.out.println("\tSlimness = 60%"); 
    }

    @Override
    public void thick_eyebrows() {
        System.out.println("\tThick eyebrows = 90%");
    }

    @Override
    public void growth() {
        System.out.println("\tGrowth = 170cm");
    }
}
