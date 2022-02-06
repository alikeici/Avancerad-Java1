package com.company;

public class CarFactory {

    public Car getCar(String brand){
        if (brand == null){// om brand är null returnera null
            return null;
        }

        if (brand.equalsIgnoreCase("Volvo")){// om brand är lika med volvo returnera en ny Vovlo objekt
            return new Volvo();
        }
        if (brand.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        if (brand.equalsIgnoreCase("Mercedes")){
            return new Mercedes();
        }

        return null;// annars returner null om inget skrivs in i brand parametern
    }
}
