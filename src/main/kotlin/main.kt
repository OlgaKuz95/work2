package  ru.netology
fun main(){
    val discountMax = 5
    val discountConst = 1
    val const = 100
    val constDis=100
    val lastOne = 1001..10_000
    val last = 10_000
    val buyer = 1000
    val monthEvery = 0
    val discount = buyer * discountMax/ const
    val topDiscount = discount * discount/const
    val totalPrice = buyer -discount
    val result = if (last<=1000){
        buyer
    }
    else if(last in lastOne){
       (buyer-constDis)
    }

    else totalPrice


    println("Total price:$result")
}


