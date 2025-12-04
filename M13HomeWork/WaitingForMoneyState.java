package M13HomeWork;
public class WaitingForMoneyState implements TicketMachineState {

    private  TicketVendingMachine machine;

    public WaitingForMoneyState(TicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectTicket(int price) {
        System.out.println("Билет уже выбран. Для изменения отмените покупку.");
    }

    @Override
    public void insertMoney(int amount) {
        machine.addToBalance(amount);
        machine.printState("Пользователь внес " + amount);

        if (machine.getCurrentBalance() >= machine.getTicketPrice()) {
            machine.setState(machine.getMoneyReceivedState());
            machine.dispenseTicket();
        } else {
            System.out.println("Недостаточно средств. Внесите ещё.");
        }
    }

    @Override
    public void cancel() {
        machine.printState("Покупка отменена до оплаты.");
        machine.resetBalance();
        machine.setState(machine.getTransactionCanceledState());
        machine.cancel();
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Сначала нужно внести достаточно средств.");
    }
}
