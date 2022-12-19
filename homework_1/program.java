public class program {
    public static void main(String[] args) {
                                    
        Son son1 = new Son(2, "Piter", "Ivanov", "Ivanovich", 12, 
                                "single", "braun", "blue", 
                                3, 1, 0, 4);
        System.out.println(son1.toString());


        Mother mother1 = new Mother(3, "Olga", "Ivanova", "Vasilevna", 
                                    32, "married", "blond", 
                                    "grey", 2, 4, 1);
        System.out.println(mother1.toString());


        Father father1 = new Father(1, "Ivan", "Ivanov", "Ivanovich", 
                                    35, "merried", "black", 
                                    "blue", 2, 4, 3);
        System.out.println(father1.toString());

        Daughter daughter1 = new Daughter(4, "Svetlana", "Ivanova", 
                                    "Ivanovna", 14, "single", 
                                    "black", "braun", 3, 
                                    0, 2, 0);
        System.out.println(daughter1.toString());
        
        System.out.println("----------------");
        System.out.printf("Father: %s %s %s, eye color: %s\n", father1.getName(), father1.getPatronymic(), father1.getSurname(), father1.getEye_color());
        if (son1.getFatherId() == father1.getId()) {
            System.out.printf("Son: %s, age: %d, eye color: %s\n", son1.getName(), son1.getAge(), son1.getEye_color());
        } else System.out.println("Son: no sons.");
        if (daughter1.getFatherId() == father1.getId()) {
            System.out.printf("Daughter: %s, age: %d, eye color: %s\n", daughter1.getName(), daughter1.getAge(), daughter1.getEye_color());
        } else System.out.println("Daughter: no daughters."); 

        System.out.println("----------------");
        System.out.printf("Mother: %s %s %s, eye color: %s\n", mother1.getName(), mother1.getPatronymic(), mother1.getSurname(), mother1.getEye_color());
        if (son1.getMotherId() == mother1.getId()) {
            System.out.printf("Son: %s, age: %d, eye color: %s\n", son1.getName(), son1.getAge(), son1.getEye_color());
        } else System.out.println("Son: no sons.");
        if (daughter1.getMotherId() == mother1.getId()) {
            System.out.printf("Daughter: %s, age: %d, eye color: %s\n", daughter1.getName(), daughter1.getAge(), daughter1.getEye_color());
        } else System.out.println("Daughter: no daughters.");
    }
}