package com.nikede.feature_coin_impl.domain.model

import com.nikede.feature_coin_impl.data.remote.dto.TeamMember

/**
 * CoinDetail model
 */
internal data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)