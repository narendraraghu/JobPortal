function displayName() {
//	var elementInput = document.forms["myform"]["firstname"];
//	var firstname = elementInput.value;

	var firstname = document.forms["myform"]["firstname"].value;
	var elementP = document.getElementById("mypara");
	elementP.innerHTML = "Hi " + firstname + "!!! how are you ?";
}


function showAlert(message) {
	// alert(message);
	
//	var arrayInputs = document.getElementsByTagName("input");
//	var inputTag = arrayInputs[0];
//	alert(inputTag);
	
	var inputTag = document.forms["myform"]["firstname"];
	var strname = inputTag.value;
	
	// the way to get all the elements from document
	// of type para (p)
	// returns an array of all the elements
	var array = document.getElementsByTagName("p");
	
	// get the first element from array
	// and set the text to the message
	array[0].innerHTML = "Hello " + strname;
	
	//alert(array[0]);
}