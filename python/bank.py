# OOP 
class BankAccount:

    def __init__(self, account_holder, account_num, balance=0) :
        self.account_holder = account_holder
        self.account_num = account_num
        self.balance = balance

    def deposit(self):
        deposit_amt = int(input("Enter an amount to deposit: "))
        if deposit_amt > 0:
            question = input(f"Are you sure you want to deposit {deposit_amt} into your account? (Yes/No) \n")
            if question == "Yes":
                self.balance += deposit_amt
                print(f"You have deposited {deposit_amt} into your account, your current balance is {self.balance}")
            else:
                print("Transaction failed")
        else:
            print("Invalid input")

    def withdraw(self):
        withdraw_amt = int(input("Enter amount to withdraw: "))
        question = input (f"Are you sure you want to withdraw {withdraw_amt} from your account? (Yes/No) \n")
        rem_balance = self.balance
        
        if question == "Yes":
            if withdraw_amt > 0:
                if withdraw_amt <= self.balance:
                    rem_balance = self.balance - withdraw_amt
                    print(f"You have withdrawn {withdraw_amt} from your account, your balance is {rem_balance}")
                else: 
                    print("Insufficient funds")
            else:
                print("Cannot withdraw amount")
        else:
            print("Transaction failed!")

    def display_details(self):
        print(f"Account number : {self.account_num} \n Account name: {self.account_holder} \n Balance: {self.balance} ")

    def check_balance(self):
        print (f"Your current balance: {self.balance}") 


