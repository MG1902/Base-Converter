package com.example.numberbaseconverter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        btnconvert.setOnClickListener{
            try
            {
                converter()
            }catch (e: NumberFormatException)
            {
                e.printStackTrace()
            }
        }
    }
    private fun converter()
    {
        if(rb2.isChecked && rb1010.isChecked) {
            if (edittext1.text.isDigitsOnly()&& isBinary(edittext1.text.toString()))  {
                t2.visibility = View.GONE
                text2.visibility = View.GONE
                text10.visibility = View.VISIBLE
                text16.visibility = View.GONE
                text8.visibility = View.GONE
                t8.visibility = View.GONE
                t10.visibility = View.VISIBLE
                t16.visibility = View.GONE
                var Btodec = Integer.parseInt(edittext1.text.toString(), 2)
                text10.text = Btodec.toString()
            } else {
                if (edittext1.text.contains(".")&&isBinary(edittext1.text.toString())) {
                    t2.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t10.visibility = View.GONE
                    text16.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility = View.GONE
                    text2.visibility = View.GONE
                    text10.visibility=View.VISIBLE
                    t10.visibility=View.VISIBLE
                    var string=ConvertToDec(edittext1.text.toString(), 2)
                    text10.text=string.toString()

                } else {
                    t2.visibility=View.GONE
                    t16.visibility=View.GONE
                    t8.visibility= View.GONE
                    t10.visibility=View.GONE
                    text16.visibility=View.GONE
                    text10.visibility=View.GONE
                    text8.visibility=View.GONE
                    text2.visibility=View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb2.isChecked &&rb1616.isChecked)
        {
            if (edittext1.text.isDigitsOnly()&& isBinary(edittext1.text.toString()))  {
                t2.visibility = View.GONE
                text2.visibility = View.GONE
                text10.visibility = View.GONE
                text16.visibility = View.GONE
                text8.visibility = View.GONE
                t8.visibility = View.GONE
                t10.visibility = View.GONE
                t16.visibility = View.GONE
                text16.visibility=View.VISIBLE
                t16.visibility=View.VISIBLE
                var hex =Integer.parseInt(edittext1.text.toString(), 2)
                var Btohexa = Integer.toHexString(hex)
                text16.text = Btohexa.toString()
            } else {
                if (edittext1.text.contains(".")&&isBinary(edittext1.text.toString())) {
                    t2.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t10.visibility = View.GONE
                    text16.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility = View.GONE
                    text2.visibility = View.GONE
                    var string=ConvertToDec(edittext1.text.toString(), 2)
                    text16.visibility=View.VISIBLE
                    t16.visibility=View.VISIBLE
                    var dec=ConvertFromDec(string.toString(),16)
                    text16.text=dec.toString()


                } else {
                    t2.visibility=View.GONE
                    t16.visibility=View.GONE
                    t8.visibility= View.GONE
                    t10.visibility=View.GONE
                    text16.visibility=View.GONE
                    text10.visibility=View.GONE
                    text8.visibility=View.GONE
                    text2.visibility=View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb2.isChecked&&rb88.isChecked)
        {
            if (edittext1.text.isDigitsOnly()&& isBinary(edittext1.text.toString()))  {
                t2.visibility = View.GONE
                text2.visibility = View.GONE
                text10.visibility = View.GONE
                text16.visibility = View.GONE
                text8.visibility = View.VISIBLE
                t8.visibility = View.VISIBLE
                t10.visibility = View.GONE
                t16.visibility = View.GONE
                var decimal =Integer.parseInt(edittext1.text.toString(), 2)
                var Btooctal = Integer.toOctalString(decimal)
                text8.text = Btooctal.toString()
            } else {
                if (edittext1.text.contains(".")&&isBinary(edittext1.text.toString())) {
                    t2.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t10.visibility = View.GONE
                    text16.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility=View.VISIBLE
                    t8.visibility=View.VISIBLE
                    var string=ConvertToDec(edittext1.text.toString(), 2)
                    var octal=ConvertFromDec(string.toString(),8)
                    text8.text=octal.toString()



                } else {
                    t2.visibility=View.GONE
                    t16.visibility=View.GONE
                    t8.visibility= View.GONE
                    t10.visibility=View.GONE
                    text16.visibility=View.GONE
                    text10.visibility=View.GONE
                    text8.visibility=View.GONE
                    text2.visibility=View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb10.isChecked&&rb22.isChecked) {
            if (edittext1.text.isDigitsOnly()) {
                t10.visibility = View.GONE
                text10.visibility = View.GONE
                text8.visibility = View.GONE
                text16.visibility = View.GONE
                text2.visibility = View.GONE
                t8.visibility = View.GONE
                t16.visibility = View.GONE
                t2.visibility = View.GONE
                t2.visibility=View.VISIBLE
                text2.visibility=View.VISIBLE
                var DtoBin = Integer.toBinaryString(edittext1.text.toString().toInt())
                text2.text = DtoBin.toString()
            }
            else {
                if (edittext1.text.contains(".")&&isOctDec(edittext1.text.toString())) {
                    t10.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t2.visibility = View.GONE
                    text16.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility = View.GONE
                    text10.visibility = View.GONE
                    text2.visibility=View.VISIBLE
                    t2.visibility=View.VISIBLE
                    var bin=ConvertFromDec(edittext1.text.toString(),2)
                    text2.text=bin.toString()
                } else {
                    t10.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t2.visibility = View.GONE
                    text16.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility = View.GONE
                    text10.visibility = View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb10.isChecked&&rb1616.isChecked)
        {
            if (edittext1.text.isDigitsOnly()) {
                t10.visibility = View.GONE
                text10.visibility = View.GONE
                text8.visibility = View.GONE
                text16.visibility = View.GONE
                text2.visibility = View.GONE
                t8.visibility = View.GONE
                t16.visibility = View.GONE
                t2.visibility = View.GONE
                text16.visibility=View.VISIBLE
                t16.visibility=View.VISIBLE
                var Dtohexa = Integer.toHexString(edittext1.text.toString().toInt())
                text16.text = Dtohexa.toString()
            }
            else {
                if (edittext1.text.contains(".")&&isOctDec(edittext1.text.toString())) {
                    t10.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t2.visibility = View.GONE
                    text16.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility = View.GONE
                    text10.visibility = View.GONE
                    text16.visibility=View.VISIBLE
                    t16.visibility=View.VISIBLE
                    var dec=ConvertFromDec(edittext1.text.toString(),16)
                    text16.text=dec.toString()
                } else {
                    t10.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t2.visibility = View.GONE
                    text16.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility = View.GONE
                    text10.visibility = View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb10.isChecked&&rb88.isChecked)
        {
            if (edittext1.text.isDigitsOnly()) {
                t10.visibility = View.GONE
                text10.visibility = View.GONE
                text8.visibility = View.GONE
                text16.visibility = View.GONE
                text2.visibility = View.GONE
                t8.visibility = View.GONE
                t16.visibility = View.GONE
                t2.visibility = View.GONE
                text8.visibility=View.VISIBLE
                t8.visibility=View.VISIBLE
                var Dtooctal = Integer.toOctalString(edittext1.text.toString().toInt())
                text8.text = Dtooctal.toString()

            }
            else {
                if (edittext1.text.contains(".")&&isOctDec(edittext1.text.toString())) {
                    t10.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t2.visibility = View.GONE
                    text16.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility=View.VISIBLE
                    t8.visibility=View.VISIBLE
                    var octal=ConvertFromDec(edittext1.text.toString(),8)
                    text8.text=octal.toString()
                } else {
                    t10.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t2.visibility = View.GONE
                    text16.visibility = View.GONE
                    text2.visibility = View.GONE
                    text8.visibility = View.GONE
                    text10.visibility = View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb16.isChecked&&rb22.isChecked)
        {
            if(edittext1.text.contains("."))
            {
                text2.visibility=View.GONE
                text8.visibility=View.GONE
                text10.visibility=View.GONE
                t8.visibility=View.GONE
                t2.visibility=View.GONE
                t10.visibility=View.GONE
                t16.visibility=View.GONE
                text16.visibility=View.GONE
                text2.visibility=View.VISIBLE
                t2.visibility=View.VISIBLE
                var string=ConvertToDec(edittext1.text.toString(), 16)
                var bin=ConvertFromDec(string.toString(),2)
                text2.text=bin.toString()

            }
            else{
                t16.visibility=View.GONE
                text2.visibility=View.GONE
                text8.visibility=View.GONE
                text10.visibility=View.GONE
                text16.visibility=View.GONE
                t8.visibility=View.GONE
                t2.visibility=View.GONE
                t10.visibility=View.GONE
                text2.visibility=View.VISIBLE
                t2.visibility=View.VISIBLE
                var binary=Integer.parseInt(edittext1.text.toString(), 16)
                var HtoBin=Integer.toBinaryString(binary)
                text2.text=HtoBin.toString()
            }
        }
        else if(rb16.isChecked&& rb1010.isChecked)
        {
            if(edittext1.text.contains("."))
            {
                text2.visibility=View.GONE
                text8.visibility=View.GONE
                text10.visibility=View.GONE
                t8.visibility=View.GONE
                t2.visibility=View.GONE
                t10.visibility=View.GONE
                t16.visibility=View.GONE
                text16.visibility=View.GONE
                text10.visibility=View.GONE
                text10.visibility=View.VISIBLE
                t10.visibility=View.VISIBLE
                var string=ConvertToDec(edittext1.text.toString(), 16)
                text10.text=string.toString()
            }
            else{
                t16.visibility=View.GONE
                text2.visibility=View.GONE
                text8.visibility=View.GONE
                text10.visibility=View.GONE
                text16.visibility=View.GONE
                t8.visibility=View.GONE
                t2.visibility=View.GONE
                t10.visibility=View.GONE
                text10.visibility=View.VISIBLE
                t10.visibility=View.VISIBLE
                var Htodec=Integer.parseInt(edittext1.text.toString(), 16)
                text10.text= Htodec.toString()
            }
        }
        else if(rb16.isChecked&&rb88.isChecked)
        {
            if(edittext1.text.contains("."))
            {
                text2.visibility=View.GONE
                text8.visibility=View.GONE
                text10.visibility=View.GONE
                t8.visibility=View.GONE
                t2.visibility=View.GONE
                t10.visibility=View.GONE
                t16.visibility=View.GONE
                text16.visibility=View.GONE
                text8.visibility=View.VISIBLE
                t8.visibility=View.VISIBLE
                var string=ConvertToDec(edittext1.text.toString(), 16)
                var oct=ConvertFromDec(string.toString(),8)
                text8.text=oct.toString()
            }
            else{
                t16.visibility=View.GONE
                text2.visibility=View.GONE
                text8.visibility=View.GONE
                text10.visibility=View.GONE
                text16.visibility=View.GONE
                t8.visibility=View.GONE
                t2.visibility=View.GONE
                t10.visibility=View.GONE
                text8.visibility=View.VISIBLE
                t8.visibility=View.VISIBLE
                var decimal =Integer.parseInt(edittext1.text.toString(), 16)
                var Htooctal=Integer.toOctalString(decimal)
                text8.text=Htooctal.toString()
            }
        }
        else if(rb8.isChecked&&rb1010.isChecked) {
            if (edittext1.text.isDigitsOnly()) {
                t8.visibility = View.GONE
                text8.visibility = View.GONE
                text16.visibility = View.GONE
                text2.visibility = View.GONE
                text10.visibility = View.GONE
                t2.visibility = View.GONE
                t16.visibility = View.GONE
                t10.visibility = View.GONE
                text10.visibility=View.VISIBLE
                t10.visibility=View.VISIBLE
                var Otodec = Integer.parseInt(edittext1.text.toString(), 8)
                text10.text = Otodec.toString()
            }
            else
            {
                if(edittext1.text.contains(".")&&isOctDec(edittext1.text.toString()))
                {
                    t2.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t10.visibility = View.GONE
                    text16.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility = View.GONE
                    text2.visibility = View.GONE
                    text10.visibility=View.VISIBLE
                    t10.visibility=View.VISIBLE
                    var string=ConvertToDec(edittext1.text.toString(), 8)
                    text10.text=string.toString()
                }
                else
                {
                    t8.visibility=View.GONE
                    t16.visibility=View.GONE
                    t2.visibility= View.GONE
                    t10.visibility=View.GONE
                    text16.visibility=View.GONE
                    text10.visibility=View.GONE
                    text2.visibility=View.GONE
                    text8.visibility=View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
    else if(rb8.isChecked&&rb1616.isChecked)
        {
            if(edittext1.text.isDigitsOnly()) {
                t8.visibility = View.GONE
                text8.visibility = View.GONE
                text16.visibility = View.GONE
                text2.visibility = View.GONE
                text10.visibility = View.GONE
                t2.visibility = View.GONE
                t16.visibility = View.GONE
                t10.visibility = View.GONE
                text16.visibility=View.VISIBLE
                t16.visibility=View.VISIBLE
                var oct =Integer.parseInt(edittext1.text.toString(), 8)
                var Otohexa = Integer.toHexString(oct)
                text16.text = Otohexa.toString()
            }
            else
            {
                if(edittext1.text.contains(".")&&isOctDec(edittext1.text.toString()))
                {
                    t2.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t10.visibility = View.GONE
                    text16.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility = View.GONE
                    text2.visibility = View.GONE
                    text16.visibility=View.VISIBLE
                    t16.visibility=View.VISIBLE
                    var string=ConvertToDec(edittext1.text.toString(), 8)
                    var dec=ConvertFromDec(string.toString(),16)
                    text16.text=dec.toString()

                }
                else
                {
                    t8.visibility=View.GONE
                    t16.visibility=View.GONE
                    t2.visibility= View.GONE
                    t10.visibility=View.GONE
                    text16.visibility=View.GONE
                    text10.visibility=View.GONE
                    text2.visibility=View.GONE
                    text8.visibility=View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else if(rb8.isChecked&&rb22.isChecked)
        {
            if(edittext1.text.isDigitsOnly()) {
                t8.visibility = View.GONE
                text8.visibility = View.GONE
                text16.visibility = View.GONE
                text2.visibility = View.GONE
                text10.visibility = View.GONE
                t2.visibility = View.GONE
                t16.visibility = View.GONE
                t10.visibility = View.GONE
                text2.visibility=View.VISIBLE
                t2.visibility=View.VISIBLE
                var decimal =Integer.parseInt(edittext1.text.toString(), 8)
                var OtoBin = Integer.toBinaryString(decimal)
                text2.text = OtoBin.toString()
            }
            else
            {
                if(edittext1.text.contains(".")&&isOctDec(edittext1.text.toString()))
                {
                    t2.visibility = View.GONE
                    t16.visibility = View.GONE
                    t8.visibility = View.GONE
                    t10.visibility = View.GONE
                    text16.visibility = View.GONE
                    text10.visibility = View.GONE
                    text8.visibility = View.GONE
                    text2.visibility = View.GONE
                    text2.visibility=View.VISIBLE
                    t2.visibility=View.VISIBLE
                    var string=ConvertToDec(edittext1.text.toString(), 8)
                    var bin=ConvertFromDec(string.toString(),2)
                    text2.text=bin.toString()
                }
                else
                {
                    t8.visibility=View.GONE
                    t16.visibility=View.GONE
                    t2.visibility= View.GONE
                    t10.visibility=View.GONE
                    text16.visibility=View.GONE
                    text10.visibility=View.GONE
                    text2.visibility=View.GONE
                    text8.visibility=View.GONE
                    Toast.makeText(this, "Enter A valid Value", Toast.LENGTH_SHORT).show()

                }
            }
        }
        else{
            t8.visibility=View.GONE
            t16.visibility=View.GONE
            t2.visibility= View.GONE
            t10.visibility=View.GONE
            text16.visibility=View.GONE
            text10.visibility=View.GONE
            text2.visibility=View.GONE
            text8.visibility=View.GONE
            Toast.makeText(this, "Cannot Convert It", Toast.LENGTH_SHORT).show()
        }
    }
    private fun isBinary(num: String):Boolean{
        var flag = 0
        for (i in num){
            if (i == '0' || i == '1' ||i =='.'){
                flag = 0
            }
            else{
                flag = 1
                break;
            }
        }
        return flag == 0
    }
    private fun isOctDec(num: String):Boolean{
        var flag = 0
        for (i in num){
            if (i == '0' || i == '1' ||i =='.'||i=='2'||i=='3'||i=='4'||i=='5'||i=='6'||i=='7'||i=='8'||i=='9'){
                flag = 0
            }
            else{
                flag = 1
                break;
            }
        }
        return flag == 0
    }
    private fun ConvertToDec(num: String, sys: Int): String? {
        var num = num
        var res = 0.0
        num = num.toLowerCase()
        if ("." in num) {
            var arr:Array<String> = num.split("\\.".toRegex()).toTypedArray()
            for (i in 0 until arr[0].length) {
                res += (GetHexNum(arr[0][arr[0].length - i - 1].toString()) * Math.pow(sys.toDouble(), i.toDouble())).toLong()
            }
            for (i in 0 until arr[1].length) {
                res += GetHexNum(arr[1][i].toString()) * Math.pow(sys.toDouble(), (-1 - i).toDouble())
            }
        } else {
            for (i in 0 until num.length) {
                res += (GetHexNum(num[num.length - i - 1].toString()) * Math.pow(sys.toDouble(), i.toDouble())).toLong()
            }
        }
        return res.toString()
    }
    private fun GetHexNum(c: String): Long {
        return try {
            when (c) {
                "a" -> 10
                "b" -> 11
                "c" -> 12
                "d" -> 13
                "e" -> 14
                "f" -> 15
                else -> c.toInt().toLong()
            }
        } catch (ex: Exception) {
            -1
        }
    }
    private fun SetHexNum(c: Int): String? {
        return when (c) {
            10 -> "A"
            11 -> "B"
            12 -> "C"
            13 -> "D"
            14 -> "E"
            15 -> "F"
            else -> c.toString()
        }
    }

    private fun ReverseString(s: String): String? {
        var res = ""
        for (i in 0 until s.length) {
            res += s[s.length - i - 1]
        }
        return res
    }
    private fun ConvertFromDec(num: String, sys: Int): String? {
        var n = num.toDouble()
        var res: String? = ""
        if (num.contains(".")) {
            val arr = num.split("\\.".toRegex()).toTypedArray()
            var m = n.toInt()
            n = n - m
            while (m > 0) {
                res += SetHexNum(m % sys).toString()
                m = (m - m % sys) / sys
            }
            if (res === "") res += "0"
            res = ReverseString(res!!).toString() + "."
            for (i in 0..7) {
                val t = n * sys
                res += SetHexNum(t.toInt()).toString()
                n = t - t.toLong()
                if (n == 0.0) break
            }
        } else {
            while (n > 0) {
                res += SetHexNum(n.toInt() % sys)
                n = (n - n % sys) / sys
            }
            var s = ReverseString(res!!)
            if (s!!.endsWith(".0")) s = s.substring(0, s.length - 2)
            return s
        }
        if (res.endsWith(".0")) res = res.substring(0, res.length - 2)
        return res
    }
}