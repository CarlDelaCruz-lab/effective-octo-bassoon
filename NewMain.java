import java.util.*;

class Employee {
    private int empno;
    private String empname;
    private int empnum;

    Employee(int empno, String empname, int empnum) {
        this.empno = empno;
        this.empname = empname;
        this.empnum = empnum;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEmpname() {
        return empname;
    }

    public int getEmpnum() {
        return empnum;
    }

}

class Main {
    public static void main(String[] args) {

        Collection<Employee> c = new ArrayList<Employee>();
        Iterator<Employee> i = c.iterator();

        Scanner s = new Scanner(System.in);
        int ch = 6;
        boolean found = false;
        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter empno: ");
                    int studno = s.nextInt();
                    System.out.println("Enter empname: ");
                    String studname = s.nextLine();
                    System.out.println("Enter empnum: ");
                    int idno = s.nextInt();

                    c.add(new Employee(studno, studname, idno));
                    break;
                case 2:
                    System.out.println("--------------------------");

                    while (i.hasNext()) {
                        Employee Studno = i.next();
                        System.out.println(s);
                    }
                    System.out.println("----------------------------");
                    break;
                case 3:
                    found = false;
                    System.out.println("Enter studno to research: ");
                    studno = s.nextInt();
                    System.out.println("----------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee st = i.next();
                        System.out.println(st);
                        found = true;
                    }

                    System.out.println("---------------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("---------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.println("Enter Empno to Delete :");
                    studno = s.nextInt();
                    System.out.println("----------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee st = i.next();
                        if (st.getEmpno() == studno) {
                            i.remove();
                            found = true;

                        }
                    }

                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Successfully...!");
                    }
                    System.out.println("-----------------------------");
                    break;
                case 5:
                    found = false;
                    System.out.println("Enter Studno to Update :");
                    studno = s.nextInt();
                    System.out.println("--------------------");
                    i = c.iterator();

                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == studno) {
                            System.out.println("Enter new Name: ");
                            studname = s.nextLine();

                            System.out.println("Enter new Number: ");
                            studno = s.nextInt();

                            found = true;

                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Updated Succesfully");
                    }
                    System.out.println("----------------------------");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;

            }
        } while (ch != 6);
    }
}