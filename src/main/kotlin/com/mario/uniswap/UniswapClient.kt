package com.mario.uniswap

import com.expediagroup.graphql.client.GraphQLKtorClient
import com.expediagroup.graphql.types.GraphQLResponse
import io.ktor.client.engine.cio.*

class UniswapClient(
    private val graphQLClient: GraphQLKtorClient<CIOEngineConfig>
) {

    suspend fun pairsTop100(): GraphQLResponse<UniswapPairTop100Query.Result> {
        val query = UniswapPairTop100Query(graphQLClient)
        return query.execute()
    }

}