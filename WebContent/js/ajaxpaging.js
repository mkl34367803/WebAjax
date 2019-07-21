/**
 * 获取表格数据
 */
function sendAjax(page,rows){
	var data={};
	data.page=page;
	data.rows=rows;
	$.ajax({
		  type: 'POST',
		  url: "MyServlet",
		  data: data,
		  success:function success(data, textStatus, jqXHR){
			  
		  },
		  error:function error(data, textStatus, jqXHR){
			  
		  },
		  dataType: "json"
		});
}

/**
 * 获取总页数
 */
function getTotalPage(){
	$.ajax({
		  type: 'POST',
		  url: "GetTotalPage",
		  success:function success(data, textStatus, jqXHR){
			  
		  },
		  error:function error(data, textStatus, jqXHR){
			  
		  },
		  dataType: "json"
		});
} 