class car
{
    private String msg ="I am Wonder CARRRRR!!!";
    public void show()
    {
        System.out.println("Msg from car "+msg);
    }
    class engine
    {
        private int capacity =10;
        public void start()
        {
            System.out.println(msg);
            System.out.println("Car with "+capacity+" cc Engine starting!!!!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
          car maruti =  new car();
          maruti.show();
          //OR
          maruti.new engine().start();
          //OR
          car.engine alto =  maruti.new engine();
          alto.start();
          //OR
          car.engine wagonR = new car().new engine();
          wagonR.start();
    }
}