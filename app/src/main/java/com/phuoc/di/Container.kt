package com.phuoc.di

object Container {
    fun provideDriver() = Driver()
    fun provideEngine() = Engine()
}