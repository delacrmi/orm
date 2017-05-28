package com.delacrmi.simorm

import java.io.Serializable

/**
 * Created by delacrmi on 26/8/2016.
 */


abstract class Entity : Serializable{

    fun <T: Entity> find(): T{
        return this as T
    }
}