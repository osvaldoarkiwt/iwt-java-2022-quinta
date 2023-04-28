/**
 * 
 */

 document.getElementById('botao').addEventListener('click',()=>{
	const lista = document.getElementById('lista');
	
	const nome = document.getElementById('nome').value;
	
	const item = document.createElement('li');
	
	item.innerText = nome;
	
	lista.appendChild(item);
	 
 });