(defproject clojure-ring-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://github.com/carolove/clojure-ring-app"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/java.jdbc "0.7.1"]
                 [mysql/mysql-connector-java "5.1.35"]
                 [korma "0.4.3"]
                 [selmer "1.11.0"]
                 [ring "1.6.2"]
                 [ring/ring-json "0.4.0"]
                 [compojure "1.6.0"]]
  :main  clojure-ring-app.web
  :aot [clojure-ring-app.web]
  :plugins [[lein-ring "0.12.1"]]
  :target-path "target/%s"
  :ring {:handler clojure-ring-app.web/app
         :auto-reload? true
         :auto-refresh? true})
