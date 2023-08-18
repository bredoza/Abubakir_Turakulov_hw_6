public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Lich King");
        boss.setHealth(100000);
        boss.setDamage(100);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Frostmourne");
        boss.setWeapon(bossWeapon);

        Skeleton majorSkeleton = new Skeleton();
        majorSkeleton.setName("Major Skeleton");
        majorSkeleton.setHealth(10000);
        majorSkeleton.setDamage(25);
        majorSkeleton.setArrows(175);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Sunfury Bow of the Phoenix");
        majorSkeleton.setWeapon(skeletonWeapon2);

        Skeleton skeleton = new Skeleton();
        skeleton.setName("Skeleton");
        skeleton.setHealth(5000);
        skeleton.setDamage(50);
        skeleton.setArrows(100);
        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Classic Bow");
        skeleton.setWeapon(skeletonWeapon1);

        System.out.println(boss.printInfo());
        System.out.println(skeleton.printInfo());
        System.out.println(majorSkeleton.printInfo());
    }
}