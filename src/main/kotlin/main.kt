package  ru.netology
fun main(){
    val discountMax = 5
    val discountConst=1
    val const = 100
    val constDis=100
    val lastPrice = 10_002
    val buyer = 1000
    val monthEvery = 0
    val discount = buyer * discountMax/ const
    val discountStand =buyer - constDis
    val priceDiscount = buyer - discount
    //val regularСustomer = priceDiscount * discountConst/const




    val result = when{
        (lastPrice > 10000) -> priceDiscount
        (lastPrice > 1000) -> discountStand
        else -> buyer
    }

    val total = when{
        (monthEvery >0 && lastPrice > 10000)->  priceDiscount - priceDiscount*discountConst/const
        (monthEvery >0 && lastPrice > 1000)-> discountStand- discountStand *discountConst/const
       else -> result
   }



    println("Total price:$result $total")
}


