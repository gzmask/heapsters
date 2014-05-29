# server side: clojure + SQLite
  Data:

    Player:

      HP/MP...

      loot

      low res position

    Mob:

      HP/MP...

      loot

      low res position

    Dungeon nodes

      mob

      player


# client side: 
  Three.JS 

  clojurescript 

  create a simple grid which marks the locations of obstacles and then you check your players coordinates against the grid and cancel the movement if it ends up inside walls

  or Physijs if needs jumping (Cannon.js if too slow)

  data:

    high res position/tween interpolation

    hit/miss calculation


# 2D sprite for mobs, avatars, objects 

box-like 3D models for dungeon nodes

# reactive and functional
  components in the game loop should be declarative.

  the events that affects gamestate is considered to be an signal, like a stream of events.

  Each rendering event is a procedure, which takes the signal, and returns the filtered and handled signal to another rendering event.

  thus game engine should be put together using Core.Async
