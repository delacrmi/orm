package com.delacrmi.simorm.annotation

/**
 * Created by delacrmi on 26/8/2016.
 */

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Column(
        val columnName: String = "",
        val primaryKey: Boolean = false,
        val autoIncrement: Boolean = false,
        val notNull: Boolean = false,
        val format: String = "yyyy-MM-dd'T'HH:mm:ss.SSSZ",
        val length: Int = 0
)