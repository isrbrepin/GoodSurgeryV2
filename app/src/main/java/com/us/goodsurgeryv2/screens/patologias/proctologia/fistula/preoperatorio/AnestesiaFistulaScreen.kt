package com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.preoperatorio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.us.goodsurgeryv2.ui.theme.Typography
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun AnestesiaFistulaScreen(){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Fistula anal")
        CustomTopAppBarSubapartados(title = "Anestesia", style = Typography.titleLarge)
        AnestesiaFistulaBodyContent()
    }
}

@Composable
fun AnestesiaFistulaBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {

    }
}

@Preview
@Composable
fun AnestesiaFistulaScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    AnestesiaFistulaScreen()
}