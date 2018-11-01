$(document).ready(function() {
	var table = $("#sessionSpotsTable").DataTable({
		"ajax": {
			"url": "/SessionSpots/sessionSpots.json",
			"dataSrc": "sessionSpotInfoList"
		},
		"columns": [
			{"data": "name"},
			{"data": "address"},
			{"data": "startDatetime"},
			{"data": "endDatetime"},
			{"data": "price"},
			{"data": "maxSize"}
		],
		"columnDefs": [
			{
				"targets": [2, 3],
				"render": function(data) {
					var date = new Date(data);
					return moment(date).format("MMMM Do YYYY, h:mm a");
				}
			}
		]
	});
});