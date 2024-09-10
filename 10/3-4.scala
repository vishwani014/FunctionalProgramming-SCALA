object AccountDS extends App{
    val acc1 = new Account(1, 1000)
    val acc2 = new Account(2, -500)
    val acc3 = new Account(3, 200)

    ABank.addAccount(acc1)
    ABank.addAccount(acc2)
    ABank.addAccount(acc3)

    println("Initial Accounts:")
    ABank.printAccounts()

    println("\nAfter Transfer:")
    ABank.printAccounts()

    println("\nAccounts with Negative Balances:")
    ABank.negativeBalanceAccounts.foreach(println)

    println(s"\nTotal Balance: $$${ABank.totalBalance}")

    ABank.applyInterest()
    println("\nAfter Applying Interest:")
    ABank.printAccounts()

}


class Account(val id: Int, var balance: Double) {
  
    def deposit(amount: Double): Unit = {
        if (amount > 0) balance += amount
        else println("Deposit amount must be positive")
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0 && balance >= amount) balance -= amount
        else println("Insufficient balance or invalid amount")
    }

    def transfer(to: Account, amount: Double): Unit = {
        if (amount > 0 && balance >= amount) {
        this.withdraw(amount)
        to.deposit(amount)
        } else {
        println("Transfer failed due to insufficient balance or invalid amount")
        }
    }

    override def toString: String = s"Account($id, Balance: $balance)"
}

object ABank {
    var accounts: List[Account] = List()

    def addAccount(account: Account): Unit = {
        accounts = account :: accounts
    }

    def negativeBalanceAccounts: List[Account] = {
        accounts.filter(_.balance < 0)
    }

    def totalBalance: Double = {
        accounts.map(_.balance).sum
    }

    def applyInterest(): Unit = {
        accounts.foreach { account =>
        if (account.balance > 0) {
            account.deposit(account.balance * 0.05)  
        } else {
            account.withdraw(account.balance.abs * 0.1)
        }
        }
    }

    def printAccounts(): Unit = {
        accounts.foreach(println)
    }
}