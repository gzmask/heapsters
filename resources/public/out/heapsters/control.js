// Compiled by ClojureScript 0.0-2173
goog.provide('heapsters.control');
goog.require('cljs.core');
heapsters.control.THREE = THREE;
heapsters.control.trackball_control = (function trackball_control(cam,render,dom){var control = (new heapsters.control.THREE.TrackballControls(cam));control.rotateSpeed = 2.0;
control.zoomSpeed = 1.2;
control.panSpeed = 0.8;
control.noZoom = false;
control.noPan = false;
control.staticMoving = true;
control.dynamicDampingFactor = 0.3;
control.keys = [65,83,68];
control.addEventListener("change",render);
return control;
});

//# sourceMappingURL=control.js.map