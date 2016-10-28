
<div class="nav bottom-nav" id="menu">
    <ul>
        <li><a href="index.html">首页</a></li>
        <li><a href="news.html">快讯</a></li>
        <li><a href="javaScript:;">我要申请<i class="icon-base icon-arrowdown"></i></a>
            <ul class="m1">
                <li><a href="process.html">申请流程</a>|</li>
                <li><a href="apply.html">申请书</a>|</li>
                <li><a href="#">媒体服务</a>|</li>
                <li><a href="about3.html">证书样张</a>|</li>
                <li><a href="qa.html">常见问题解答</a>|</li>
                <li><a href="about2.html">现场颁证须知</a>|</li>
                <li><a href="about2.html">大规模活动安全要求</a>|</li>
                <li><a href="about2.html">LOGO使用须知</a>|</li>
                <li><a href="about2.html">食品类项目卫生要求</a></li>
            </ul>
        </li>
        <li><a href="javaScript:;">纪录大全<i class="icon-base icon-arrowdown"></i></a>
            <ul class="m2">
                <li><a href="record.html">所有纪录</a>|</li>
                <li><a href="focus.html">纪录聚焦</a>|</li>
                <li><a href="record_map.html">按省份查询</a>|</li>
                <li><a href="record.html">奇特工艺</a>|</li>
                <li><a href="record.html">科学与技术</a>|</li>
                <li><a href="record.html">人类奇迹</a>|</li>
                <li><a href="record.html">艺术与娱乐</a>|</li>
                <li><a href="record.html">交通运输</a>|</li>
                <li><a href="record.html">商界</a>|</li>
                <li><a href="record.html">体育与竞技</a>|</li>
                <li><a href="record.html">建筑与结构</a>|</li>
                <li><a href="record.html">生物自然界</a></li>
            </ul>
        </li>
        <li><a href="javaScript:;">关于我们<i class="icon-base icon-arrowdown"></i></a>
            <ul class="m4">
                <li><a href="news.html">快讯</a>|</li>
                <li><a href="about.html">总部简介</a>|</li>
                <li><a href="expert_list.html">专家资料</a>|</li>
                <li><a href="contact.html">联系我们</a></li>
            </ul>
        </li>
    </ul>
</div>
</div>
<div class="footer">
    <div class="foot-copy">
        <ul><span>版权：上海大世界基尼斯总部</span><span>法律顾问：上海锦天城律师事务所 邵鸣律师</span><span>沪ICP备12026580</span></ul>
    </div>
</div>
<script language="javascript" type="text/javascript">
    $(document).ready(function(){
        $("#menu ul li").hover(function(){
            $(this).children("ul").show();
            $(this).addClass("li01");
        },function(){
            $(this).children("ul").hide();
            $(this).removeClass("li01");
        });

        $(document).on("click",".ewm-btn",function(){
            $(".ewm-popup").show("fast");
        });
        $(document).on("click",".ewm-close",function(){
            $(".ewm-popup").hide("fast");
        });
    });
</script>
</body>
</html>