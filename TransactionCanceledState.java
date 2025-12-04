package M13HomeWork;

public class TransactionCanceledState implements TicketMachineState {

    private  TicketVendingMachine machine;

    public TransactionCanceledState(TicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectTicket(int price) {
        System.out.println("Предыдущая операция отменена. Можно начать новую.");
        machine.setState(machine.getIdleState());
        machine.selectTicket(price);
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Транзакция отменена. Начните заново.");
    }

    @Override
    public void cancel() {
        System.out.println("Транзакция завершена в состоянии 'Отменена'.");
        machine.setState(machine.getIdleState());
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Билет не выдается, транзакция отменена.");
    }
}
