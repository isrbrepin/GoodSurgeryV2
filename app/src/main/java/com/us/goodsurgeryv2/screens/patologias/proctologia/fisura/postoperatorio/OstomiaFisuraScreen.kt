package com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.postoperatorio

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
fun OstomiaFisuraScreen(){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Fisura anal")
        CustomTopAppBarSubapartados(title = "Ostomia", style = Typography.titleLarge)
        OstomiaFisuraBodyContent()
    }
}

@Composable
fun OstomiaFisuraBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {

    }
}
