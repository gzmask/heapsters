// Compiled by ClojureScript 0.0-2173
goog.provide('heapsters.core');
goog.require('cljs.core');
goog.require('heapsters.control');
goog.require('heapsters.control');
heapsters.core.THREE = THREE;
heapsters.core.draw = (function draw(){var scene = (new heapsters.core.THREE.Scene());var width = 640;var height = 480;var camera = (new heapsters.core.THREE.PerspectiveCamera(60,(width / height),0.1,1000));var renderer = (new heapsters.core.THREE.WebGLRenderer());var dom = renderer.domElement;var render = ((function (scene,width,height,camera,renderer,dom){
return (function (){return renderer.render(scene,camera);
});})(scene,width,height,camera,renderer,dom))
;var control = heapsters.control.trackball_control.call(null,camera,render,dom);var center_point = new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"x","x",1013904362),0,new cljs.core.Keyword(null,"y","y",1013904363),0,new cljs.core.Keyword(null,"z","z",1013904364),0], null);var geometry = (new heapsters.core.THREE.CubeGeometry(1,1,1));var material = (new heapsters.core.THREE.MeshBasicMaterial(cljs.core.clj__GT_js.call(null,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"color","color",1108746965),65280], null))));var cube = (new heapsters.core.THREE.Mesh(geometry,material));var animate = ((function (scene,width,height,camera,renderer,dom,render,control,center_point,geometry,material,cube){
return (function an(){requestAnimationFrame(an);
control.update();
cube.rotation.x = (0.1 + cube.rotation.x);
cube.rotation.y = (0.1 + cube.rotation.y);
return render.call(null);
});})(scene,width,height,camera,renderer,dom,render,control,center_point,geometry,material,cube))
;renderer.setSize(width,height);
document.body.appendChild(renderer.domElement);
scene.add(cube);
camera.position.z = 5;
camera.position.y = 5;
camera.lookAt((new heapsters.core.THREE.Vector3(new cljs.core.Keyword(null,"x","x",1013904362).cljs$core$IFn$_invoke$arity$1(center_point),new cljs.core.Keyword(null,"y","y",1013904363).cljs$core$IFn$_invoke$arity$1(center_point),new cljs.core.Keyword(null,"z","z",1013904364).cljs$core$IFn$_invoke$arity$1(center_point))));
return animate.call(null);
});
heapsters.core.draw.call(null);

//# sourceMappingURL=core.js.map