(ns heapsters.core
  (:require [heapsters.control :as control]))

(def THREE js/THREE)

(defn draw []
  (let [scene (THREE.Scene.)
        width 640
        height 480
        camera (THREE.PerspectiveCamera. 60 (/ width height) 0.1 1000)
        renderer (THREE.WebGLRenderer.)
        dom (.-domElement renderer)
        render #(.render renderer scene camera)
        control (control/trackball-control camera render dom)
        center-point {:x 0 :y 0 :z 0}
        geometry (THREE.CubeGeometry. 1 1 1)
        material (THREE.MeshBasicMaterial. (clj->js {:color 0x00ff00}))
        cube (THREE.Mesh. geometry material)
        animate (fn an[] 
                  (js/requestAnimationFrame an)
                  (.update control)
                  (set! (.-x (.-rotation cube))  (+ 0.1 (.-x (.-rotation cube))) )
                  (set! (.-y (.-rotation cube))  (+ 0.1 (.-y (.-rotation cube))) )
                  (render))]
    (.setSize renderer width height)
    (.appendChild js/document.body (.-domElement renderer))
    (.add scene cube)
    (set! (.-z (.-position camera))  5)
    (set! (.-y (.-position camera))  5) 
    (.lookAt camera (THREE.Vector3. 
                      (:x center-point) 
                      (:y center-point) 
                      (:z center-point)))
    (animate)))

(draw)
