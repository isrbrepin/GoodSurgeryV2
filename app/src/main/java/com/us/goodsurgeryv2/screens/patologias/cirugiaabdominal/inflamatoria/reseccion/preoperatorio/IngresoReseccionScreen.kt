package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.preoperatorio

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
fun IngresoReseccionScreen(){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Resección intestinal")
        CustomTopAppBarSubapartados(title = "El día del ingreso", style = Typography.titleLarge)
        IngresoReseccionBodyContent()
    }
}

@Composable
fun IngresoReseccionBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {

    }
}