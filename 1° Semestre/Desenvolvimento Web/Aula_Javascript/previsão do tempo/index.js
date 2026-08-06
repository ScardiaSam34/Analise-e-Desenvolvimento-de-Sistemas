const botao = document.getElementById('searchBtn')
const local = document.getElementById('placeInput')
const resultde = document.getElementById('results')
 
async function buscarClima(){
    const cidade = local.value
    const apiKey = "9474790cc2d03bbcdffb7e2dccdbcb3a"

    const url = 
    `https://api.openweathermap.org/data/2.5/weather?q=${cidade}&appid=${apiKey}&units=metric&lang=pt_br`

    const resposta = await fetch(url)
    const resposta_json = await resposta.json()
    console.log(resposta_json)
}

botao.addEventListener("click",buscarClima)