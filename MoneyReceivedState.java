package M13HomeWork;

public class MoneyReceivedState implements TicketMachineState {

    private  TicketVendingMachine machine;

    public MoneyReceivedState(TicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectTicket(int price) {
        System.out.println("Билет уже выбран и оплачен. Нельзя менять сейчас.");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Сумма уже достаточна. Лишние деньги не нужны.");
    }

    @Override
    public void cancel() {
        machine.printState("Покупка отменена после внесения денег. Возврат средств.");
        machine.resetBalance();
        machine.setState(machine.getTransactionCanceledState());
        machine.cancel();
    }

    @Override
    public void dispenseTicket() {
        machine.printState("Выдача билета.");
        machine.resetBalance();
        machine.setState(machine.getTicketDispensedState());
        machine.dispenseTicket();
    }
}
