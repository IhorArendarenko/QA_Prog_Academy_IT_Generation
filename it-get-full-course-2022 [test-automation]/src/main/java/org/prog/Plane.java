package org.prog;

 public class Plane {



    public String planeManufacturerName;



    public String[] passengerNames = new String[6];

    public String[] anotherPassengerList = {
            "passOne", "passTwo", "passThree"
    };

    public Plane(String manufacturerName) {
        planeManufacturerName = manufacturerName;

    }

    public void setPassenger(String passengerName, int passengerIndex) {
        if (passengerIndex >= 0 && passengerIndex < passengerNames.length)
            passengerNames[passengerIndex] = passengerName;
        else {
            System.out.println("Please enter valid Index");
        }
    }

    public void setPassengers(String [] passengers) {
        passengerNames = passengers;
    }
    public String getPassenger(int index) {
        return passengerNames[index];
    }



}