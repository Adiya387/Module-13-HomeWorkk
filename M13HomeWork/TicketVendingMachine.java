package M13HomeWork;
public class TicketVendingMachine {

    private  TicketMachineState idleState;
    private  TicketMachineState waitingForMoneyState;
    private  TicketMachineState moneyReceivedState;
    private  TicketMachineState ticketDispensedState;
    private  TicketMachineState transactionCanceledState;

    private TicketMachineState currentState;

    private int ticketPrice;
    private int currentBalance;

    public TicketVendingMachine() {
        this.idleState = new IdleState(this);
        this.waitingForMoneyState = new WaitingForMoneyState(this);
        this.moneyReceivedState = new MoneyReceivedState(this);
        this.ticketDispensedState = new TicketDispensedState(this);
        this.transactionCanceledState = new TransactionCanceledState(this);

        this.currentState = idleState;
        this.ticketPrice = 0;
        this.currentBalance = 0;
    }

    public void selectTicket(int price) {
        currentState.selectTicket(price);
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(amount);
    }

    public void cancel() {
        currentState.cancel();
    }

    public void dispenseTicket() {
        currentState.dispenseTicket();
    }


    void setState(TicketMachineState newState) {
        this.currentState = newState;
    }

    TicketMachineState getIdleState() {
        return idleState;
    }

    TicketMachineState getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    TicketMachineState getMoneyReceivedState() {
        return moneyReceivedState;
    }

    TicketMachineState getTicketDispensedState() {
        return ticketDispensedState;
    }

    TicketMachineState getTransactionCanceledState() {
        return transactionCanceledState;
    }

    int getTicketPrice() {
        return ticketPrice;
    }

    void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    int getCurrentBalance() {
        return currentBalance;
    }

    void addToBalance(int amount) {
        this.currentBalance += amount;
    }

    void resetBalance() {
        this.currentBalance = 0;
    }

    void printState(String message) {
        System.out.println("[STATE] " + message +
                " | price=" + ticketPrice +
                " | balance=" + currentBalance);
    }
}
