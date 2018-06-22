package com.khoiron.myteacher.guru.lest.privates.base
import android.annotation.SuppressLint
import android.support.v4.app.DialogFragment
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/*
 * Created by khoiron on 09/04/18.
 */

//rajaongkir
abstract class BaseDialog :DialogFragment(){

    protected var statusInternet : Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return layoutFragment()
    }

    abstract fun layoutFragment(): View

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        onViewCreatedListener(view,savedInstanceState)
    }

    abstract fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?)

    open fun onBackPress() {}

    fun setLog(message: String){
        Log.e("Test",message)
    }

    fun setToast(message: String){
        Toast.makeText(activity?.applicationContext,message, Toast.LENGTH_LONG).show()
    }

    @SuppressLint("MissingPermission")
    fun checkInterConection(){
        var connMgr = activity?.applicationContext?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var networkinfo = connMgr.activeNetworkInfo
        if (networkinfo != null && networkinfo.isConnected()) {
            statusInternet = true
            setLog(statusInternet.toString())
        } else {
            statusInternet = false
        }
    }


}