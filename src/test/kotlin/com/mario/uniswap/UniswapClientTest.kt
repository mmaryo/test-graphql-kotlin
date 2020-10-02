package com.mario.uniswap

import io.quarkus.test.junit.QuarkusTest
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
class UniswapClientTest {

    @Inject
    lateinit var uniswapClient: UniswapClient

    @Test
    fun test() {
        runBlocking {
            val pairsTop100 = uniswapClient.pairsTop100()
            println(pairsTop100)
        }
    }
}