package com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03.database.schedule.Schedule
import com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03.database.schedule.ScheduleDao
import kotlinx.coroutines.flow.Flow

class AirLineViewModel(private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForAirlineName(name: String): Flow<List<Schedule>> = scheduleDao.getByAirlineName(name)
}

class AirLineListViewModelFactory(
    private val scheduleDao: ScheduleDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AirLineViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AirLineViewModel(scheduleDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}