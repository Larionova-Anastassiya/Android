package com.example.assignment1

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "user_name") val userName: String?,
    @ColumnInfo(name = "password_name") val passwordName: String?,
    @ColumnInfo(name = "roll_no") val rollNo: Int?
)
