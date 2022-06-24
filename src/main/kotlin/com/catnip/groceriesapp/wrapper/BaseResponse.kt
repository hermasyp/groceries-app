package com.catnip.groceriesapp.wrapper

data class BaseResponse<D>(
        var success: Boolean,
        var message: String,
        var data: D? = null
)