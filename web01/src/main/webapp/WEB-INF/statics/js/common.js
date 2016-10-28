String.format = function () {
    if (arguments.length == 0)
        return null;

    var str = arguments[0];
    for (var i = 1; i < arguments.length; i++) {
        var re = new RegExp('\\{' + (i - 1) + '\\}', 'gm');
        str = str.replace(re, arguments[i]);
    }
    return str;
}



////////////////////////////////
//几秒后跳转
function jump(count, url) {
    
    window.setTimeout(function () {
        count--;
        if (count > 0) {
           
            jump(count, url);
        } else {
          
            window.location.href = url;
        }
    }, 1000);
}

$.PostJson = function (url, data, callback)
{
    $.post(url, data, callback, "json")
}
/////
