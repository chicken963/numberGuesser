function translatePromise(guess) {
    return new Promise((resolve, reject) => {
        fetch(`http://localhost:8080/compute?guess=${guess}`)
            .then(res => res.text())
            .then(text => addPanelWithText(text))
    });
}

function addPanelWithText(text){
    let status;
    if(text==='0К4Б'){
        status = "success"
    } else {
        status = "danger"
    }
    document.getElementById('test').insertAdjacentHTML( 'beforeend',
        `<div class="card text-white bg-${status} mb-3 m-1" style="max-width: 20rem; opacity: 0.5">
                            <div class="card-header">Your result:</div>
                            <div class="card-body">
                                  <p class="card-text text-white" style="opacity: unset">${text}</p>
                            </div>
                     </div>`);
}

document.getElementById("check-guess").addEventListener("click", ()=>{
    let value = document.getElementById("guess-value").value;
    translatePromise(value);
})