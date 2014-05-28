(ns heapsters.core
  (:gen-class) 
  (:use compojure.core 
        ring.adapter.jetty)
  (:require [compojure.handler :as handler] 
            [ring.middleware.session :as session] 
            [ring.middleware.params :as params]
            [compojure.route :as route]
            [heapsters.pages.index :as index]
            ))

(defroutes app-routes
  (route/resources "/")
  (GET "/" [] (index/pages "helloworld")))

(def app
    (params/wrap-params (session/wrap-session (handler/site app-routes))))

(defn -main []
      (run-jetty #'app {:port 80
                        :join? false}))
