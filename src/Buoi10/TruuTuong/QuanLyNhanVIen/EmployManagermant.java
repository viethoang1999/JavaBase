package Buoi10.TruuTuong.QuanLyNhanVIen;

public class EmployManagermant {
    private int n;
    private Employee employee[];

    public EmployManagermant(int n) {
        this.n = n;
        this.employee = new Employee[n];
    }

    public void input() {
        for (int i = 0; i < n; i++) {
//            if (i%2!=EmployFactory.FULLTIME){
//                employee[i]=EmployFactory.get(EmployFactory.FULLTIME);
//            }else {
//                employee[i]=EmployFactory.get(EmployFactory.PARTIME);
//            }
//            employee[i].input();
            if (i % 2 == 0) {
                employee[i] = new FullTime();

            } else {
                employee[i] = new PartTime();
            }
            employee[i].input();
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            employee[i].output();
        }
    }

    public Employee maxSalaryRate() {
        Employee max = employee[0];
        for (int i = 1; i < n; i++) {
//            if (employee[i] instanceof FullTime) {
            if (max.getCalculateSalary() < employee[i].getCalculateSalary()) {
                 employee[i]=max;
                //               }
            }
        }
        return max;
    }

    public Employee minSalaryRate() {
        Employee min = employee[0];
        for (int i = 1; i < n; i++) {
//            if (employee[i] instanceof FullTime){
            if (min.getCalculateSalary() > employee[i].getCalculateSalary()) {
                 employee[i]=min;
                //               }
            }
        }
        return min;
    }

    public void print() {
        System.out.println("Có " + n + " nhân viên");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + " :" + employee[i].toString());
        }
    }
}
