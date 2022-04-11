jQuery(document).ready(function($) {

    $("#confirm").on("click", function (event) {
        $.ajax({
            url: "http://localhost:8080/find",
            data: {
                kolumna: $('[name="kolumna"]').val()
            },
            success: function (result) {

                var html = '<tr>\n' +
                    '        <th>Id</th>\n' +
                    '        <th>kolumna1</th>\n' +
                    '        <th>kolumna2</th>\n' +
                    '        <th>kolumna3</th>\n' +
                    '        <th>kolumna4</th>\n' +
                    '    </tr>';
                for (var i = 0; i < result.length; i++) {

                    var item = result[i];

                    html = html + '<tr><td>' + item.id + '</td>\n' +
                        '        <td>' + item.kolumna1 + '</td>\n' +
                        '        <td>' + item.kolumna2 + '</td>\n' +
                        '        <td>' + item.kolumna3 + '</td>' +
                        '        <td>' + item.kolumna4 + '</td>' +
                        '</tr>';
                }
                $("#testTable").html(html);
            }
        });
    });
})