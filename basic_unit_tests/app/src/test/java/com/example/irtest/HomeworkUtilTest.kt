package com.example.irtest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkUtilTest{

    @Test
    fun `is braces not valid`(){
        val result = HomeworkUtil.checkBraces("((xd)")
        assertThat(result).isFalse()
    }

    @Test
    fun `is braces valid`(){
        val result = HomeworkUtil.checkBraces("((xd))")
        assertThat(result).isTrue()
    }


    @Test
    fun `is 0 or 1`(){
        val n = 1
        val result = HomeworkUtil.fib(n)
        assertThat(result).isEqualTo(n)
    }

    @Test
    fun `test fib`(){
        val n = 5
        val result = HomeworkUtil.fib(n)
        assertThat(result).isEqualTo(3)
    }
}