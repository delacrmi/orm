package com.delacrmi.simorm

import java.lang.reflect.Field

/**
 * Created by delacrmi on 26/8/2016.
 */

internal class ColumnClass(
        internal val columnName: String = "",
        internal val length: Int = 0,
        internal val field: Field? = null,
        internal val empty: Boolean = false,
        internal val relationshipType: String? = null,
        internal val relationshipColumns: Array<String>? = null,
        internal val writable: Boolean = true,
        internal val notNull: Boolean = false,
        internal val primaryKey: Boolean = false,
        internal val autoIncrement: Boolean = false,
        internal val dateFormat: String? = null,
        internal val isEntity: Boolean? = false
)