package com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.Utility

/**
 * Created by khoiron on 19/01/18.
 */
object ApiUrl {

    val BASE_URL = "https://127.0.0.1:8080/"
    fun getData(): MyUrl {
        return RetrofitClient.getClient(BASE_URL)!!.create(MyUrl::class.java)
    }
}