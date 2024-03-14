package com.assignmnet.andrespalacios_karanhanda_comp304sec002_lab03.database.schedule

import kotlinx.coroutines.flow.Flow
import androidx.room.Dao
import androidx.room.Query

@Dao
interface ScheduleDao {

    @Query("SELECT * FROM Schedule ORDER BY arrival_time ASC")
    fun getAll(): Flow<List<Schedule>>

    @Query("SELECT * FROM Schedule WHERE airline_name = :airlineName ORDER BY arrival_time ASC")
    fun getByAirlineName(airlineName: String): Flow<List<Schedule>>

}