package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val number = reader.nextInt()

    for(i in 1..10000){
        if (i % number == 2){
            println(i)
        }
    }
}
