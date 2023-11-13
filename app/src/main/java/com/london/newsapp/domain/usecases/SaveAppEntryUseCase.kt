package com.london.newsapp.domain.usecases

import com.london.newsapp.domain.manger.LocalUserManger

class SaveAppEntryUseCase(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke() {
        localUserManger.saveAppEntry()
    }

}