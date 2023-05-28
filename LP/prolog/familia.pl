% regras
filho(X, Y) :- pai(Y, X) ; mae(Y, X).
irma(X, Y) :- pai(Z, X), pai(Z, Y), mae(W, X), mae(W, Y), X \= Y.
neto(X, Y) :- filho(X, Z), filho(Z, Y).
tio(X, Y) :- irma(X, Z), filho(Y, Z).
primo(X, Y) :- tio(Z, X), filho(Y, Z).
avo(X, Y) :- pai(X, Z), pai(Z, Y) ; pai(X, Z), mae(Z, Y);
    mae(X, Z), pai(Z, Y) ; mae(X, Z), mae(Z, Y).

% fatos
pai(jose, deizimar).
pai(jose, neilom).
mae(maria, deizimar).
mae(maria, neilom).

pai(carlos, valdilene).
pai(carlos, eliane).
pai(carlos, elenice).
mae(clarice, valdilene).
mae(clarice, eliane).
mae(clarice, elenice).

pai(neilom, pedro).
pai(neilom, patricia).
mae(valdilene, pedro).
mae(valdilene, patricia).

mae(deizimar, junior).
pai(luiz, junior).

mae(elenice, gregorio).
pai(israel, gregorio).



