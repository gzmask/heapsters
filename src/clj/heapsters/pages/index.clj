(ns heapsters.pages.index
  (:use hiccup.core
        hiccup.page
        hiccup.util))

(defn pages 
  "get page by pagename"
  [page]
  (html5 
    [:head 
     (include-js "/vendor/threejs/three.js") 
     (include-js "vendor/threejs/TrackballControls.js") 
     (include-js "out/goog/base.js") 
     [:title "The Game: Heapsters"]] 
    [:body 
     [:div.wrapper 
      [:div.container 
       (include-js "/out/heapster.js") 
       [:script {:type "text/javascript"} "goog.require('heapsters.core');"]
       [:div.mainbox
       page]]]]))
