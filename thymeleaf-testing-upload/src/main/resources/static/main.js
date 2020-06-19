/**
 * 
 */

$('document').ready(function(){	
	$('.table .btn-warning').on('click',function(event){	
		
		event.preventDefault();
		var href= $(this).attr('href');
		
		$.get(href,function(platform,status){
			
			$('#idEdit').val(platform.id);
			$('#nameEdit').val(platform.name);
			$('#languageEdit').val(platform.language);
			$('#frameworkEdit').val(platform.framework);
			
			
		});
		
		$('#editModal').modal();				
	});		
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);		
		$('#deleteModal').modal();
	
	
});
});