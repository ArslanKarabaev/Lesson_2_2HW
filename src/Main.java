public class Main {
    public static void main(String[] args) {
        Cars[] cars = {createObject("BMW"), createObject("Mercedes"), createObject("Porsche")};
        for (Cars car : cars) {
            car.print();
        }
    }

    public static Cars createObject(String className){
     switch (className){
         case("BMW"):
           BMW bmw = new BMW(2970, "BMW", "Askat");
           return bmw;

         case("Mercedes"):
             Mercedes mers = new Mercedes(1500, "Mercedes", "Black");
             return mers;

         case("Porsche"):
             Porsche porsche = new Porsche(123, "Porsche", 911);
             return porsche;
     }
     return null;
    }
}