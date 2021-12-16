package com.josersi.monetary.domain

import com.josersi.monetary.core.UseCase
import com.josersi.monetary.data.model.ExchangeResponseValue
import com.josersi.monetary.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}