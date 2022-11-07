package com.bchetty.koans

fun main(args: Array<String>) {
    val mailer = object: Mailer {
        override fun sendMessage(email: String, message: String) {
            println("Sent Message: $message to Email: $email")
        }
    }
    val client = Client(PersonalInfo("bchetty@koans.com"))
    val message = "Hello Kotlin World!"

    //Test all Null-cases
    sendMessageToClient(null,message, mailer)
    sendMessageToClient(client,null, mailer)
    sendMessageToClient(null,null, mailer)
    sendMessageToClient(client,message, mailer)
}

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email == null || message == null) {
        println("Mail not sent!")
        return
    }
    mailer.sendMessage(email, message);
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
