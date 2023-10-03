public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;// я так понял что нужно присвоить значение типа int
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var sumMass = massBoxer1 + massBoxer2;
        var diffMass = massBoxer2 - massBoxer1;
        System.out.println(sumMass);
        System.out.println(diffMass);

        System.out.println("Задача 7");
        var diffMassM1 = massBoxer2 - massBoxer1;
        var diffMassM2 = massBoxer2 % massBoxer1;
        //System.out.println(diffMassM1);
        //System.out.println(diffMassM2); выводить в задании не было)

        System.out.println("Задача 8. Часть 1.");
        var workShift = 8;
        var genWorkingHours = 640;
        var totalEmployees = genWorkingHours / workShift;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек.");
        System.out.println("Задача 8. Часть 2.");
        totalEmployees = totalEmployees + 94;
        genWorkingHours = workShift * totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees +
                " человек, то всего " + genWorkingHours + " часов " +
                "работы может быть поделено между сотрудниками.");


    }
}