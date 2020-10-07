#API FUN
## About
this is a tiny little service that makes calls out to two very simple apis: 

*  a random affirmation api that returns pick me up messages </li>
*  a random dog picture generator that will return a random dog picture</li>

the idea is that if you're feeling a little down you can hit `/happiness` and you get a message of encouragement and a picture of usually a cute or funny dog.

## Testing:
* As this is currently a simple application we can use spring mvc tests as an integration tests
* We're currently missing some canned responses to be served by something like wiremock in order to be able to validate against the clients. 

## how to build & run
   this application uses spring-boot 2.3 to run
   and is built using maven, there's a packaged maven wrapper included which is set to use version 3.6.2
   * to install `./mvnw clean install`
   * to run the api `./mvnw spring-boot:run`
   * the default port is 8080 however this can be overridden by adding:
   ```-Dspring-boot.run.jvmArguments='-Dserver.port=<your-port-number>'``` to the end of the command line.

## Technologies
 * Immutable.io -> a library that helps with immutable object generation, eqauls and hashcode overrides.
 * Jackson -> quick and easy object serialization and deserialization.