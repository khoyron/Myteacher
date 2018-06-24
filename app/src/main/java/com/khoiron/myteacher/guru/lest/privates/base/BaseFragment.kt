package com.khoiron.myteacher.guru.lest.privates.base
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.support.v4.app.Fragment;
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * Created by khoiron on 31/03/18.
 */
abstract class BaseFragment : Fragment() {

    protected var statusInternet : Boolean = false
    protected lateinit var pDialog: ProgressDialog
    lateinit var myView :View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return layoutFragment()
    }

    abstract fun layoutFragment(): View

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        pDialog = ProgressDialog(context)
        pDialog.setCancelable(false)
        this.myView = view
        onViewCreatedListener(view,savedInstanceState)
    }

    abstract fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?)

    open fun onBackPress() {}

    fun setLog(message: String?){
        Log.e("Test",message)
    }

    fun setToast(message: String){
        Toast.makeText(activity?.applicationContext,message, Toast.LENGTH_LONG).show()
    }

    fun closeApplication(){
        AlertDialog.Builder(activity?.applicationContext)
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
        AlertDialog.Builder(activity?.applicationContext)
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
        AlertDialog.Builder(activity?.applicationContext)
                .setMessage("Apa anda yakin ingin keluar dari Akun?")
                .setCancelable(false)
                .setPositiveButton("IYA") { dialog, id ->
                    activity?.applicationContext?.startActivity(Intent(activity?.applicationContext,clas))
                }
                .setNegativeButton("Tidak", null)
                .show()
    }

    fun closeLogout(message: String,clas : Class<*>?){
        AlertDialog.Builder(activity?.applicationContext)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("IYA") { dialog, id ->
                    activity?.applicationContext?.startActivity(Intent(activity?.applicationContext,clas))
                }
                .setNegativeButton("Tidak", null)
                .show()
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

    protected fun showDialog(Mdialog: String) {
        if (!pDialog.isShowing)
            pDialog.setMessage(Mdialog)
        pDialog.show()
    }

    protected fun hideDialog() {
        if (pDialog.isShowing)
            pDialog.dismiss()
    }

    open fun goActivity(c: Class<*>) {
        startActivity(Intent(context,c))
    }

}