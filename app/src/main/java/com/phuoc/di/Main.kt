package com.phuoc.di

class Main(args: Array<String>) {

    val car : Car = Car(Container.provideEngine(), Container.provideDriver())
}