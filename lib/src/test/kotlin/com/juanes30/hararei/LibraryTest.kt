/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.juanes30.hararei

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import kotlin.test.expect

class LibraryTest {
    @Test
    fun test_there_data() {
        val classUnderTest = Library()
        assertTrue(
            classUnderTest.getColombiaHolidaysByYear("2021").count() > 0,
            "someLibraryMethod should return 'true'"
        )
    }

    @Test
    fun test_exception_year_is_not_number() {
        val classUnderTest = Library()
        assertFailsWith<IllegalArgumentException>(message = "The year is not a number", block = {
            classUnderTest.getColombiaHolidaysByYear("abcd")
        })
    }

    @Test
    fun test_exception_year_is_empty() {
        val classUnderTest = Library()
        assertFailsWith<IllegalArgumentException>(message = "No year provided", block = {
            classUnderTest.getColombiaHolidaysByYear()
        })
    }

    @Test
    fun test_success_year_2021() {
        val classUnderTest = Library()
        val results = classUnderTest.getColombiaHolidaysByYear("2021")

        assert(results.count() > 0)
        results.forEachIndexed { idx, item ->
            expect(TestData.holiday2021TestData[idx], block = {
                item.holiday
            })
        }
    }

    @Test
    fun test_success_year_2022() {
        val classUnderTest = Library()
        val results = classUnderTest.getColombiaHolidaysByYear("2022")

        assert(results.count() > 0)
        results.forEachIndexed { idx, item ->
            expect(TestData.holiday2022TestData[idx], block = {
                item.holiday
            })
        }
    }
}