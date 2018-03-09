

public class SoftwareDeveloper extends Employee {

    protected Department department;
    protected String projectName;



    public static int getNumber() {
        return number;
    }


    public SoftwareDeveloper(String name, int yearOfSeniority, String projectName, Department department) {
        this.name=name;
        this.yearOfSeniority=yearOfSeniority;
        this.projectName=projectName;
        this.department=department;
        number ++;

    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SoftwareDeveloper){
            SoftwareDeveloper naz=(SoftwareDeveloper)obj;

            return yearOfSeniority==naz.yearOfSeniority&&projectName==naz.projectName;


        }

        return false;



    }


    @Override
    public String toString() {




        return name+"@"+department.name+"-P:"+projectName+"-S:"+yearOfSeniority;

    }


    @Override
    public double calculateSalary() {


        return 2000+30*Math.pow(yearOfSeniority,2);
    }
}
