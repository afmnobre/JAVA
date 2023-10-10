$(document).ready(function () {
    // Carregar mensagens existentes
    loadMessages();

    // Enviar mensagem
    $("#guestbook-form").submit(function (e) {
        e.preventDefault();

        var name = $("#name").val();
        var comment = $("#comment").val();

        var message = {
            name: name,
            comment: comment,
            date: new Date().toLocaleString()
        };

        // Enviar mensagem para o servidor
        $.ajax({
            type: "POST",
            url: "save_message.php",
            data: {
                message: JSON.stringify(message)
            },
            success: function (response) {
                if (response === "success") {
                    // Limpar campos após o envio bem-sucedido
                    $("#name").val("");
                    $("#comment").val("");
                    loadMessages();
                } else {
                    alert("Enviado com Sucesso?");
                }
            }
        });
    });

    // Função para carregar mensagens existentes
    function loadMessages() {
        $.ajax({
            type: "GET",
            url: "messages.json",
            dataType: "json",
            success: function (data) {
                $("#guestbook-messages").empty();
                $.each(data, function (key, message) {
                    $("#guestbook-messages").append("<p><strong>" + message.date + "</strong> - " + message.name + " - " + message.comment + "</p>");
                });
            }
        });
    }
});

