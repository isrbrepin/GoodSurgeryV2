package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.preoperatorio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview
import com.us.goodsurgeryv2.ui.theme.Typography
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun PrepEstomaScreen(){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Creación de estoma")
        CustomTopAppBarSubapartados(title = "¿Cómo me debo preparar?", style = Typography.titleLarge)
        PrepEstomaBodyContent()
    }
}

@Composable
fun PrepEstomaBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {

    }
}

@Preview
@Composable
fun PrepEstomaScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    PrepEstomaScreen()
}