package assignment;

public class Account {
    private long accountNumber;
    private String username;
    private String password;
    private int balance;
    private KYCVerification kycDetails;
    private ContactDetails contactDetails;
    private int cashback;

    public Account(long accountNumber, String username, String password, int balance, KYCVerification kycDetails, ContactDetails contactDetails, int cashback) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.kycDetails = kycDetails;
        this.contactDetails = contactDetails;
        this.cashback = cashback;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public KYCVerification getKycDetails() {
        return kycDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public int getCashback() {
        return cashback;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setKycDetails(KYCVerification kycDetails) {
        this.kycDetails = kycDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public int deposit(int amount) {
        setBalance(getBalance() + amount);
        return getBalance();
    }

    public int withdraw(int amount) {
        int totalBalance = getBalance() + getCashback();
        int futureBalance = totalBalance - amount;
        if(futureBalance < 0 || futureBalance < 5000) {
            System.out.println("The operation could not be performed.");
            return -1;
        }
        setBalance(futureBalance);
        setCashback((int) (getCashback() * 0.1));
        return getBalance();
    }

    public static void main(String[] args) {
        KYCVerification kycVerification = new KYCVerification("testPanNumber", 19232324, "NationalID Document", "Document Number 32");
        ContactDetails contactDetails = new ContactDetails("Str. Number 2", "Sector 1", "Bucharest", "N/A State", "Romania",919232,761293232, 91);
        Account account = new Account(1001, "John Doe", "password", 10000, kycVerification, contactDetails, 0);
        account.deposit(10000);
        account.withdraw(20000);
    }
}
