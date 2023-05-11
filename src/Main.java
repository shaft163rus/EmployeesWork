public class Main {
    public static void main(String[] args) {

        EmployeeBook em = new EmployeeBook();

        //добавляем сотрудников
        em.addEmployee("one", 2, 3400);
        em.addEmployee("two", 1, 5400);
        em.addEmployee("three", 4, 16400);
        em.addEmployee("four", 5, 7900);
        em.addEmployee("five", 2, 3600);
        em.addEmployee("six", 1, 15400);
        em.addEmployee("seven", 3, 6400);
        em.addEmployee("eight", 5, 7200);
        em.addEmployee("nine", 5, 7400);


        System.out.println("==================EASY================");
        em.printEmployees();
        em.printEmployeeWithMinSalary();
        em.printEmployeeWithMaxSalary();
        System.out.println("Average Salary " + em.getAverageSalary());
        em.printEmployeesFullNames();


        System.out.println("==================MIDDLE================");
        em.printEmployeeWithMinSalaryByDepartment(1);
        em.printEmployeeWithMaxSalaryByDepartment(3);
        System.out.println("Total salary by department " + em.getAverageSalaryByDepartment(5));
        System.out.println("Average salary by department " + em.getAverageSalaryByDepartment(3));
        em.indexSalary(21.5);
        em.printEmployeesByDepartment(5);


        System.out.println("==================HARD================");
        em.addEmployee("eleven", 3, 5000);
        em.deleteEmployeeByName("one");
        em.deleteEmployeeById(8);
        em.changeSalaryByName("two", 100500);
        em.changeDepartmentByName("three", 3);

    }
}
