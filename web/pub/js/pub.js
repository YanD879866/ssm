var OApub = 
{
	 //获取根路径	
     rootUrl : function()
     {
    	 var webPathRoot = window.location.href;
    	 var webPathUrl  = window.location.pathname;
    	 var webPathUrls = webPathUrl.substring(1);
    	 var projectName = webPathUrl.substring(0,webPathUrls.indexOf("/")+1);
    	 var i = webPathRoot.indexOf(webPathUrl);
    	 var localhost = webPathRoot.substring(0,i);
    	 return (localhost + projectName);
     }		


}