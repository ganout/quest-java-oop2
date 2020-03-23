public class Hangar {


    public static void main(String[] args) {
        

        //ajout d'un bateau dans le hangar
        Boat titanic = new Boat("Titanic");
        //ajout d'une voiture dans le hangar
        Car flashMcQueen = new Car("Flash McQueen");

        //présentation des véhicules
        System.out.println(titanic.doStuff());
        System.out.println(flashMcQueen.doStuff());
    }
}