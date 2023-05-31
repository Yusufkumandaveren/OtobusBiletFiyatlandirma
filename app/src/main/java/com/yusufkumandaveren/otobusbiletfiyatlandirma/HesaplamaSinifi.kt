package com.yusufkumandaveren.otobusbiletfiyatlandirma

class HesaplamaSinifi {
    fun yolcuBilgileri(){
        print("Gidilecek mesafe km türünde yazınız:")
        val km = readLine()!!.toIntOrNull()
        println("")
        print("Yaşınızı giriniz:")
        var yas = readLine()!!.toIntOrNull()
        println("")
        print("Yolculuk tipini giriniz: (1=>Tek yön , 2=> Gidiş-Dönüş)")
        val yolculuk = readLine()!!.toIntOrNull()
        println("")
        //-------------------------

        val hesap = (km!!.toDouble()*0.1)
        val yuzdeOn = hesap - ((hesap*10)/100)
        val yuzdeYirmi = hesap - ((hesap*20)/100)
        val yuzdeOtuz = hesap - ((hesap*30)/100)
        val yuzdeElli = hesap - ((hesap*50)/100)
        //--------------
        if (yolculuk == 1){
            when(yas){
                in 1..11-> println("Indirimli tutar: $yuzdeElli TL")
                in 12..24-> println("Indirimli tutar:$yuzdeOn TL")
                in 25..64-> println("Toplam tutar: $hesap TL")
                in 65..120-> println("Indirimli tutar: $yuzdeOtuz TL ")
                else-> println("Hatalı veri girdiniz!")
            }
        }else if (yolculuk == 2){
            println("Toplam tutar: $yuzdeYirmi TL")
        }else{
            println("Hatalı veri girdiniz!")
        }
    }
}