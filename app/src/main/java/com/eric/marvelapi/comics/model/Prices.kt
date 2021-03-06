package com.eric.marvelapi.comics.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity (tableName = "prices")
data class Prices (

	@field:SerializedName("type") val type : String,
	@field:SerializedName("price") val price : Double
)
