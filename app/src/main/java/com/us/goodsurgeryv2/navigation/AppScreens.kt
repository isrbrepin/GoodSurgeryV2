package com.us.goodsurgeryv2.navigation

sealed class AppScreens(val route: String){ // Dentro definimos todas las pantallas de nuestra aplicación
    object SplahScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object SecondScreen: AppScreens("second_screen")

    //Screens pertenecientes al apartado de Cirugía abdominal
    object AbdomenScreen: AppScreens("abdomen_screen")

        //Screens de polipos
        object PoliposScreen: AppScreens("polipos_screen")

        //Polipo colon
        object ColonScreen: AppScreens("colon_screen")
        object InfoColonScreen: AppScreens("info_colon_screen")
        object PreoColonScreen: AppScreens("preo_colon_screen")
        object AnestesiaColonScreen: AppScreens("anestesia_colon_screen")
        object HospitalColonScreen: AppScreens("hospital_colon_screen")
        object IngresoColonScreen: AppScreens("ingreso_colon_screen")
        object PrepColonScreen: AppScreens("prep_colon_screen")
        object PostColonScreen: AppScreens("post_colon_screen")
        object AltaColonScreen: AppScreens("alta_colon_screen")
        object OstomiaColonScreen: AppScreens("ostomia_colon_screen")

        //Polipo recto
        object RectoScreen: AppScreens("recto_screen")
        object InfoRectoScreen: AppScreens("info_recto_screen")
        object PreoRectoScreen: AppScreens("preo_recto_screen")
        object AnestesiaRectoScreen: AppScreens("anestesia_recto_screen")
        object HospitalRectoScreen: AppScreens("hospital_recto_screen")
        object IngresoRectoScreen: AppScreens("ingreso_recto_screen")
        object PrepRectoScreen: AppScreens("prep_recto_screen")
        object PostRectoScreen: AppScreens("post_recto_screen")
        object AltaRectoScreen: AppScreens("alta_recto_screen")
        object OstomiaRectoScreen: AppScreens("ostomia_recto_screen")

        //Screens de Reconstruccion del transito
        object ReconstruccionScreen: AppScreens("reconstruccion_screen")

        //Ileostomia
        object IleostomiaScreen: AppScreens("ileostomia_screen")
        object InfoIleostomiaScreen: AppScreens("info_ileostomia_screen")
        object PreoIleostomiaScreen: AppScreens("preo_ileostomia_screen")
        object AnestesiaIleostomiaScreen: AppScreens("anestesia_ileostomia_screen")
        object HospitalIleostomiaScreen: AppScreens("hospital_ileostomia_screen")
        object IngresoIleostomiaScreen: AppScreens("ingreso_ileostomia_screen")
        object PrepIleostomiaScreen: AppScreens("prep_ileostomia_screen")
        object PostIleostomiaScreen: AppScreens("post_ileostomia_screen")
        object AltaIleostomiaScreen: AppScreens("alta_ileostomia_screen")
        object OstomiaIleostomiaScreen: AppScreens("ostomia_ileostomia_screen")

        //Colostomia
        object ColostomiaScreen: AppScreens("colostomia_screen")
        object InfoColostomiaScreen: AppScreens("info_colostomia_screen")
        object PreoColostomiaScreen: AppScreens("preo_colostomia_screen")
        object AnestesiaColostomiaScreen: AppScreens("anestesia_colostomia_screen")
        object HospitalColostomiaScreen: AppScreens("hospital_colostomia_screen")
        object IngresoColostomiaScreen: AppScreens("ingreso_colostomia_screen")
        object PrepColostomiaScreen: AppScreens("prep_colostomia_screen")
        object PostColostomiaScreen: AppScreens("post_colostomia_screen")
        object AltaColostomiaScreen: AppScreens("alta_colostomia_screen")
        object OstomiaColostomiaScreen: AppScreens("ostomia_colostomia_screen")

        //Screen de Enfermedad inflamatoria intestinal
        object InflamatoriaScreen: AppScreens("inflamatoria_screen")

        // Reseccion
        object ReseccionScreen: AppScreens("reseccion_screen")
        object InfoReseccionScreen: AppScreens("info_reseccion_screen")
        object PreoReseccionScreen: AppScreens("preo_reseccion_screen")
        object AnestesiaReseccionScreen: AppScreens("anestesia_reseccion_screen")
        object HospitalReseccionScreen: AppScreens("hospital_reseccion_screen")
        object IngresoReseccionScreen: AppScreens("ingreso_reseccion_screen")
        object PrepReseccionScreen: AppScreens("prep_reseccion_screen")
        object PostReseccionScreen: AppScreens("post_reseccion_screen")
        object AltaReseccionScreen: AppScreens("alta_reseccion_screen")
        object OstomiaReseccionScreen: AppScreens("ostomia_reseccion_screen")

        // Estoma
        object EstomaScreen: AppScreens("estoma_screen")
        object InfoEstomaScreen: AppScreens("info_estoma_screen")
        object PreoEstomaScreen: AppScreens("preo_estoma_screen")
        object AnestesiaEstomaScreen: AppScreens("anestesia_estoma_screen")
        object PrepEstomaScreen: AppScreens("prep_estoma_screen")
        object IngresoEstomaScreen: AppScreens("ingreso_estoma_screen")
        object HospitalEstomaScreen: AppScreens("hospital_estoma_screen")
        object PostEstomaScreen: AppScreens("post_estoma_screen")
        object AltaEstomaScreen: AppScreens("alta_estoma_screen")
        object OstomiaEstomaScreen: AppScreens("ostomia_estoma_screen")

    //Screens pertenecientes al apartado Proctología
    object ProctologiaScreen: AppScreens("proctologia_screen")

        // Hemorroides
        object HemorroidesScreen: AppScreens("hemorroides_screen")
        object InfoHemorroidesScreen: AppScreens("info_hemorroides_screen")
        object PreoHemorroidesScreen: AppScreens("preo_hemorroides_screen")
        object AnestesiaHemorroidesScreen: AppScreens("anestesia_hemorroides_screen")
        object HospitalHemorroidesScreen: AppScreens("hospital_hemorroides_screen")
        object IngresoHemorroidesScreen: AppScreens("ingreso_hemorroides_screen")
        object PrepHemorroidesScreen: AppScreens("prep_hemorroides_screen")
        object PostHemorroidesScreen: AppScreens("post_hemorroides_screen")
        object AltaHemorroidesScreen: AppScreens("alta_hemorroides_screen")
        object OstomiaHemorroidesScreen: AppScreens("ostomia_hemorroides_screen")

        //Fisura
        object FisuraScreen: AppScreens("fisura_screen")
        object InfoFisuraScreen: AppScreens("info_fisura_screen")
        object PreoFisuraScreen: AppScreens("preo_fisura_screen")
        object AnestesiaFisuraScreen: AppScreens("anestesia_fisura_screen")
        object HospitalFisuraScreen: AppScreens("hospital_fisura_screen")
        object IngresoFisuraScreen: AppScreens("ingreso_fisura_screen")
        object PrepFisuraScreen: AppScreens("prep_fisura_screen")
        object PostFisuraScreen: AppScreens("post_fisura_screen")
        object AltaFisuraScreen: AppScreens("alta_fisura_screen")
        object OstomiaFisuraScreen: AppScreens("ostomia_fisura_screen")

        // Fistula
        object FistulaScreen: AppScreens("fistula_screen")
        object InfoFistulaScreen: AppScreens("info_fistula_screen")
        object PreoFistulaScreen: AppScreens("preo_fistula_screen")
        object AnestesiaFistulaScreen: AppScreens("anestesia_fistula_screen")
        object HospitalFistulaScreen: AppScreens("hospital_fistula_screen")
        object IngresoFistulaScreen: AppScreens("ingreso_fistula_screen")
        object PrepFistulaScreen: AppScreens("prep_fistula_screen")
        object PostFistulaScreen: AppScreens("post_fistula_screen")
        object AltaFistulaScreen: AppScreens("alta_fistula_screen")
        object OstomiaFistulaScreen: AppScreens("ostomia_fistula_screen")

    //Screens pertenecientes al apartado Suelo pelvico
    object SueloScreen: AppScreens("suelo_screen")

        // Incontinencia
        object IncontinenciaScreen: AppScreens("incontinencia_screen")
        object InfoIncontinenciaScreen: AppScreens("info_incontinencia_screen")
        object PreoIncontinenciaScreen: AppScreens("preo_incontinencia_screen")
        object AnestesiaIncontinenciaScreen: AppScreens("anestesia_incontinencia_screen")
        object HospitalIncontinenciaScreen: AppScreens("hospital_incontinencia_screen")
        object IngresoIncontinenciaScreen: AppScreens("ingreso_incontinencia_screen")
        object PrepIncontinenciaScreen: AppScreens("prep_incontinencia_screen")
        object PostIncontinenciaScreen: AppScreens("post_incontinencia_screen")
        object AltaIncontinenciaScreen: AppScreens("alta_incontinencia_screen")
        object OstomiaIncontinenciaScreen: AppScreens("ostomia_incontinencia_screen")

        //Rectocele
        object RectoceleScreen: AppScreens("rectocele_screen")
        object InfoRectoceleScreen: AppScreens("info_rectocele_screen")
        object PreoRectoceleScreen: AppScreens("preo_rectocele_screen")
        object AnestesiaRectoceleScreen: AppScreens("anestesia_rectocele_screen")
        object HospitalRectoceleScreen: AppScreens("hospital_rectocele_screen")
        object IngresoRectoceleScreen: AppScreens("ingreso_rectocele_screen")
        object PrepRectoceleScreen: AppScreens("prep_rectocele_screen")
        object PostRectoceleScreen: AppScreens("post_rectocele_screen")
        object AltaRectoceleScreen: AppScreens("alta_rectocele_screen")
        object OstomiaRectoceleScreen: AppScreens("ostomia_rectocele_screen")

        // Prolapso
        object ProlapsoScreen: AppScreens("prolapso_screen")
        object InfoProlapsoScreen: AppScreens("info_prolapso_screen")
        object PreoProlapsoScreen: AppScreens("preo_prolapso_screen")
        object AnestesiaProlapsoScreen: AppScreens("anestesia_prolapso_screen")
        object HospitalProlapsoScreen: AppScreens("hospital_prolapso_screen")
        object IngresoProlapsoScreen: AppScreens("ingreso_prolapso_screen")
        object PrepProlapsoScreen: AppScreens("prep_prolapso_screen")
        object PostProlapsoScreen: AppScreens("post_prolapso_screen")
        object AltaProlapsoScreen: AppScreens("alta_prolapso_screen")
        object OstomiaProlapsoScreen: AppScreens("ostomia_prolapso_screen")
}
