package com.bluemoonl.ch22freeimagedownload.data

import com.bluemoonl.ch22freeimagedownload.BuildConfig
import com.bluemoonl.ch22freeimagedownload.data.models.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApiService {
    @GET(
        "photos/random?" +
                "client_id=${BuildConfig.UNSPLASH_ACCESS_KEY}" +
                "&count=30"
    )

    suspend fun getRandomPhotoes(
        @Query("query") query: String?
    ): Response<List<PhotoResponse>>
}