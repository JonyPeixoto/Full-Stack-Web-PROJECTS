package br.com.cybertimeup.appcommerce.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity(tableName = "users")
data class User (
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    var email: String,
    var name: String,
    var surname: String,
    var password: String,
    var image: String) : Serializable

