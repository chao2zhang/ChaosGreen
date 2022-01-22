package io.github.chao2zhang

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}