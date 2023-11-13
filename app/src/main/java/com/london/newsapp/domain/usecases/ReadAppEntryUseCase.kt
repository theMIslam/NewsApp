package com.london.newsapp.domain.usecases

import com.london.newsapp.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow

class ReadAppEntryUseCase(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }

}