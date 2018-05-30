(ns duct.logger.postal
  (:require
    [duct.logger :as logger]
    [integrant.core :as ig]
    [taoensso.timbre.appenders.postal :refer [postal-appender]]))


(defmethod ig/init-key ::timbre
  [_ options]
  (-> options
      (merge (select-keys options [:min-level]))
      postal-appender))
