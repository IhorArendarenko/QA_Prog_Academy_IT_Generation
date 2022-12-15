 package org.prog;

  public class Main {

      public static void main(String... args) {
          Plane mriyaPlane = new Plane("Mriya");

          String[] ourPassengers = new String[6];
          ourPassengers[0] = "Georgiy Bushchan";
          ourPassengers[1] = "Vitaliy Mykolenko";
          ourPassengers[2] = "Mykola Matviyenko";
          ourPassengers[3] = "Illya Zabarnyi";
          ourPassengers[4] = "Oleksandr Karavaev";
          ourPassengers[5] = "Taras Stepanenko";

          mriyaPlane.setPassengers(ourPassengers);

          mriyaPlane.setPassenger("Serhii Sydorchuk", 4);

          for (int i = 0; i < ourPassengers.length; i++) {

              findBushchan(mriyaPlane.getPassenger(i));

          }


      }


      public static void findBushchan(String passengerName) {

          switch (passengerName) {
              case "Georgiy Bushchan":
                  System.out.println("This is Jora Bushchanishe");
                  break;

              case "Vitaliy Mykolenko":
                  System.out.println("This is best left back in Everton");
                  break;

              case "Mykola Matviyenko":
                  System.out.println("This is best middle-left back in Shakhtar");
                  break;

              case "Illya Zabarnyi":
                  System.out.println("This is best middle-right back in Dynamo");
                  break;

              case "Oleksandr Karavaev":
                  System.out.println("This is best player from Kherson");
                  break;

              case "Taras Stepanenko":
                  System.out.println("This is best stopper whose name is Taras");
                  break;
              default:
                  System.out.println("Who are you?");

          }
      }
  }



