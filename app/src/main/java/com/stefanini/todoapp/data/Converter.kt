package com.stefanini.todoapp.data

import androidx.room.TypeConverter
import com.stefanini.todoapp.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPrioritity(priority: Priority): String{
        return priority.name
    }

    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

}