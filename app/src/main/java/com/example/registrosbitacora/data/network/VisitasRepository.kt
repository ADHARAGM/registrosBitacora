package com.example.registrosbitacora.data.network

import com.example.registrosbitacora.data.model.DatosVehiculo
import com.example.registrosbitacora.data.model.DatosVisitas
import com.example.registrosbitacora.data.model.Tarjeta
import com.example.registrosbitacora.data.model.responseServices

class VisitasRepository {

    private val api = BitacoraServices()

    suspend fun saveEntradaVisitas(datosVisitas: DatosVisitas) : String {

        val response=api.guardaEntradaVisitas(datosVisitas)

        return response
    }
    suspend fun saveSalidaVisitas(noTarjeta: Tarjeta): String {
        val response=api.guardaSalidaVisitas(noTarjeta)
        return response
    }
}