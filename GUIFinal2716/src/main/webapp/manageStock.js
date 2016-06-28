/**
 * 
 */
//to addRowtable
$(function() {
    $("#b2").click(function() {
      //  alert('hiiii');
        $("#placedorder").hide();
        $("#ViewStock").hide(); 
    	$("#vieworder").hide(); 
         $("#addrowtbl").show();
         
    });
});

//to trackorder
$(function() {
	$("#b4").click(function() {
		$("#addrowtbl").hide(); 
		$("#ViewStock").hide(); 
		$("#vieworder").hide(); 
		$("#placedorder").show();  
	});
});



$(function() {
	$("#b3").click(function() {
		$("#addrowtbl").hide(); 
		$("#ViewStock").hide(); 
		$("#placedorder").hide(); 
		$("#vieworder").show();  
	});
});

$(function() {
	$("#b1").click(function() {
		$("#addrowtbl").hide(); 
		$("#placedorder").hide(); 
		$("#vieworder").hide(); 
		$("#ViewStock").show();  

	});
});


$(document).ready(function(){
    var i=1;
   $("#add_button").click(function(){
     
  
    $('#addr'+i).html("<td><input  name='product"+i+"' type='text' class='form-control input-md'></td><td><input  name='quantity"+i+"' type='text'  class='form-control input-md'></td><td><input  name='loc"+i+"' type='text'  class='form-control input-md'></td><td><input  name='manager"+i+"' type='text'  class='form-control input-md'></td><td><p data-placement='top' data-toggle='tooltip' title='Delete'><button class='btn btn-danger btn-xs' data-title='Delete' data-toggle='modal' data-target='#delete' ><span class='glyphicon glyphicon-trash'></span></button></p></td>");

    $('#mytable').append('<tr id="addr'+(i+1)+'"></tr>');
    i++;
  
alert(document.getElementById("product").value);
alert(document.getElementById("product").value);
alert(document.getElementById("product").value);
alert(document.getElementById("product").value);
})


$("#delete_button").click(function(){
    if(i>1){
        $("#addr"+(i-1)).html('');
        i--;
        }
    });
});



	
	function myFunction(x) {
	    alert("Row index is: " + x.rowIndex);
	    var value = mytable.Rows[2].Cells[1].Value;
	    alert(value);
	}

	$('#mytable').on('click', 'tr1', function(event) {
		   alert("hie");
		   var column1 = $(this).find('td').eq(1).html(); // gets column 1 values
		   var column2 = $(this).find('td').eq(2).html(); // gets column 2 values
		   alert(column1);
	});

$(document).ready(function(){
    $("#mytable #checkall").click(function () {
            if ($("#mytable #checkall").is(':checked')) {
                $("#mytable input[type=checkbox]").each(function () {
                    $(this).prop("checked", true);
                });

            } else {
                $("#mytable input[type=checkbox]").each(function () {
                    $(this).prop("checked", false);
                });
            }
        });
       
        $("[data-toggle=tooltip]").tooltip();
    });
