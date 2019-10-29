public class VehicleDemo
{
    public static void main(String[] args) {
        Cycle cy = new Cycle("NA","Hero","Racer-A1",2);
        cy.display();

        Bike by = new Bike("MH10 DC3168","Classic 350","Royal Enfield",2);
        by.display();

        Car cr =new Car("MH10 CX8958","Ameo","VolksWagon",4);
        cr.display();

    }
}
