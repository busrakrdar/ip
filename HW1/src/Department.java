public class Department {

    protected String name;
    protected int numberOfWorker;

    public static int number;



    public String getName() {
        return name;
    }




    public Department(String name, int numberOfEmployee) {
        numberOfEmployee=numberOfWorker;



    }

    @Override
    public boolean equals(Object obj) {
         if(obj instanceof SoftwareDevelopment){
            SoftwareDevelopment naz=(SoftwareDevelopment)obj;

            return numberOfWorker==naz.numberOfWorker;
        }




        return false;

    }

    @Override
    public String toString() {


        return name+"/"+"number of worker :"+" "+numberOfWorker;

    }




}
