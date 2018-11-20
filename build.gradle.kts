val vertxVersion = "3.5.4"

plugins {
  application
}


repositories {
  mavenCentral()
}

application {
  version = "1.0.0"
  applicationName = "koala-csv"
  mainClassName = "io.vertx.core.Launcher"
}

dependencies {
  "io.vertx:vertx".let { v ->
    compile("$v-core:$vertxVersion")
      compileOnly("$v-lang-kotlin:$vertxVersion")
      compileOnly("$v-lang-kotlin-coroutines:$vertxVersion")
      compile("$v-web-api-contract:$vertxVersion")
      compileOnly("$v-health-check:$vertxVersion")
  }
}
