public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account (String f, String l, double b){
        acctNum = (int)(Math.random()*999)+1;
        this.first=first;
        this.last=last;
        this.balance=balance;
    }
    public Account (Account dupacc) {
        this(dupacc.first, dupacc.last, dupacc.balance);
    }




}
