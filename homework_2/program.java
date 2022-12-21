public class program {
    public static void main(String[] args) {
                                    
        Father father1 = new Father(1, "Ivan", "Ivanov", "Ivanovich", 
                                    35, "merried", 
                                    2, 4, 3);
        System.out.println(father1.toString());
        father1.growth();
        
        Son son1 = new Son(2, "Piter", "Ivanov", "Ivanovich", 12, 
                                "single", 3, 1, 
                                0, 4);
        System.out.println(son1.toString());
        son1.slimness();
        son1.thick_eyebrows();
        son1.growth();


        Mother mother1 = new Mother(3, "Olga", "Ivanova", "Vasilevna", 
                                    32, "married", 
                                    2, 4, 1);
        System.out.println(mother1.toString());
        mother1.slimness();
        mother1.thick_eyebrows();


        Daughter daughter1 = new Daughter(4, "Svetlana", "Ivanova", 
                                    "Ivanovna", 14, "single", 
                                    3, 0, 2, 0);
        System.out.println(daughter1.toString());
        daughter1.slimness();
        daughter1.thick_eyebrows();
        daughter1.growth();
        
        System.out.println("----------------");
        System.out.printf("Father: %s %s %s\n\thair_color: %s; hair: %s; nose: %s\n", father1.getName(), father1.getPatronymic(), father1.getSurname(), father1.hair_color, father1.hair, father1.nose);
        father1.growth();
        if (son1.getFatherId() == father1.getId()) {
            System.out.printf("Son: %s; age: %d; hair color: %s; hair: %s; nose: %s\n", son1.getName(), son1.getAge(), son1.hair_color, son1.hair, son1.nose);
            son1.growth();
        } else System.out.println("Son: no sons.");
        if (daughter1.getFatherId() == father1.getId()) {
            System.out.printf("Daughter: %s; age: %d; hair color: %s; hair: %s; nose: %s\n", daughter1.getName(), daughter1.getAge(), daughter1.hair_color, daughter1.hair, daughter1.nose);
            daughter1.growth();
        } else System.out.println("Daughter: no daughters."); 

        System.out.println("----------------");
        System.out.printf("Mother: %s %s %s\n\teye_color: %s; skin_color: %s\n", mother1.getName(), mother1.getPatronymic(), mother1.getSurname(), mother1.eye_color, mother1.skin_color);
        mother1.slimness();
        mother1.thick_eyebrows();
        if (son1.getMotherId() == mother1.getId()) {
            System.out.printf("Son: %s; age: %d; eye_color: %s; skin_color: %s\n", son1.getName(), son1.getAge(), son1.eye_color, son1.skin_color);
            son1.slimness();
            son1.thick_eyebrows();
        } else System.out.println("Son: no sons.");
        if (daughter1.getMotherId() == mother1.getId()) {
            System.out.printf("Daughter: %s; age: %d; eye_color: %s; skin_color: %s\n", daughter1.getName(), daughter1.getAge(), daughter1.eye_color, daughter1.skin_color);
            daughter1.slimness();
            daughter1.thick_eyebrows();
        } else System.out.println("Daughter: no daughters.");
    }
}