package com.delacrmi.simorm

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.*
import kotlin.reflect.KClass

/**
 * Created by delacrmi on 26/8/2016.
 */

class EntityManager(val _context: Context,val _name: String, val _version: Int){

    private var connection: SQLiteConnection? = null

    //Constructors
    constructor(_context: Context, _name: String, _version: Int, _factory: SQLiteDatabase.CursorFactory):
    this(_context,_name,_version){ }

    init {

    }

    //List of the entity added to use in this manager
    private val _tables: MutableList<Entity> = ArrayList()

    val tables: List<Entity> get() = _tables.toList()
    fun <E: Entity> add(entity: E){
        _tables.add(entity)
    }

    //Start the EntityManager Configuration
    fun init(): Unit{

    }

    private class SQLiteConnection(context: Context, factory: SQLiteDatabase.CursorFactory, name: String, version: Int):
            SQLiteOpenHelper(context,name,factory,version){
        internal val _tablesSQL: MutableList<String>? = ArrayList<String>()

        override fun onCreate(db: SQLiteDatabase?) {
            throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

}

