package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() {
        val discountMax = 5
        //val discountConst=1
        val const = 100
        val constDis=100
        val lastPrice = 10_002
        val buyer = 1000
        val expected = 300
        //val monthEvery = 0
        val discount = buyer * discountMax/ const
        val discountStand =buyer - constDis
        val priceDiscount = buyer - discount

        val result = when{
            (lastPrice > 10000) -> priceDiscount
            (lastPrice > 1000) -> discountStand
            else -> buyer
        }



        assertEquals(expected,  result )
    }
}