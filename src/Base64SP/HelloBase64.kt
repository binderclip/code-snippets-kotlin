package Base64SP

import java.nio.charset.Charset
import java.util.*

fun main(args: Array<String>) {
    val base64encodedString = Base64.getEncoder().encodeToString("TutorialsPoint?java8".toByteArray(charset = Charset.forName("utf-8")))
    println("Base64 Encoded String (Basic): $base64encodedString")
    val base64decodeBytes = Base64.getDecoder().decode(base64encodedString)
    println("Original String: " + String(base64decodeBytes, charset = Charset.forName("utf-8")))
}

// ref: https://www.tutorialspoint.com/java8/java8_base64.htm
