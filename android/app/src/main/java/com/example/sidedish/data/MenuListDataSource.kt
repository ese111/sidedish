package com.example.sidedish.data

import com.example.sidedish.network.ApiClient
import retrofit2.Response

class MenuListDataSource(private val api: ApiClient): DataSource {

    override suspend fun getMainFoodList() = api.getMainFoodList()

    override suspend fun getSoupFoodList() = api.getSoupFoodList()

    override suspend fun getSideFoodList() = api.getSideFoodList()

    override suspend fun getFoodDetail(hashId: String) = api.getProductDetail(hashId)
}