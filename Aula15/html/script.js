document.getElementById("fetchButton").addEventListener("click", () => {
    fetch("https://swapi.bry.com.br/api/people/5/")
        .then(response => response.json())
        .then(data => {
            // Seleciona o elemento de resultado e insere o nome da resposta JSON
            document.getElementById("result").innerHTML = `
                <strong>Nome:</strong> ${data.name}<br>
                <strong>Altura:</strong> ${data.height} cm<br>
                <strong>Cor dos olhos:</strong> ${data.eye_color}<br>
                <strong>Ano de nascimento:</strong> ${data.birth_year}
            `;
        })
        .catch(error => {
            document.getElementById("result").innerHTML = "Ocorreu um erro ao buscar os dados.";
            console.error("Erro:", error);
        });
});
document.getElementById("postButton").addEventListener("click", () => {

    fetch('http://localhost:8080/test-post', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'  // Especifica o tipo de conteúdo como JSON
        },
        body: JSON.stringify({ message: 'Hello, NGINX!' })  // Dados que você deseja enviar no corpo da requisição
    })
        .then(response => response.text())  // Ou use `.json()` se o servidor retornar JSON
        .then(data => console.log(data))  // Processa a resposta
        .catch(error => console.error('Erro na requisição:', error));
});
