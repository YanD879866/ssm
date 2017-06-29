
/**
 * 邮件 
 */
var email = 
{
   saveEmail : function()
   {
	   var url = OApub.rootUrl()+"/oa/email/upload?receiver="+$('#receiver').val()+"&title="+$('#title').val()+"&content="+$('#content').val();
	  
	  // url = encodeURI(url);
	   alert(url);
	   $.ajaxFileUpload(
		{
          url : url,
          type: 'post',
          secureuri: false,
          fileElementId: 'fileInfo',
          dataType: 'json',
          data : {
        	  "test" :"123"
          },
          success: function (data)  //服务器成功响应处理函数
          {
             alert(111);
          }	
		}	   
	   );
	   
   }
}