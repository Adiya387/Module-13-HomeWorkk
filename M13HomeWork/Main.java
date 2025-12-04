package M13HomeWork;

public class Main {
    public static void main(String[] args) {
        TicketVendingMachine machine = new TicketVendingMachine();


        System.out.println("=== УСПЕШНАЯ ПОКУПКА ===");
        machine.selectTicket(100);
        machine.insertMoney(50);
        machine.insertMoney(50); // достаточно, билет выдается

        System.out.println("\n=== ОТМЕНА ДО ОПЛАТЫ ===");
        machine.selectTicket(80);
        machine.cancel();

        System.out.println("\n=== ОТМЕНА ПОСЛЕ ЧАСТИЧНОЙ ОПЛАТЫ ===");
        machine.selectTicket(120);
        machine.insertMoney(50);
        machine.cancel();
    }
}
