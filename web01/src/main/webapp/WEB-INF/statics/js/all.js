(function (global) {
    var tempObj = new Object();
    tempObj.getRootPath = function () {
        var wwwPath = window.document.location.href;
        var pathName = window.document.location.pathname;
        var pos = wwwPath.indexOf(pathName);
        var rootPath = wwwPath.substring(0, pos);
        return rootPath;
    }
    global.Common = tempObj;
})(this);

var RootPath = Common.getRootPath();

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

document.write(String.format("<script src='{0}/js/jquery.min.js' charset='utf-8'></script>", RootPath));
document.write(String.format("<script language=javascript src='{0}/kindeditor/kindeditor-min.js' charset='utf-8'></script>", RootPath));
document.write(String.format("<script language=javascript src='{0}//kindeditor/lang/zh_CN.js'></script>", RootPath));



