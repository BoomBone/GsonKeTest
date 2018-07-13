package com.dexin.gsontest3.ext

import com.google.gson.Gson

/**
 * @author Ting
 * @date 2018/7/13
 */
inline fun <reified T> Gson.fromJson(json: String) = fromJson(json, T::class.java)