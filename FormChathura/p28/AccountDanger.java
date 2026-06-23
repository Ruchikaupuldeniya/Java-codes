class Account{
    private int balance=50;
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance=balance-amount;
    }
}
public class AccountDanger implements Runnable{
    static int i=0;
    private Account acct=new Account();
    public static void main(String[] args){
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Nimal");
        two.setName("Kamal");
        one.start();
        two.start();
    }
    public void run(){
        for(int x=0;x<5;x++){
            makeWithdrawal(10);
            if(acct.getBalance()<0){
                System.out.println("account is overdrawn!");
            }
        }
    }
    //private synchronized void makeWithdrawal(int amt){  
    private void makeWithdrawal(int amt){	
        if(acct.getBalance()>=amt){
            System.out.println((++i)+" "+Thread.currentThread().getName()+" is going to withdraw");
            try{
                Thread.sleep(0);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName()+" completes the widthdrawal");
        }else{
            System.out.println("Not enough in account account for "+Thread.currentThread().getName()+" to withdraw "+acct.getBalance());
        }
        
    }
}
