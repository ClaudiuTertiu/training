package assignment;

import java.util.ArrayList;

public class Application {
    private ArrayList<Account> accountDB = new ArrayList<>();

    public static void main(String[] args) {
        KYCVerification kycVerification = new KYCVerification("testPanNumber", 19232324, "NationalID Document", "Document Number 32");
        ContactDetails contactDetails = new ContactDetails("Str. Number 2", "Sector 1", "Bucharest", "N/A State", "Romania",919232,761293232, 222);
        Account account = new Account(1001, "John Doe", "password", 10000, kycVerification, contactDetails, 0);
        Application application = new Application();

//        submitUserDetails
        application.submitUserDetails(account);
//        doDepositOperation
        application.doDepositOperation(account, 3000);
//        doWithdrawalOperation
        application.doWithdrawalOperation(account, 1000);
//        printUserAllDetails
        application.printUserAllDetails(account);
//        printUserContactDetails
        application.printUserContactDetails(account);
//        printUserKYCDocumentDetails
        application.printUserKYCDocumentDetails(account);
//        printBalance
        application.printBalance(account);
//        changeMobileNumber
        application.printUserContactDetails(account);
        application.changeMobileNumber(account, 111111111);
        application.printUserContactDetails(account);
//        changeEmailID
        application.printUserContactDetails(account);
        application.changeEmailID(account, 111111111);
        application.printUserContactDetails(account);
    }

    public void submitUserDetails(Account account) {
        accountDB.add(account);
    }

    public void doDepositOperation(Account account, int amount) {
        account.deposit(amount);
    }

    public void doWithdrawalOperation(Account account, int amount) {
        account.withdraw(amount);
    }

    public void printUserAllDetails(Account account) {
        System.out.println("Username: " + account.getUsername());
        System.out.println("Password: " + account.getPassword());
    }

    public void printUserContactDetails(Account account) {
        System.out.println(account.getContactDetails());
    }

    public void printUserKYCDocumentDetails(Account account) {
        System.out.println("Document number: " + account.getKycDetails().getDocumentNumber());
        System.out.println("Document type: " + account.getKycDetails().getDocumentType());
    }

    public void printBalance(Account account) {
        System.out.println(account.getBalance());
    }

    public void changeMobileNumber(Account account, long mobileNumber) {
        account.getContactDetails().setMobileNumber(mobileNumber);
    }

    public void changeEmailID(Account account, long emailId) {
        account.getContactDetails().setEmailId(emailId);
    }
}
