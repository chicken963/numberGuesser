function translatePromise(guess) {
    return new Promise((resolve, reject) => {
        var radr;
        fetch(`http://localhost:8080/compute?guess=` + guess)
            .then(res => res.json())
            .then(json => document.getElementById('test').innerHTML = JSON.stringify(json));
    })
}

document.getElementById("check-guess").addEventListener("click", ()=>{
    let value = document.getElementById("guess-value").value;
    translatePromise(value);
})