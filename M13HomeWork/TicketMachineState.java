package M13HomeWork;

public interface TicketMachineState {
    void selectTicket(int price);
    void insertMoney(int amount);
    void cancel();
    void dispenseTicket();
}