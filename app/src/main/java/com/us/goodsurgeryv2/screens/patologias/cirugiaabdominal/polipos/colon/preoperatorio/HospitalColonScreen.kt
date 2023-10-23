package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.preoperatorio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import com.us.goodsurgeryv2.ui.theme.Typography
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun HospitalColonScreen(){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Polipo colon")
        CustomTopAppBarSubapartados(title = "En el Hospital", style = Typography.titleLarge)
        HospitalColonBodyContent()
    }
}

@Composable
fun HospitalColonBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {

    }
}
