package com.example.infocovid_19novenia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.infocovid_19novenia.api.RetrofitClient
import com.example.infocovid_19novenia.model.IndonesiaResponse
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    private val response: Any

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showIndonesia()
    }

    private fun showIndonesia(){
        RetrofitClient.instence.getIndonesia().enqueue(object :
            Callback<ArrayList<IndonesiaResponse>> {
            private val response: Unit

            override fun onFailure(Call: Call<ArrayList<IndonesiaResponse>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
            override fun onResoponse{
                Call: Call<ArrayList<IndonesiaRespone>>,
                response: Response<ArryList<IndonesiaResponse>>)
            }
        }
        ) {
            val indonesia: = response.body().get(0)
            val positive : String? = indonesia?.positif
            val hospitilized : String? = indonesia?.dirawat
            val recover : String? = indonesia?.sembuh
            val death : String? = indonesia?.meninggal

            tvPositive.text = positive
            tvHospitalized.text = hospitilized
            tvRecover.text = recover
            tvDeath.text = death

        }
    }
}

private fun Any.get(i: Int): Any {

}

private fun Any.body(): Any {

}

private fun <T> Call<T>.enqueue(any: Any, function: () -> Unit) {

}
