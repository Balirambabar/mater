package StreamApI_Pratical;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    int id;
    String name;
    int age;
    String gender;



    String department;
    int yearOfJoining;
    double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Amit Sharma", 28, "Male", "IT", 2019, 75000));
        employeeList.add(new Employee(2, "Priya Desai", 32, "Female", "HR", 2017, 68000));
        employeeList.add(new Employee(3, "Rahul Mehta", 45, "Male", "Finance", 2010, 98000));
        employeeList.add(new Employee(4, "Sneha Kulkarni", 29, "Female", "Marketing", 2020, 72000));
        employeeList.add(new Employee(5, "Vikram Joshi", 38, "Male", "IT", 2015, 85000));
        employeeList.add(new Employee(6, "Neha Patil", 26, "Female", "Sales", 2022, 60000));
        employeeList.add(new Employee(7, "Ravi Iyer", 41, "Male", "Operations", 2012, 90000));
        employeeList.add(new Employee(8, "Anjali Nair", 30, "Female", "Finance", 2018, 78000));
        employeeList.add(new Employee(9, "Karan Singh", 35, "Male", "HR", 2016, 70000));
        employeeList.add(new Employee(10, "Meera D'Souza", 27, "Female", "IT", 2021, 67000));
        employeeList.add(new Employee(11, "Suresh Rathi", 50, "Male", "Management", 2005, 120000));
        employeeList.add(new Employee(12, "Divya Jain", 33, "Female", "Marketing", 2014, 74000));
        employeeList.add(new Employee(13, "Arjun Kapoor", 31, "Male", "Sales", 2019, 71000));
        employeeList.add(new Employee(14, "Pooja Bhatt", 29, "Female", "Operations", 2020, 69000));
        employeeList.add(new Employee(15, "Manish Verma", 36, "Male", "IT", 2013, 88000));
        employeeList.add(new Employee(16, "Ritika Malhotra", 34, "Male", "Finance", 2016, 77000));

        // 1)How many male and Female organization

       // Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        //System.out.println("num of male emp="+genderCount.getOrDefault("Male", 0L));
        //System.out.println("num of Female emp="+genderCount.getOrDefault("Female", 0L));

        // 2)print name of all department in organization
        // employeeList.stream().map(e->e.department).distinct().forEach(System.out::println);


         // 3)Average age male and Female Emp
       // Map<String, Double> averageAgeByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        //averageAgeByGender.forEach((gender,avgAge)-> System.out.println(gender+" "+avgAge));

        // 4)get the details of highest paid employee

       // employeeList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        //5) get name of all empl who joined in 2015

       // employeeList.stream().filter(employee -> employee.getYearOfJoining()==(2015)).map(e->e.name).forEach(System.out::println);

        //6)count number of emp in each Department
        //var collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //System.out.println(collect);

        //7) Average Salary in each Department

        //var avgEachDepart = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
       // System.out.println(avgEachDepart);

        //8) get Details of Youngest male Employee in the development Department

        /*Optional<Employee> optional=employeeList.stream()
                .filter(e -> e.getGender().equals("Male") && e.department.equals("IT"))
                .min(Comparator.comparing(Employee::getAge));
           if(optional.isPresent())System.out.println(optional);*/

        //Get Emp who is having 2nd highest salary
        //Sort emp in Descending order skip 1st Record
       // employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);

         //another way

        List<Employee> emp1 = employeeList.stream()
                                          .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                           .toList();
        final var employee = emp1.get(1);
        System.out.println(employee);


    }


    }
