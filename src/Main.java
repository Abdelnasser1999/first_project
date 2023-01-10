public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car1", -1, true, 5, false);


        double result = calcInsurance(car);
        System.out.println(result + "");

    }


    public static double calcInsurance(Car car) {
        double priceOfInsurance = 0.0;
        double priceBeforPercent = 0.0;
        if (car.numOfHours >= 0.0 && car.numOfHours <= 50.0) {
            priceOfInsurance = 400.0;
        } else if (car.numOfHours < 0.0) {
            System.out.println("There is no car has" + car.numOfHours);
        }
        if (car.numOfHours > 50.0 && car.numOfHours <= 100.0) {
            priceOfInsurance = 600.0;
        }
        if (car.numOfHours > 100.0) {
            priceOfInsurance = 600.0;

            int num = car.numOfHours - 100;
            double subTotal = num * 3.80;
            priceOfInsurance = priceOfInsurance + subTotal;
        }
        priceBeforPercent = priceOfInsurance;

        if (car.isSportCar) {
            if (car.numofYear < 4) {
                double avg = (priceOfInsurance * 8) / 100;
                priceOfInsurance = avg + priceOfInsurance;
            } else {
                double avg = (priceOfInsurance * 4) / 100;
                priceOfInsurance = priceOfInsurance - avg;

            }
        }

        if (car.parkingInStreet) {
            double avg = (priceBeforPercent * 8) / 100;
            priceOfInsurance = priceOfInsurance + avg;
        } else {
            double avg = (priceBeforPercent * 2) / 100;
            priceOfInsurance = priceOfInsurance - avg;
        }


        return priceOfInsurance;
    }
}