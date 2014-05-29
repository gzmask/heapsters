(ns heapsters.pages.index
  (:use hiccup.core
        hiccup.page
        hiccup.element
        hiccup.util))

(defn pages 
  "get page by pagename"
  [page]
  (html5 
    [:head 
     [:title "The Game: Heapsters"]] 
    [:body 
     [:div.wrapper 
      [:div.container {:id "drawgame"} 
        (include-js "/vendor/threejs/three.js") 
        (include-js "vendor/threejs/TrackballControls.js") 
        (include-js "out/goog/base.js") 
        (include-js "/out/heapster.js") 
        (javascript-tag "goog.require('heapsters.core');")
       [:div.mainbox page]]]]))
