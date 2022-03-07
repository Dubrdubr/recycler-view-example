package ru.dubr.recyclerview

import android.app.Application
import ru.dubr.recyclerview.model.UsersService

class App : Application() {

    val usersService = UsersService()
}