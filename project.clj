(defproject heapsters "0.1.0-SNAPSHOT"
  :description "heapsters"
  :url "http://theheapstergame.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [ring/ring-core "1.1.8"]
                 [ring/ring-jetty-adapter "1.1.8"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [org.clojure/java.jdbc "0.3.0-alpha4"]
                 [compojure "1.1.5"]
                 [ring-mock "0.1.5"]
                 [hiccup "1.0.3"]]
  :plugins [[lein-cljsbuild "1.0.2"] 
            [lein-ring "0.8.5"]
            [com.cemerick/austin "0.1.4"]]
  :source-paths ["src/clj"]
  :ring {:handler heapsters.core/app
         :auto-reload? true
         :adapter {:port 3000}
         :nrepl {:start? true :port 7000}}
  :main heapsters.core
  :profiles {:uberjar {:aot :all}}
  :cljsbuild {
  :builds [{:id "heapster"
          :source-paths ["src/cljs"]
          :compiler {
            :output-to "resources/public/out/heapster.js"
            :output-dir "resources/public/out" 
            :preamble ["reagent/react.js"]
            :optimizations :none
            :source-map true}}]})
