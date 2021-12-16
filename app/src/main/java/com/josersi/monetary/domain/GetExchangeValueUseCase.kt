package com.josersi.monetary.domain

import com.josersi.monetary.core.UseCase
import com.josersi.monetary.data.model.ExchangeResponseValue
import com.josersi.monetary.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}