package com.dexin.gsontest3.bean

/**
 * @author Ting
 * @date 2018/4/22
 */

data class ResultBean(
		val error: Boolean,
		val results: List<MeiZiBean>
)

data class MeiZiBean(
		val _id: String,
		val createdAt: String,
		val desc: String,
		val publishedAt: String,
		val source: String,
		val type: String,
		val url: String,
		val used: Boolean,
		val who: String
)