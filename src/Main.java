public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задание 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задание 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6()  {
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов " + totalWeight + "кг!");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе " + differenceWeight + "кг!");
    }
    public static void task7() {
        System.out.println("Задание 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var differenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе " + differenceWeight + "кг!");
    }
    public static void task8() {
        System.out.println("Задание 8");
        var totalWorkingTime = 640;
        var workingTimeOfOne = 8;
        var countingWorkers = totalWorkingTime / workingTimeOfOne;
        System.out.println("Всего работников в компании - " + countingWorkers + " человек. ");
        var additionalWorkers = 94;
        var moreWorkingPeople = countingWorkers + additionalWorkers;
        var newTotalWorkingTime = totalWorkingTime / moreWorkingPeople;
        System.out.println("Если в компании работает " + moreWorkingPeople + " человека, то всего " + newTotalWorkingTime + " часов работы может быть поделено между сотрудниками. ");



    }

}