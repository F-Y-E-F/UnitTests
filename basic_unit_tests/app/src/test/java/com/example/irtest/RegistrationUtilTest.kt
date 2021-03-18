package com.example.irtest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput("", "123", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password`() {
        val result =
            RegistrationUtil.validateRegistrationInput("Phillip", "123", "123")
        assertThat(result).isTrue()
    }

    @Test
    fun `username exist username already exists`() {
        val result =
            RegistrationUtil.validateRegistrationInput("Peter", "123", "123")
        assertThat(result).isFalse()
    }


    @Test
    fun `empty password`() {
        val result = RegistrationUtil.validateRegistrationInput("Jan", "", "")
        assertThat(result).isFalse()
    }


    @Test
    fun `password repeated incorrectly`() {
        val result = RegistrationUtil.validateRegistrationInput("Jan", "Jan1234", "Jan123")
        assertThat(result).isFalse()
    }

    @Test
    fun `password less than 2 digits`() {
        val result = RegistrationUtil.validateRegistrationInput("Jan", "1", "1")
        assertThat(result).isFalse()
    }
}