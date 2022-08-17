public class Main {
    public static void main(String[] args) {

        //BOSS
    Boss boss = new Boss();
    boss.setDamage(50);
    boss.setHealth(700);
    boss.getWeapon().setWeapon(WeaponType.BIO_WEAPON);
    boss.getWeapon().setWeaponName("Covid 19");
        System.out.println(boss.printInfo());

        //SKELETON 1
    Skeleton skeleton = new Skeleton();
    skeleton.setHealth(100);
    skeleton.setDamage(30);
    skeleton.setSkeletonArrows(50);
    skeleton.getWeapon().setWeapon(WeaponType.BOW);
    skeleton.getWeapon().setWeaponName("Лук");
        System.out.println(skeleton.printInfo());

        //SKELETON 2
    skeleton.setHealth(110);
    skeleton.setDamage(40);
    skeleton.setSkeletonArrows(60);
    skeleton.getWeapon().setWeapon(WeaponType.BOW_AND_SHIELD);
    skeleton.getWeapon().setWeaponName("Лук и щит");
        System.out.println(skeleton.printInfo());
    }
}