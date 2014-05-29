goog.addDependency("base.js", ['goog'], []);
goog.addDependency("../cljs/core.js", ['cljs.core'], ['goog.string', 'goog.array', 'goog.object', 'goog.string.StringBuffer']);
goog.addDependency("../heapsters/control.js", ['heapsters.control'], ['cljs.core']);
goog.addDependency("../heapsters/core.js", ['heapsters.core'], ['cljs.core', 'heapsters.control']);