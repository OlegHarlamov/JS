var number;
var attempts = 0;

//Общая формула - min + Math.random() * (max - min)

number = Math.round(1 + Math.random() * (100 - 1));
guessNumber();


function guessNumber(){
    attempts++;
    var result = parseInt(prompt("Введите число (-1 - закончить игру)"));
    
    if(result == number){
        alert("Вы угадали! Чило попыток: " +attempts);
        location.reload();//перезагрузка страницы для новой игры
    }
    //игрок не ввёл число
    else if(result == 0 || isNaN(result)){
        alert("Вы не ввели число");
        guessNumber();
    }
    else if(result == -1){
        alert("Спасибо за игру!");
    }
    else{
        if (result > number){
            alert("Ваше число меньше заданного");
        }
        else if(result<number){
            alert("Ваше число больше заданного");
        }
        guessNumber();
    }
}
