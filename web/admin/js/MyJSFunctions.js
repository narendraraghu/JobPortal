/*
// operations
// - selects all the para elements (array of paragraph objects)
// - applies the css properties
//   - color = red
//$("p").css("color",   "red");
// |            |        |
//selector   Property   value
//$("p").css("font-size", "2em");

// always cache the element
// because when $() is used, jQuery starts looking for the element
// from the beginning
var paras = $("p");
paras.css("color", "green");
paras.css("font-size", "3em");

// jQuery chaining
// all jQuery functions return the object on which they are working
$("div").css("color", "red").css("font-size", "2em");
*/

$("div p").css(
		 {
				"color":"red", 
				"font-size":"2em"
		 });






