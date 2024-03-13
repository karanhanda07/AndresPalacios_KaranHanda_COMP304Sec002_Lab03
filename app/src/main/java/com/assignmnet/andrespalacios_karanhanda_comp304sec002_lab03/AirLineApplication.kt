package com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03

import android.app.Application
import com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03.database.AppDatabase

class AirLineApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}