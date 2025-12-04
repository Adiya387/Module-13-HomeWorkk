package M13HomeWork;

public class TicketDispensedState implements TicketMachineState {

    private  TicketVendingMachine machine;

    public TicketDispensedState(TicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectTicket(int price) {
        System.out.println("Билет уже выдан. Начните новую операцию.");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Билет уже выдан. Деньги не принимаются.");
    }

    @Override
    public void cancel() {
        System.out.println("Операция уже завершена, нечего отменять.");
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Билет выдан. Спасибо за покупку!");
        machine.setState(machine.getIdleState());
    }
}
