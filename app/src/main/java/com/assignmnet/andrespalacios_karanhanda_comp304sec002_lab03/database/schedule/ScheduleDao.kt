package com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03.database.schedule

import kotlinx.coroutines.flow.Flow
import androidx.room.Dao
import androidx.room.Query

@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll(): Flow<List<Schedule>>

    @Query("SELECT * FROM schedule WHERE airline_name = :name ORDER BY arrival_time ASC")
    fun getByAirlineName(name: String): Flow<List<Schedule>>

}