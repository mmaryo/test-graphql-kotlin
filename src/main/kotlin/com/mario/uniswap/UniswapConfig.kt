package com.mario.uniswap

import com.expediagroup.graphql.client.GraphQLKtorClient
import java.net.URL
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Produces

@Dependent
class UniswapConfig {

    val apiUrl = "https://api.thegraph.com/subgraphs/name/uniswap/uniswap-v2"

    @Produces
    fun init(): UniswapClient {
        val graphQLClient =
            GraphQLKtorClient(URL(apiUrl))
        return UniswapClient(graphQLClient);
    }
}