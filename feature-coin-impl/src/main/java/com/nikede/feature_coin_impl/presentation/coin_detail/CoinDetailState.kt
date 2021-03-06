package com.nikede.feature_coin_impl.presentation.coin_detail

import com.nikede.feature_coin_impl.domain.model.CoinDetail

/**
 * State of CoinDetailScreen
 *
 * @param isLoading is some data loading
 * @param coin CoinDetail to show
 * @param error error of loading
 */
internal data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
