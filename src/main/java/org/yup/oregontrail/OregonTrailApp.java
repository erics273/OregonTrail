package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String[] args){

        Traveler dwene = new Traveler("Dwene", 100, 100);

        System.out.println("before hunting food:" + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println("After hunting " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.getFood());

        Traveler eric = new Traveler("Eric", 75, 127);

        Wagon ourWagon = new Wagon(5);

        //asking the wagon to give us the passenger list and we are checking the size (number of passengers)
        System.out.println("number of people on the wagon: " + ourWagon.getPassengers().size());
        //this like attempts to put dwene (or any traveler we want) into the wagon if there is room
        System.out.println(ourWagon.join(dwene));
        //asking the wagon to give us the passenger list and we are checking the size (number of passengers)
        System.out.println("number of people on the wagon: " + ourWagon.getPassengers().size());


        //this like attempts to put dwene (or any traveler we want) into the wagon if there is room
        System.out.println(ourWagon.join(eric));


        //this like attempts to put dwene (or any traveler we want) into the wagon if there is room
        System.out.println(ourWagon.getTotalFood());


    }

}
