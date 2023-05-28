% regras
orbita_satelite(S, P) :-satelite(S),orbita(S, P).

% fatos
orbita(terra, sol).
orbita(marte, sol).
orbita(venus, sol).
orbita(lua, terra).
orbita(deimos, marte).
orbita(phobos, marte).

planeta(terra).
planeta(marte).
planeta(venus).

satelite(lua).
satelite(deimos).
satelite(phobos).

