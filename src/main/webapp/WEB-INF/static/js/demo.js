$(document).ready(function () {
    $("p").click(function () {
        $(this).hide();
    })

    $("#set_home").click(function () {
        window.alert("设置为首页")
    })

    $("#add_collection").click(function () {
        window.alert("加入收藏")
    })

    $("#connect_our").click(function () {
        window.alert("联系我们")
    })
});