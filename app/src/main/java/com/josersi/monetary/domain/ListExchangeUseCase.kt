package com.josersi.monetary.domain

import com.josersi.monetary.core.UseCase
import com.josersi.monetary.data.model.ExchangeResponseValue
import com.josersi.monetary.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}