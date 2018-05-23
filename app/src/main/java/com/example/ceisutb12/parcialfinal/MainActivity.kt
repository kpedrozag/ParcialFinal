package com.example.ceisutb12.parcialfinal

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpPost
import com.github.kittinunf.result.Result
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : Activity() {

    var operacion = ""
    var num1 = ""
    var num2 = ""
    var valor = ""
    var aviso = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FuelManager.instance.basePath = "http://parcial.getsandbox.com/operation"
        setContentView(R.layout.activity_main)
    }

    fun bb7(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b7.text.toString()
            valor = pantalla.text.toString() + b7.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b7.text.toString()
            valor = pantalla.text.toString() + b7.text.toString()
            pantalla.text = valor
        }
    }
    fun bb8(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b8.text.toString()
            valor = pantalla.text.toString() + b8.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b8.text.toString()
            valor = pantalla.text.toString() + b8.text.toString()
            pantalla.text = valor
        }
    }
    fun bb9(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b9.text.toString()
            valor = pantalla.text.toString() + b9.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b9.text.toString()
            valor = pantalla.text.toString() + b9.text.toString()
            pantalla.text = valor
        }
    }
    fun bb_divide(v: View)
    {
        val op = b_divide.text
        valor = pantalla.text.toString() + op
        pantalla.text = valor
        operacion = "div"
        aviso = false
    }


    fun bb4(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b4.text.toString()
            valor = pantalla.text.toString() + b4.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b4.text.toString()
            valor = pantalla.text.toString() + b4.text.toString()
            pantalla.text = valor
        }
    }
    fun bb5(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b5.text.toString()
            valor = pantalla.text.toString() + b5.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b5.text.toString()
            valor = pantalla.text.toString() + b5.text.toString()
            pantalla.text = valor
        }
    }
    fun bb6(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b6.text.toString()
            valor = pantalla.text.toString() + b6.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b6.text.toString()
            valor = pantalla.text.toString() + b6.text.toString()
            pantalla.text = valor
        }
    }
    fun bb_multi(v: View)
    {
        val op = b_multi.text
        valor = pantalla.text.toString() + op
        pantalla.text = valor
        operacion = "mul"
        aviso = false
    }


    fun bb1(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b1.text.toString()
            valor = pantalla.text.toString() + b1.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b1.text.toString()
            valor = pantalla.text.toString() + b1.text.toString()
            pantalla.text = valor
        }
    }
    fun bb2(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b2.text.toString()
            valor = pantalla.text.toString() + b2.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b2.text.toString()
            valor = pantalla.text.toString() + b2.text.toString()
            pantalla.text = valor
        }
    }
    fun bb3(v: View)
    {
        if(aviso)
        {
            num1 = num1 + b3.text.toString()
            valor = pantalla.text.toString() + b3.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b3.text.toString()
            valor = pantalla.text.toString() + b3.text.toString()
            pantalla.text = valor
        }
    }
    fun bb_menos(v: View)
    {
        val op = b_menos.text
        valor = pantalla.text.toString() + op
        pantalla.text = valor
        operacion = "res"
        aviso = false
    }



    fun bb0(v: View)
    {
        if(num1 == "")
        {
            num1 = num1 + b0.text.toString()
            valor = pantalla.text.toString() + b0.text.toString()
            pantalla.text = valor
        }
        else
        {
            num2 = num2 + b0.text.toString()
            valor = pantalla.text.toString() + b0.text.toString()
            pantalla.text = valor
        }
    }
    fun bb_suma(v: View)
    {
        val op = b_mas.text
        valor = pantalla.text.toString() + op
        pantalla.text = valor
        operacion = "sum"
        aviso = false
    }

    fun ejecutar(v: View)
    {
        val json = JSONObject()
        json.put("operation", operacion)
        json.put("num1", num1)
        json.put("num2", num2)
        //val body = "{\"operation\":\"" + operacion + " sum\", \"num1\":" + num1 + ", \"num2\":" + num2 + "}"
        val url = "http://parcial.getsandbox.com/operation"


        Fuel.post("", listOf("operation" to operacion, "num1" to num1, "num2" to num2)).responseJson{
            request, response, result -> pantalla.text = result.get().obj().getString("result")
        }

    }
}
