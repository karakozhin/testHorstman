import abstarctClass.Person;
import abstarctClass.Student;
import polimorfizm.Employee;
import polimorfizm.Manager;

public class Main {

    public static void main(String[] args) {
        /*Scanner keyboard = new Scanner(System.in);
        System.out.println("Вес? ");
        double weightInEarth = keyboard.nextInt();
        double weightInMoon = weightInEarth * 0.17;
        System.out.println(" ");
        System.out.println("Ваш вес на Луне " + weightInMoon + " кг");*/

        /*String s= "Ах ты бяка";
        String s2 = s.replaceAll("бяка", "вырезано цензурой");
        System.out.println(s2);*/

        /*Scanner c = new Scanner(System.in);
        double d = c.nextInt();
        System.out.println(d + (d % 1 == 0 ? " - целое" : " - не целое"));*/

        /*Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal)
        {
            balance = balance + payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years");*/

        /*Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for (int i =1; i<=k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1)/i;
            System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        }*/

        /*Scanner in = new Scanner(System.in);
        System.out.println("Select an option (1, 2, 3, 4) ");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
        }*/

        /*int[] a = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        //System.out.println(a[4]);
        for(int i=a.length;i>0;i--){
        System.out.println(i);}*/

        /*if (args[0].equals("-h"))
            System.out.print("Hello, ");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
        for(int i=1;i<args.length;i++)
            System.out.print(" " + args[i]);
        System.out.println("!");*/

        /*
        //////Полиморфизм
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for(Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());*/

        /*//abstractClass
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());*/

        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15) ;
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());

    }
}
