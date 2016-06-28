/**
 * 
 */

$(function() {
	$("#btn").click(function() {
		if ($(this).val() == "track") {
			$("#googleMap").show();

		} else {
			$("#googleMap").hide();
		}

	});
});



