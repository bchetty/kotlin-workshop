package com.bchetty.koans

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class NullableTypesTest {
    val mailer = object: Mailer {
        override fun sendMessage(email: String, message: String) {
            println("Sent Message: $message to Email: $email")
        }
    }
    val client = Client(PersonalInfo("bchetty@koans.com"))
    val message = "Hello Kotlin World!"

    @Test
    fun testCase1() {
        assertDoesNotThrow {
            sendMessageToClient(null,message, mailer)
        }
    }

    @Test
    fun testCase2() {
        assertDoesNotThrow {
            sendMessageToClient(client,null, mailer)
        }
    }

    @Test
    fun testCase3() {
        assertDoesNotThrow {
            sendMessageToClient(null,null, mailer)
        }
    }

    @Test
    fun testCase4() {
        assertDoesNotThrow {
            sendMessageToClient(client,message, mailer)
        }
    }
}