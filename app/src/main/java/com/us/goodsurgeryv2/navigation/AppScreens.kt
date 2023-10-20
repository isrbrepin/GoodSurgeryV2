package com.us.goodsurgeryv2.navigation

sealed class AppScreens(val route: String){ // Dentro definimos todas las pantallas de nuestra aplicación
    object SplahScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object SecondScreen: AppScreens("second_screen")

    //Screens pertenecientes al apartado de Cirugía abdominal
    object AbdomenScreen: AppScreens("abdomen_screen")

        //Screens de polipos
        object PoliposScreen: AppScreens("polipos_screen")
        object ColonScreen: AppScreens("colon_screen")
        object InfoColonScreen: AppScreens("info_colon_screen")
        object RectoScreen: AppScreens("recto_screen")
        object InfoRectoScreen: AppScreens("info_recto_screen")

        //Screens de Reconstruccion del transito
        object ReconstruccionScreen: AppScreens("reconstruccion_screen")
        object IleostomiaScreen: AppScreens("ileostomia_screen")
        object InfoIleostomiaScreen: AppScreens("info_ileostomia_screen")
        object ColostomiaScreen: AppScreens("colostomia_screen")
        object InfoColostomiaScreen: AppScreens("info_colostomia_screen")

        //Screen de Enfermedad inflamatoria intestinal
        object InflamatoriaScreen: AppScreens("inflamatoria_screen")
        object ReseccionScreen: AppScreens("reseccion_screen")
        object InfoReseccionScreen: AppScreens("info_reseccion_screen")
        object EstomaScreen: AppScreens("prolapso_screen")
        object InfoEstomaScreen: AppScreens("info_prolapso_screen")

    //Screens pertenecientes al apartado Proctología
    object ProctologiaScreen: AppScreens("proctologia_screen")
        object HemorroidesScreen: AppScreens("hemorroides_screen")
        object InfoHemorroidesScreen: AppScreens("info_hemorroides_screen")
        object FisuraScreen: AppScreens("fisura_screen")
        object InfoFisuraScreen: AppScreens("fisura_screen")
        object FistulaScreen: AppScreens("fistula_screen")
        object InfoFistulaScreen: AppScreens("info_fistula_screen")

    //Screens pertenecientes al apartado Suelo pelvico
    object SueloScreen: AppScreens("suelo_screen")
        object IncontinenciaScreen: AppScreens("incontinencia_screen")
        object InfoIncontinenciaScreen: AppScreens("info_incontinencia_screen")
        object RectoceleScreen: AppScreens("rectocele_screen")
        object InfoRectoceleScreen: AppScreens("info_rectocele_screen")
        object ProlapsoScreen: AppScreens("prolapso_screen")
        object InfoProlapsoScreen: AppScreens("info_prolapso_screen")
}
