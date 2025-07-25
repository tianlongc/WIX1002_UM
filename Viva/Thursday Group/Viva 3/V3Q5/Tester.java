/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q5;

/**
 *
 * @author tianlongc
 */
public class Tester {
    public static void main(String[] args) {
        Bank bank = new Bank("SimpleBank");
        
        Customer customer = new Customer("John Doe", "C001");
        bank.addCustomer(customer);
        
        BankAccount account = new BankAccount("A1001", customer.getName());
        customer.addAccount(account);
        account.setBalance(500);
        
        System.out.printf("Adding a savings account for %s with account number %s and an initial deposit of $500.\n"
                , account.getAccountHolderName(), account.getAccountNumber());
        
        customer.getAccount("A1001").deposit(200); // account.deposit(200);
        System.out.printf("Depositing $200 into account %s...\n", account.getAccountNumber());
        System.out.println("New balance: $" + account.getBalance());
        
        if (customer.getAccount("A1001").withdraw(100)) { // account.withdraw(100);
            customer.getAccount("A1001").setBalance(account.getBalance() - 100);
            System.out.printf("Withdrawing $100 from account %s...\n", account.getAccountNumber());
            System.out.println("New balance: " + account.getBalance());
        }else{
            System.out.println("Invalid withdrawal amount!");
        }
        
        bank.getCustomer("C001").displayAccounts();
        bank.displayAllCustomers();
    }
}
