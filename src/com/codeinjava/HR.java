package com.codeinjava;

import java.util.*;
import java.util.stream.Collectors;

public class HR {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(

                new Employee("Raghuveer", 35, 50000.00, Arrays.asList("Project1", "Project4")),
                new Employee("Swathi", 27, 65000.00, Arrays.asList("Project3", "Project2")),
                new Employee("Nikhil", 35, 1000.00, Arrays.asList("Project4", "Project5")),
                new Employee("Sushma", 25, 5000.00, Arrays.asList("Project6", "Project3")),
                new Employee("Swathi", 15, 770000.00, Arrays.asList("Project1", "Project4"))

        );

//        employees.stream()
//                .filter(employee -> employee.getAge() > 15)
//                .filter(employee -> employee.getProjects().contains("Project4"))
//                //.forEach(System.out::println);
//                //.filter(employee -> employee.getName().startsWith("S"))
//                //.forEach(System.out::println);
//                //.sorted(Comparator.comparing(Employee::getName))
//                //.sorted(Comparator.comparing(Employee::getAge).reversed())
//                //.sorted(Comparator.comparing(Employee::getSalary).reversed())
//                //.sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary))
//                .map(Employee::getProjects)
//                .flatMap(List::stream)
//                .distinct()
//                .toList()
//                .forEach(System.out::println);

        //convert List to Map key-Name
//       employees.stream()
//                .collect(Collectors.groupingBy(Employee::getName, Collectors.toList()))
//               .entrySet()
//               .stream()
//               .forEach(stringListEntry -> System.out.println(stringListEntry.getKey() + " " + stringListEntry.getValue()));

        //scenario-1

        TreeMap<String, List<String>> treeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getProjects, (name1, name2) -> name2, TreeMap::new));





    }
}
