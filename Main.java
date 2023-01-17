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


public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(70);
        boss.setWeapon(new Weapon("AK-47","Automate"));
        System.out.println(boss.getDamage()+" "+boss.getHealth());
        System.out.println(boss.getWeapon().getName()+" "+boss.getWeapon().getType());

    }

}