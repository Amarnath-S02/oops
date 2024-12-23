  abstract class vehicle{

    public String name;
    public int vehicleNo;

      public vehicle() {
          this.name=null;
          this.vehicleNo=0;
      }

      public vehicle(String name, int vehicleNo) {
          this.name = name;
          this.vehicleNo = vehicleNo;
      }
      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      // Getter and Setter for `vehicleNo`
      public int getVehicleNo() {
          return vehicleNo;
      }

      public void setVehicleNo(int vehicleNo) {
          this.vehicleNo = vehicleNo;
      }

      abstract void start();
      abstract void run();

    public void stop(){
        System.out.println(getName()+" stopped");
    }
      public void stop(String name,int vehicleNo){
          System.out.println(name+" bike and its vehicale number "+ vehicleNo+" is stopped");
      }

}
class bike extends vehicle{

    public bike() {
    }

    public bike(String name, int vehicleNo) {
        super(name, vehicleNo);
    }


    @Override

    public void stop() {
        super.stop(name,vehicleNo);
    }

    public void start()
    {
        System.out.println(getName()+" is started");
    }
    public void run()
    {
        System.out.println(getName()+" is moving");
    }
}


public class abstraction {
    public static void main(String[] args) {

        vehicle bike = new bike("x",1234);

        System.out.println("Bike name:"+bike.getName());
        System.out.println("Bike No:"+bike.getVehicleNo());


        bike.start();
        bike.run();
        bike.stop();

    }
}
