package com.company;


public class Main {

    public static void main(String[] args) throws InterruptedException {


        Runnable runnable = new primeNumbersTo350("Thread 1");
        Thread thread = new Thread(runnable);
        thread.setName("Thread 1");
        System.out.println("Starting thread 1");
        thread.start();
        thread.join();


        Runnable runnable1 = new primeNumbersTo500("Thread 2");
        Thread thread1 = new Thread(runnable1);
        System.out.println("Starting thread 2");

        if (!thread.isAlive()) {
            thread1.start();
        }


    }
}


// REGEX
/*        List<String> words = List.of("Mango", "Apple", "Kiwi", "Orange", "Ugly", "yield");
        String regex=("\"[aeiouy][^ ]*[aeiouy]\"");
        Pattern p = Pattern.compile(regex);
        for (String word : words) {
            Matcher m = p.matcher(word);
            if (m.matches()) {
                System.out.printf("%s matches%n", word);
            } else {
                System.out.printf("%s does not match%n", word);
            }
        }*/


//PERSON LIST
/*      Person person1 = new Person("Ali", "Male", 45000);
        Person person2 = new Person("Musti", "Male", 40000);
        Person person3 = new Person("Semir", "Male", 35000);
        Person person4 = new Person("Suad", "Male", 12000);
        Person person5 = new Person("Xherald", "Male", 10000);
        Person person6 = new Person("Louise", "Female", 30000);
        Person person7 = new Person("Lisa", "Female", 26000);
        Person person8 = new Person("Lotta", "Female", 32000);
        Person person9 = new Person("Linda", "Female", 28000);
        Person person10 = new Person("Sara", "Female", 41000);*/

/*        List<Person> personList = Arrays.asList(person1, person2, person3, person4,
                person5, person6, person7, person8, person9, person10);*/
//STREAM
//Map<String, Double> average = personList.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.averagingDouble(Person::getSalary)));
/*        Double lowestSalary = personList.stream().min(Comparator.comparing(Person::getSalary))
                .map(Person::getSalary)
                .get();
        System.out.println(lowestSalary);

        System.out.println("----------------------------------------------------------------");
        Double highestSalary = personList.stream().max(Comparator.comparing(Person::getSalary))
                .map(Person::getSalary)
                .get();
        System.out.println(highestSalary);*/


//Factory pattern
     /*   CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCar("Volvo");
        car.engine();
        car.horsePower();
        System.out.println("------------------------------------------------------");
        Car car1=carFactory.getCar("bmw");
        car1.engine();
        car1.horsePower();
        System.out.println( "----------------------------");
        Car car2=carFactory.getCar("mercedes");
        car2.engine();
        car2.horsePower();*/




