public class Main {


    public static void main(String[] args) {

        Boss boss =new Boss(500, 50, "Magical");
        System.out.println("Босс \nхарактеристики:");
        System.out.println("Здоровье: " + boss.getHealth() + "\nУрон:  " + boss.getDamage() + "\nЗащита: " + boss.getProtection());

        System.out.println("Герои \nХарактеристики:");
        createHeroes();



    }
    public static void createHeroes(){
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero("Воин ",400,50, "Меч");
        heroes[1] = new Hero("Лучник ",260, 40);
        heroes[2] = new Hero("Маг  ",280, 60, "Магия");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Имя: " + heroes[i].getName() + "\nЗдоровье: " + heroes[i].getHealth() + "\nУрон: " +
            heroes[i].getDamage() + "\nСуперспособность: " + heroes[i].getSuperPower());
        }
    }
}