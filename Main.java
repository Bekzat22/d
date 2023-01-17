//ДЗ:
//        ● Создать класс Weapon (Оружие), с приватными полями тип оружия и название
//        оружия.
//        ● Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
//        присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
//        ● Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
//        сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
//        геттеры и сеттеры для этого поля.
//        ● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//        полям). Затем распечатать всю информацию о боссе.
//ДЗ на сообразительность:
//        ● Распечатывание информации сделать в методе в классе Босса public String
//        printInfo(){}
//        ● Создать класс Skeleton (Скелет), унаследовать от Босса.
//        ● Добавить поле (кол-во стрел) и добавить геттеры.
//        ● Переопределить родительский метод printInfo в классе Sceleton
//        ● В Main распечатать информацию о Боссе с помощью метода printInfo, также
//        создать 2 экземпляра скелета и заполнить данными) затем распечатать всю
//        информацию о скелетах.

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(70);
        boss.setWeapon(new Weapon("AK-47","Automate"));
        System.out.println(boss.printInfo());
        Skeleton skl=new Skeleton();
        skl.setDamage(15);
        skl.setHealth(300);
        skl.arrow=22;
        skl.setWeapon(new Weapon("Super luk","flamethrower"));
        System.out.println(skl.printInfo());
        Skeleton skl1=new Skeleton();
        skl1.setDamage(10);
        skl1.setHealth(350);
        skl1.arrow=77;
        skl1.setWeapon(new Weapon("Archer","mini-gun"));
        System.out.println(skl1.printInfo());

    }

}