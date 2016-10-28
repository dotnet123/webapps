

<script>
    $(function(){

        var options = {
            uploadJson: '/upload/upload2json',
            fileManagerJson: '/kindeditor/jsp/file_manager_json.jsp',
            allowFileManager : false
        };
        window.editor = KindEditor.create('.content', options);

        var  editor = KindEditor.editor({
            cssPath: '/kindeditor/plugins/code/prettify.css',
            uploadJson: '/upload/upload2json'
        });

        $("body").delegate(".pic", "click", function () {
            var obj = this;

            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    showRemote: true,
                    // imageUrl: "", //K('#' + urlid).val(),
                    clickFn: function (url, title, width, height, border, align) {
                        $(obj).val(url);
                        editor.hideDialog();
                    }
                });
            });
        });

        ///

//        $('#form1')
//                .form({
//                    onSubmit:function () {
//
//                    },
//
//                    success:function(data){
//                        mysuccess(data);
//
//                    },
//                    onLoadSuccess:function(data){
//                    }
//                });
//               // .form('load', loadurl);

    })
</script>


<script>
function setPager(totalcount)
{
    var curr=   $.query.get('page') ;

    laypage({
        cont: document.getElementById('pager123'), //容器。值支持id名、原生dom对象，jquery对象,
        pages: totalcount, //总页数
        skin: 'yahei', //加载内置皮肤，也可以直接赋值16进制颜色值，如:#c00
        groups: 7 ,
        curr: curr || 1, //当前页
        jump: function(obj, first){ //触发分页后的回调
            if(!first){ //点击跳页触发函数自身，并传递当前页：obj.curr

                var newUrl = $.query.set("page", obj.curr).toString();
                location.href =  newUrl;
            }
        }
    });
}


</script>
</body>
</html>
