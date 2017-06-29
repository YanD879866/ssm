/**
 * 获得页面封装的参数
 */
function getDataJson()
{
  	var dataJson = {};
  	dataJson['userId'] = $('#userId').val();
  	dataJson['password'] = $('#password').val();
  	return dataJson;
}

/**
 * 公共的js 获取 根路径
 */
var oaLogin = 
{
		//点击按钮登录
		dologin : function()
		{
		  //获得参数
			var dataObj = getDataJson();
			$.ajax({
				type : "post",  
				url  : OApub.rootUrl()+"/oa/login/doLogin",
				data : dataObj,
				dataType:"json",
				success : function(ret)
				{
					if(ret.resultCode == "0")
					{
						window.location.href = OApub.rootUrl()+"/pub/main.jsp";
					}else
					{
						$("#message").html(ret.resultObj);
					}
				}
			});
		
		}	


}