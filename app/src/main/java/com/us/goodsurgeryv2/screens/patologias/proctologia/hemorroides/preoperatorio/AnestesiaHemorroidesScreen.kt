package com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio

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
fun AnestesiaHemorroidesScreen(){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Hemorroides")
        CustomTopAppBarSubapartados(title = "Anestesia", style = Typography.titleLarge)
        AnestesiaHemorroidesBodyContent()
    }
}

@Composable
fun AnestesiaHemorroidesBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {

    }
}

@Preview
@Composable
fun AnestesiaHemorroidesScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    AnestesiaHemorroidesScreen()
}