# Quickstart

## Requirements ##
Intellij IDEA: <https://www.jetbrains.com/idea/>

## Installation ##
IP2Location.io Scala: <https://central.sonatype.com/artifact/com.ip2location/ip2location-io-scala_3>

## Sample Codes

### Lookup IP Address Geolocation Data
```scala
import com.ip2location.{Configuration, IPGeolocation}

@main def hello(): Unit =
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
```

### Lookup Domain Information
```scala
import com.ip2location.{Configuration, DomainWhois}

@main def hello(): Unit =
  // Configures IP2Location.io API key
  val strApiKey = "YOUR_API_KEY"
  val config = new Configuration()
  config.setApiKey(strApiKey)

  // Lookup domain information
  val strDomain = "locaproxy.com"
  val whois = new DomainWhois(config)
  val myResult = whois.lookUp(strDomain)
  println(myResult)
```

### Convert Normal Text to Punycode
```scala
import com.ip2location.{Configuration, DomainWhois}

@main def hello(): Unit =
  val config = new Configuration()
  val whois = new DomainWhois(config)

  // Convert normal text to punycode
  println(whois.toPunycode("täst.de"))
```

### Convert Punycode to Normal Text
```scala
import com.ip2location.{Configuration, DomainWhois}

@main def hello(): Unit =
  val config = new Configuration()
  val whois = new DomainWhois(config)

  // Convert punycode to normal text
  println(whois.toNormalText("xn--tst-qla.de"))
```

### Get Domain Name
```scala
import com.ip2location.{Configuration, DomainWhois}

@main def hello(): Unit =
  val config = new Configuration()
  val whois = new DomainWhois(config)

  // Get domain name from URL
  println(whois.toDomainName("https://www.example.com/exe"))
```

### Get Domain Extension
```scala
import com.ip2location.{Configuration, DomainWhois}

@main def hello(): Unit =
  val config = new Configuration()
  val whois = new DomainWhois(config)

  // Get domain extension (gTLD or ccTLD) from URL or domain name
  println(whois.toDomainExtension("example.com"))
```

### Lookup IP Address Hosted Domains Data
```scala
import com.ip2location.{Configuration, HostedDomain}

@main def hello(): Unit =
  // Configures IP2Location.io API key
  val strApiKey = "YOUR_API_KEY"
  val config = new Configuration()
  config.setApiKey(strApiKey)

  // Lookup ip address hosted domains data
  val strIPAddress = "8.8.8.8"
  val page = 1
  val hd = new HostedDomain(config)
  val myResult = hd.lookUp(strIPAddress, page)
  println(myResult)
```