package com.ip2location

import munit.FunSuite

class IPGeolocationTest extends FunSuite {

  test("TestUS") {
    // Configures IP2Location.io API key
    val strApiKey = "YOUR_API_KEY"

    val config = new Configuration()
    config.setApiKey(strApiKey)

    // Lookup ip address geolocation data
    val strIPAddress = "8.8.8.8"
    val lang = "es"
    val ipl = new IPGeolocation(config)
    val myResult = ipl.lookUp(strIPAddress, lang) // lang param only supported in Plus and Security plans, so omit if not necessary
    println(myResult)
  }
}