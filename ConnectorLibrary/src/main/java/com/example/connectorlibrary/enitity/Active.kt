package com.example.connectorlibrary.enitity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "active")
@Parcelize
data class Active(
    @PrimaryKey(autoGenerate = true)
    val active_id: Int = 0,
    val active_name: String = ""
) : Parcelable