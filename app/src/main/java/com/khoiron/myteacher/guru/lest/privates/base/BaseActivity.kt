package com.khoiron.myteacher.guru.lest.privates.base

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.Utility.ApiUrl
import com.facebook.FacebookSdk
import java.text.SimpleDateFormat
import java.util.*




/**
 * Created by khoiron on 18/03/18.
 */
abstract class BaseActivity :AppCompatActivity() {

    protected lateinit var pDialog: ProgressDialog
    protected var statusInternet : Boolean = false
    protected lateinit var pCurrentFragment: BaseFragment
    val myUrl by lazy { ApiUrl.getData()}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pDialog = ProgressDialog(this)
        pDialog.setCancelable(false)
        FacebookSdk.sdkInitialize(getApplicationContext());
        layoutView()


        onMain(savedInstanceState)
    }



    abstract fun layoutView()

    abstract fun onMain(savedInstanceState: Bundle?)
    fun setLog(message: String){
        Log.e("Test",message)
    }

    fun switchFargment(place :Int,fragment: BaseFragment){
        pCurrentFragment = fragment
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(place, fragment)
        fragmentTransaction.commit()
    }

    fun destroyFragment(fragment: BaseFragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.remove(fragment).commit()
    }

    fun destroyFragment(fragment: BaseFragment,fragment2: BaseFragment,fragment3: BaseFragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.remove(fragment).commit()

        val fragmentTransaction2 = supportFragmentManager.beginTransaction()
        fragmentTransaction2.remove(fragment2).commit()

        val fragmentTransaction3 = supportFragmentManager.beginTransaction()
        fragmentTransaction3.remove(fragment3).commit()

    }

    protected fun showDialog(Mdialog: String) {
        if (!pDialog.isShowing)
            pDialog.setMessage(Mdialog)
        pDialog.show()
    }

    protected fun hideDialog() {
        if (pDialog.isShowing)
            pDialog.dismiss()
    }

    fun closeApplication(){
        AlertDialog.Builder(this)
                .setMessage("Apa Anda yakin ingin menutup aplikasi?")
                .setCancelable(false)
                .setPositiveButton("IYA") { dialog, id ->
                    val exit = Intent(Intent.ACTION_MAIN)

                    exit.addCategory(Intent.CATEGORY_HOME)

                    exit.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                    startActivity(exit)
                }
                .setNegativeButton("Tidak", null)
                .show()
    }

    fun closeApplication(message: String){
        AlertDialog.Builder(this)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("IYA") { dialog, id ->
                    val exit = Intent(Intent.ACTION_MAIN)

                    exit.addCategory(Intent.CATEGORY_HOME)

                    exit.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                    startActivity(exit)
                }
                .setNegativeButton("Tidak", null)
                .show()
    }

    fun closeLogout(clas : Class<*>?){
        AlertDialog.Builder(this)
                .setMessage("Apa anda yakin ingin keluar dari Akun?")
                .setCancelable(false)
                .setPositiveButton("IYA") { dialog, id ->
                    startActivity(Intent(this,clas))
                }
                .setNegativeButton("Tidak", null)
                .show()
    }

    fun closeLogout(message: String,clas : Class<*>?){
        AlertDialog.Builder(this)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("IYA") { dialog, id ->
                    startActivity(Intent(this,clas))
                }
                .setNegativeButton("Tidak", null)
                .show()
    }

    fun getDay():String{
        val calendar = Calendar.getInstance()
        val mdformat = SimpleDateFormat("dd/MM/yyyy")
        val strDate = "Current Date : " + mdformat.format(calendar.getTime())
        return strDate
    }
    fun getDay(formatDate:String):String{
        val calendar = Calendar.getInstance()
        val mdformat = SimpleDateFormat(formatDate)
        val strDate = "Current Date : " + mdformat.format(calendar.getTime())
        return strDate
    }

    @SuppressLint("MissingPermission")
    fun checkInterConection(){
        var connMgr = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var networkinfo = connMgr.activeNetworkInfo
        if (networkinfo != null && networkinfo.isConnected()) {
            statusInternet = true
            setLog(statusInternet.toString())
        } else {
            statusInternet = false
        }
    }

    fun setToast(message: String){
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }

    open fun goActivity(c: Class<*>) {
        startActivity(Intent(applicationContext,c))
    }

    fun notice() {
        android.support.v7.app.AlertDialog.Builder(this)
                .setMessage("Maaf fitur ini masih belum tersedia!")
                .setCancelable(false)
                .setNegativeButton("Ok", null)
                .show()
    }
}