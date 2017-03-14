var view = {
    displayMessage: function (msg) {
        var messageArea = document.getElementById("messageArea");
        messageArea.innerHTML = msg;
    },
    displayHit: function (location) {
        var cell = document.getElementById(location);
        cell.setAttribute("class", "hit");

    },

    displayMiss: function (location) {
        var cell = document.getElementById(location);
        cell.setAttribute("class", "miss");
    }

};

var model = {
    boardSize: 7, numShip: 3, shipLength: 3, shipSunk: 0,
    ships: [{locations: ["06", "16", "26"], hits: ["", "", ""]},
        {locations: ["24", "34", "44"], hits: ["", "", ""]},
        {locations: ["10", "11", "12"], hits: ["", "", ""]}],

    fire: function (guess) {
        for (var i = 0; i < this.numShip; i++) {
            var ship = this.ships[i];
            var index = ship.locations.indexOf(guess);
            if (index >= 0) {
                ship.hits[index] = 'hit';
                view.displayHit(guess);
                view.displayMessage("HIT!");
                if (this.isSunk(ship)) {
                    view.displayMessage("You sank my battleship!");
                    this.shipSunk++;
                }
                return true;
            }
        }
        view.displayMiss(guess);
        view.displayMessage("You MISSING!")
        return false;
    },

    isSunk: function (ship) {
        for (var i = 0; i < this.shipLength; i++) {
            if (ship.hits[i] !== 'hit') {
                return false;
            }
        }
        return true;
    }
};


var controller = {
    parseGuess: function () {
        var alphabet = ["A", "B", "C", "D", "E", "F", "G"];
        if (guess === null || guess.length !== 2) {
            alert("Не верные данные или большое кол-во данных!");
        }
        else {
            var firstChar = guess.charAt(0);
            var elem = alphabet.indexOf(firstChar);
            var secChar = guess.charAt(1);
            if (isNaN(elem) || isNaN(secChar)) {
                alert("Не верное введены данные!");
            } else if (elem < 0 || elem >= model.boardSize ||
                secChar < 0 || secChar >= model.boardSize) {
                alert("За пределами игрового поля!");
            } else {
                return elem + secChar;
            }
            return null;
        }
    },
    processGuess: function (guess) {

    }


};
