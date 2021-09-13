package com.example.connectorlibrary.enitity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FailureResponse(
    @RequestCode val requestCode: Int,
    @ResponseCode val responseCode: Int
) : Parcelable