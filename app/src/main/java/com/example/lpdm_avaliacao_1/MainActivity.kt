package com.example.lpdm_avaliacao_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.WifiTethering
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lpdm_avaliacao_1.ui.theme.LPDMavaliacao1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LPDMavaliacao1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
                        name = "",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.profissional)
   Box(modifier){
       Image(
           painter = image,
           contentDescription = null,

           )

       Greeting(
           name = name,
           modifier = Modifier
               .fillMaxSize()
               .padding(8.dp)
       )


   }
    }
    @Composable
    fun Greeting(name: String, modifier: Modifier) {

        Box(modifier) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.fillMaxSize()


            ) {
                Text(
                    text = "Olá a todos",
                    fontSize = 90.sp,
                    lineHeight = 116.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "·Rodrigão de Lima Cunha",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(

                    text = "·Professor de Desenvolvimento Mobile",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(

                    text = "Este é o meu professor de LPDM(Laboratório de Programação para Dispositivos Móveis).!\n",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null,
                        tint = Color(0xFF006D3B)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "+55 11 99999-9999")
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        tint = Color(0xFF006D3B)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "rodrigolim@gmail.com")
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.WifiTethering,
                        contentDescription = null,
                        tint = Color(0xFF006D3B)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "@rodrigolima.developer")
                }
            }
        }
    }
