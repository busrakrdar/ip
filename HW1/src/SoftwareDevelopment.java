public class SoftwareDevelopment extends Department {


    public SoftwareDevelopment(String name, int numberOfWorker) {

        super(name,numberOfWorker);
        this.name=name;
        this.numberOfWorker=numberOfWorker;
        number++;

    }


    public static int getNumber() {


        return number;

    }

}
