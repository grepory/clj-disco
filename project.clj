(defproject clj-disco "0.0.1"
  :description "A client library for registrator-backed service discovery"
  :url "https://github.com/opsee/clj-disco"
  :license "MIT"
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}}
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories [["snapshots" {:url "s3p://opsee-maven-snapshots/snapshot"
                               :username :env
                               :passphrase :env
                               :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [verschlimmbesserung "0.1.2"]
                 [org.clojure/tools.logging "0.3.1"]])