

public class EmployeeBook {

    private final Employee[] employees = new Employee[10];


    public void printEmployees() {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                System.out.printf("id: %d, FullName: %s; Department: %d; Salary: %d\n", employees[i].getId(), employees[i].getFullName(), employees[i].getDepartment(), employees[i].getSalary());
            } else {
                System.out.println("EMPTY CELL");
            }


        }
    }

    public void printEmployeesByDepartment(int department) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.printf("id: %d, FullName: %s; Salary: %d\n", employees[i].getId(), employees[i].getFullName(), employees[i].getSalary());
            }

        }
    }

    public void addEmployee(String fullName, int department, int salary) {


        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
                break;
            }
        }
    }

    public void deleteEmployeeByName(String fullName) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
            }
        }
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeSalaryByName(String name, int newSalary) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(name)) {
                employees[i].setSalary(newSalary);
            }

        }
    }

    public void changeDepartmentByName(String name, int department) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(name)) {
                employees[i].setDepartment(department);
            }
        }
    }


    public int getTotalSalary() {
        int totalSalary = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    public int getAverageSalary() {
        int employeesCount = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                employeesCount++;
            }
        }
        return getTotalSalary() / employeesCount;

    }

    public int getTotalSalaryByDepartment(int department) {
        int totalSalaryByDepartment = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                totalSalaryByDepartment += employees[i].getSalary();
            }
        }
        return totalSalaryByDepartment;
    }


    public int getAverageSalaryByDepartment(int department) {
        int employeesCount = 0;

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employeesCount++;
            }
        }
        return getTotalSalaryByDepartment(department) / employeesCount;

    }


    public void printEmployeeWithMaxSalary() {
        int maxSalary = 0;
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        assert employees[index] != null;
        System.out.println("Max Salary Employee id: " + employees[index].getId());


    }

    public void printEmployeeWithMaxSalaryByDepartment(int department) {
        int maxSalary = 0;
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        assert employees[index] != null;
        System.out.printf("Max Salary Employee in Department  %d id: " + employees[index].getId(), department);
        System.out.println();

    }


    public void printEmployeeWithMinSalary() {
        int minSalary = employees[0].getSalary();
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {

            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        assert employees[index] != null;
        System.out.print("Min Salary Employee id: " + employees[index].getId());
        System.out.println();

    }

    public void printEmployeeWithMinSalaryByDepartment(int department) {
        int minSalary = employees[0].getSalary();
//        if  (employees[0] == null) {
//
//        }
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {

            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        assert employees[index] != null;
        System.out.printf("Min Salary Employee in Department %d id: " + employees[index].getId(), department);
        System.out.println();

    }


    public void indexSalary(double indexationPercentage) {
        int newSalary = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                newSalary = (int) (employees[i].getSalary() * (indexationPercentage / 100 + 1));
                employees[i].setSalary(newSalary);
            }
        }
    }


    public void printEmployeesFullNames() {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && i != employees.length - 1) {
                sBuilder.append(employees[i].getFullName()).append(", ");
            }


        }
        System.out.println(sBuilder);
    }
}


