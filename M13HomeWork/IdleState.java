package M13HomeWork;

public class IdleState implements TicketMachineState {

    private  TicketVendingMachine machine;

    public IdleState(TicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectTicket(int price) {
        machine.setTicketPrice(price);
        machine.printState("Билет выбран, цена = " + price);
        machine.setState(machine.getWaitingForMoneyState());
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Сначала выберите билет.");
    }

    @Override
    public void cancel() {
        System.out.println("Нечего отменять, автомат в режиме ожидания.");
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Сначала выберите билет и оплатите.");
    }
}
