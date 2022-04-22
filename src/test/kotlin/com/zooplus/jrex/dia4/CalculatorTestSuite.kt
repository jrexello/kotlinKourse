package com.zooplus.jrex.dia4

import org.junit.platform.suite.api.ExcludeTags
import org.junit.platform.suite.api.IncludePackages
import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.SelectPackages
import org.junit.platform.suite.api.Suite
import kotlin.test.Test

@Suite
//@SelectClasses() Add JUnit tests
@SelectPackages("com.zooplus.jrex.dia4")
//@IncludePackages
//@ExcludeTags
//...
class CalculatorTestSuite {
}
