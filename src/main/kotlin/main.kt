fun main(){
    var myAccount = CurrentAccount("bk000121314",
        "Verite",5000000.0,1)
    myAccount.deposit(2000000.0)
    myAccount.withdraw(300000.0)
    println(myAccount.withdrawals)
    myAccount.details()
    myAccount.withdraw(100000.0)
    println(myAccount.withdrawals)

    var apple = Product("Apple",1.0,10,"groceries")
    var napkin = Product("Clear",0.06,25,"hygiene")
    var shoe = Product("Air Jordan",2.0,50,"other")
    var b = listOf(apple,napkin,shoe)
    var banana = Product("banana",1.0,20,"groceries")
    var toiletPaper = Product("TeePee",0.05,30,"hygiene")
    var cloth = Product("Cloth",0.10,45,"other")
    var c = listOf(banana,toiletPaper,cloth)
    when {
//        "other"-> println(b.plus(c))
//        "groceries"-> println(b.plus(c))
//        "hygiene"-> println(b.plus(c))
    }

    var evenIndicesChar = charAtEvenIndices("Verite")
    println(evenIndicesChar)

}
open class CurrentAccount(var accountNumber:String, var accountName:String,
                          var balance:Double, var withdrawals: Int){
    fun deposit(amount:Double){
        balance+=amount
        println("Your new balance is $balance")
    }
    open fun withdraw(amount:Double): Int {
        balance-=amount
        println("Your new balance is $balance")
        return withdrawals
    }
    fun details(){
        println("Account number $accountNumber with" +
                " balance $balance is operated by $accountName")
    }
}
class SavingsAccount(accountName: String,accountNumber: String,balance: Double,
                      withdrawals: Int): CurrentAccount(accountName,accountNumber,
                        balance, withdrawals) {
    override fun withdraw(amount: Double):Int{
        super.withdraw(amount)
        var sumOfWithdrawals = 0
          if (withdrawals<=4){
              withdraw(100000.0)
          }
        sumOfWithdrawals++
        return sumOfWithdrawals
    }
}

data class Product(var name:String, var weight:Double,
                   var price:Int, var category:String)


fun charAtEvenIndices(word:String):String{
    var evenIndicesChar = ""
    word.forEachIndexed { index, c ->
        if (index%2==0){
            evenIndicesChar+=c
        }
    }
    return evenIndicesChar
}