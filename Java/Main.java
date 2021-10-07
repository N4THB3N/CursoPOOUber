package Java;

class Main{
    public static void main(String[] args) {

        UberX uberx = new UberX("AMQ123", new Account("Juancho Camacho", "KSL451", "romeroromero@hgotmail.com", "SKSKS"), "Chevrolet", "Spark");
        uberx.setPassengers(4);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("ks4s1", new Account("Magdiel Lara", "45554", "magdie@gmail.com", "SKQMS"));
        ubervan.setPassengers(6);  
        ubervan.printDataCar();  
        // UberX car2 = new UberX("M939F", new Account("Flacio Eustasio", "47515", "flacioesustacio@gmail.com", "SLKSJKS"), "Dodge", "RAM");
        // car2.passengers = 6;

        // car2.printDataCar();
        
    }
}