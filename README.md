duct.logger.postal
==================

A [Timbre](https://github.com/ptaoussanis/timbre) appender that sends messages via
 [Postal](https://github.com/drewr/postal) for [Duct framework](https://github.com/duct-framework/duct).

This library **DOES NOT** include Timbre nor Postal. A host project has to include itself.

[![Dependencies Status](https://jarkeeper.com/druids/duct.logger.postal/status.png)](https://jarkeeper.com/druids/duct.logger.postal)
[![License](https://img.shields.io/badge/MIT-Clause-blue.svg)](https://opensource.org/licenses/MIT)


Leiningen/Boot
--------------

```clojure
[duct.logger.postal "0.1.0"]
```

Documentation
-------------

Add following code into you Duct configuration:

```clojure
{:duct.logger.postal/timbre
 ^{:user "user" ;; <-- Notice using ^ for meta!
   :pass "secret"
   :tls "true"
   :host "email-smtp.eu-west-1.amazonaws.com"} ;; <-- A configuration for AWS STMP, it consumes any Postal configuration
 {:from "no_reply@foo.com"
  :to "log@foo.com"}}

 :duct.logger/timbre
 {:appenders {:duct.logger.postal/timbre #ig/ref :duct.logger.postal/timbre}}} ;; <-- Register appender
```

And that's all! You will receive any log record with severity at least `:warn`.
