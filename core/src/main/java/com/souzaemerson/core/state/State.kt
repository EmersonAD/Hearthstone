package com.souzaemerson.core.state

data class State<out T>(
    val data: T?,
    val loading: Boolean,
    val error: Throwable?,
    val Status: Status
) {
    companion object {
        fun <T> success(data: T) = State(data, false, null, Status.Success)
        fun loading(loading: Boolean) = State(null, loading, null, Status.Loading)
        fun error(error: Throwable) = State(null, false, error, Status.Error)
    }
}