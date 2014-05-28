// Compiled by ClojureScript 0.0-2173
goog.provide('heapsters.core');
goog.require('cljs.core');
heapsters.core.THREE = THREE;
heapsters.core.draw = (function draw(){var scene = (new heapsters.core.THREE.Scene());var width = window.innerWidth;var height = window.innerHeight;var camera = (new heapsters.core.THREE.PerspectiveCamera(75,(width / height),0.1,1000));var renderer = (new heapsters.core.THREE.CanvasRenderer());var geometry = (new heapsters.core.THREE.CubeGeometry(1,1,1));var material = (new heapsters.core.THREE.MeshBasicMaterial(cljs.core.clj__GT_js.call(null,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"color","color",1108746965),65280], null))));var cube = (new heapsters.core.THREE.Mesh(geometry,material));var render = ((function (scene,width,height,camera,renderer,geometry,material,cube){
return (function cb(){requestAnimationFrame(cb);
cube.rotation.x = (0.1 + cube.rotation.x);
cube.rotation.y = (0.1 + cube.rotation.y);
return renderer.render(scene,camera);
});})(scene,width,height,camera,renderer,geometry,material,cube))
;renderer.setSize(width,height);
document.body.appendChild(renderer.domElement);
scene.add(cube);
camera.position.z = 5;
return render.call(null);
});
heapsters.core.draw.call(null);

//# sourceMappingURL=core.js.map