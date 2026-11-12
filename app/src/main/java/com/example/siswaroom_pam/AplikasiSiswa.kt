package com.example.siswaroom_pam

import android.app.Application
import com.example.siswaroom_pam.repositori.ContainerApp
import com.example.siswaroom_pam.repositori.ContainerDataApp

class AplikasiSiswa : Application(){
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}