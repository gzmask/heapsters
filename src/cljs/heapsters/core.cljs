(ns heapsters.core)

(def THREE js/THREE)

(defn draw []
  (let [scene (THREE.Scene.)
        width (.-innerWidth js/window)
        height (.-innerHeight js/window)
        camera (THREE.PerspectiveCamera. 75 (/ width height) 0.1 1000 )
        renderer (THREE.CanvasRenderer.)
        geometry (THREE.CubeGeometry. 1 1 1)
        material (THREE.MeshBasicMaterial. (clj->js {:color 0x00ff00}))
        cube (THREE.Mesh. geometry material)
        render (fn cb []
                   (js/requestAnimationFrame cb) 
                   (set! (.-x (.-rotation cube))  (+ 0.1 (.-x (.-rotation cube))) )
                   (set! (.-y (.-rotation cube))  (+ 0.1 (.-y (.-rotation cube))) )
                   (.render renderer scene camera)
                 ) 
        ]
    (.setSize renderer width height)
    (.appendChild js/document.body (.-domElement renderer) )
    (.add scene cube)
    (set! (.-z (.-position camera))  5)
    (render)))

(draw)
