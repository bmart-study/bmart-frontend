package com.example.bmart.base

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


abstract class BaseActivity<T: ViewDataBinding, R: BaseViewModel>: AppCompatActivity() {

    lateinit var binding: T // 데이터 바인딩
    abstract val TAG :String // 액티비티 태그
    abstract val layoutRes: Int // 바인딩에 필요한 layout
    abstract val viewModel: R // 뷰모델

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"onCreate")
        binding = DataBindingUtil.setContentView(this, layoutRes)
        setMarketInfo()
        setDisplayBind()
        setRv()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
    }


    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")
    }

    open fun setDisplayBind(){
    }

    open fun setMarketInfo(){
    }



    /**
     * 리사이클러뷰를 셋팅
     */
    @SuppressLint("UseCompatLoadingForDrawables")
    open fun setRv(){

    }

}