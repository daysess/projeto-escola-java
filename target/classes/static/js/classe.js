const frm = document.querySelector("form")
const resp = document.querySelector("pre")
var url = ''

function btExcluir(id){
	url = "http://localhost:8080/classes/excluir/"+id;
}

function btSim(){
	document.location.href = url;
}