package com.example.connectorlibrary.base

/**
 * @author Nguyen Ngoc Ha Giang
 * @version 1.0, 10/09/2021
 * @since 1.0
 */

@Suppress("UNUSED")
interface CallbackProvider<T> {

    val callbacks: ArrayList<T>

    fun addCallback(callback: T) {
        callbacks.add(callback)
    }

    fun removeCallback(callback: T) {
        callbacks.remove(callback)
    }
}