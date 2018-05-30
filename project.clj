(defproject duct.logger.postal "0.1.0"
  :description "A Timbre appender that sends messages via Postal for Duct framework"
  :url "https://github.com/druids/duct.logger.postal"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :profiles {:dev {:plugins [[lein-cloverage "1.0.10"]
                             [lein-kibit "0.1.6"]
                             [jonase/eastwood "0.2.6"]]

                   :dependencies [[org.clojure/clojure "1.9.0"]
                                  [duct/logger "0.2.1"]
                                  [integrant "0.6.2"]
                                  [com.taoensso/timbre "4.10.0"]]}}
  :aliases {"coverage" ["with-profile" "dev" "cloverage" "--fail-threshold" "95"]})
