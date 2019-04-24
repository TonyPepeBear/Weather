package com.tonypepe.weather
import com.google.gson.annotations.SerializedName


data class RealtimeWeatherData(
    @SerializedName("cwbopendata")
    val cwbopendata: Cwbopendata
)

data class Cwbopendata(
    @SerializedName("@xmlns")
    val xmlns: String,
    @SerializedName("dataid")
    val dataid: String,
    @SerializedName("dataset")
    val dataset: Any,
    @SerializedName("identifier")
    val identifier: String,
    @SerializedName("location")
    val location: List<Location>,
    @SerializedName("msgType")
    val msgType: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("sender")
    val sender: String,
    @SerializedName("sent")
    val sent: String,
    @SerializedName("status")
    val status: String
)

data class Location(
    @SerializedName("lat")
    val lat: String,
    @SerializedName("lat_wgs84")
    val latWgs84: String,
    @SerializedName("locationName")
    val locationName: String,
    @SerializedName("lon")
    val lon: String,
    @SerializedName("lon_wgs84")
    val lonWgs84: String,
    @SerializedName("parameter")
    val parameter: List<Parameter>,
    @SerializedName("stationId")
    val stationId: String,
    @SerializedName("time")
    val time: Time,
    @SerializedName("weatherElement")
    val weatherElement: List<WeatherElement>
)

data class Time(
    @SerializedName("obsTime")
    val obsTime: String
)

data class Parameter(
    @SerializedName("parameterName")
    val parameterName: String,
    @SerializedName("parameterValue")
    val parameterValue: String
)

data class WeatherElement(
    @SerializedName("elementName")
    val elementName: String,
    @SerializedName("elementValue")
    val elementValue: ElementValue
)

data class ElementValue(
    @SerializedName("value")
    val value: String
)