package com.example.sunnyweather.logic.model

import com.example.sunnyweather.R

class Sky (val info:String, val icon:Int, val bg:Int)

private val sky = mapOf(
    "CLEAR_DAY" to Sky("晴", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "CLEAR_NIGHT" to Sky("晴", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "PARTLY_CLOUDY_DAY" to Sky("多云", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "PARTLY_CLOUDY_NIGHT" to Sky("多云", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "CLOUDY" to Sky("阴", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "WIND" to Sky("大风", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "LIGHT_RAIN" to Sky("小雨", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "MODERATE_RAIN" to Sky("中雨", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "HEAVY_RAIN" to Sky("大雨", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "STORM_RAIN" to Sky("暴雨", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "THUNDER_SHOWER" to Sky("雷阵雨", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "SLEET" to Sky("雨夹雪", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "LIGHT_SNOW" to Sky("小雪", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "MODERATE_SNOW" to Sky("中雪", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "HEAVY_SNOW" to Sky("大雪", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "STORM_SNOW" to Sky("暴雪", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "HAIL" to Sky("冰雹", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "LIGHT_HAZE" to Sky("轻度雾霾", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "MODERATE_HAZE" to Sky("中度雾霾", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "HEAVY_HAZE" to Sky("重度雾霾", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "FOG" to Sky("雾", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground),
    "DUST" to Sky("浮尘", R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground)
)

fun getSky(skycon:String):Sky{
    return sky[skycon]?:sky["CLEAR_DAY"]!!
}