/**
 * 
 */
$(function() {
	$.ajax({
		url:"getJSON",
		type:"GET",
		dataType:"json",
		cache:false,
		success:function(data){
			$("#nameResearch").autocomplete({
				source:data
		});
		},error:function(XMLHttpRequest,textStatus,errorThrown){
			alert("エラーが発生しました！");
			console.log("XMLHttpRequest:"+XMLHttpRequest.status);
			console.log("textStatus:"+textStatus);
			console.log("errorThrown:"+errorThrown.message);
		}
		});
	
});