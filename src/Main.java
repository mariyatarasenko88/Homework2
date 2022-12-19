public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
    }
    public static void task3 () {
        System.out.println("Задача 3");
     var paper = 763789;
     System.out.println(paper);
     paper = paper + 4;
     System.out.println(paper);
     paper = paper - 7639;
     System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6-7");
        var firstBoxersWeight = 78.2;
        var secondBoxersWeight = 82.7;
        var totalWeight = firstBoxersWeight + secondBoxersWeight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");
        var differenceWeight = secondBoxersWeight - firstBoxersWeight;
        System.out.println("Разница в весе спортсменов " + differenceWeight + " кг");
        var differenceWeight2 = (secondBoxersWeight % firstBoxersWeight);
        System.out.println("Разница в весе спортсменов2 " + differenceWeight2 + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 8");
        var totalHours = 640;
        var workingHoursOfEach = 8;
        var totalEmployees = totalHours / workingHoursOfEach;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        var totalNumberOfEmployees = totalEmployees + 94;
        System.out.println(totalNumberOfEmployees);
        var forecastHours = totalNumberOfEmployees + workingHoursOfEach;
        System.out.println("Если в компании работает " + totalNumberOfEmployees + " человека, то всего " + forecastHours + " часа работы может быть поделено между сотрудниками");

    }
}

