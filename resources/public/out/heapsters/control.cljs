(ns heapsters.control)

(def THREE js/THREE)

(defn trackball-control [cam render dom]
  (let [control (THREE.TrackballControls. cam)] ;drag event fail when using dom
    (set! (.-rotateSpeed control) 2.0)
    (set! (.-zoomSpeed control) 1.2)
    (set! (.-panSpeed control) 0.8)
    (set! (.-noZoom control) false)
    (set! (.-noPan control) false)
    (set! (.-staticMoving control) true)
    (set! (.-dynamicDampingFactor control) 0.3)
    (set! (.-keys control) (array 65 83 68));a s d
    (.addEventListener control "change" render)
    control))
