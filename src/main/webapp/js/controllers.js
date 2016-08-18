/*
	Aqui sao definidos todos os controllers a serem utilizados pelos estados de sua aplicacao.
	Cada estado e composto por um controller (js) e uma tela (html)
	Os estados sao definidos no App.js
	As paginas sao armazenadas na pasta pages
*/
var webAppModule = angular.module('webApp');

webAppModule.controller('ClienteListController', function ($scope, $rootScope, WebServiceX, $state) {
    $scope.list = {};   
            
    
    $scope.pesquisar = function() {
        WebServiceX.read("rest/cliente/listar")
      	.then(function(data) {
			$scope.list = data;
			$scope.$apply();
      	}, function(xhr, status, err) {
      		console.error(err);
      	});        
    };
    
    $scope.abrirIncluirCliente = function() {
    	$state.go("incluir_cliente");  
    	
    };
    
    $scope.pesquisar();
    
});

webAppModule.controller('ClienteIncluirController', function ($scope, $rootScope, WebServiceX, $state) {
	$scope.entregadores = [];
	
	
    $scope.salvar = function() {
    	if($scope.cliente != undefined){
	    	WebServiceX.create("rest/cliente/salvar", JSON.stringify($scope.cliente))
	    	.then(function(data) {
	    		alert(data.status);
	    		$state.go("list_cliente");  
	    	}, function(xhr, status, err) {
	    		console.log(err);
	    	});
	    }else{
	    	alert('Preencha os campos');
	    }
    };
	
    
    $scope.cancelar = function() {
    	$state.go("list_cliente");  
    	
    };
    
});

webAppModule.controller('ProdutoListController', function ($scope, $rootScope, WebServiceX, $state) {
    $scope.list = {};   
    
    $scope.pesquisar = function() {
        WebServiceX.read("rest/produto/listar")
      	.then(function(data) {
			$scope.list = data;
			$scope.$apply();
      	}, function(xhr, status, err) {
      		console.log(err);
      	});        
    };
    
    $scope.abrirIncluirProduto = function() {
    	$state.go("incluir_produto");  
    	
    };
    
    $scope.pesquisar();
    
});

webAppModule.controller('ProdutoIncluirController', function ($scope, $rootScope, WebServiceX, $state) {
	
    
    $scope.salvar = function() {
    	if($scope.produto != undefined){
	    	WebServiceX.create("rest/produto/salvar", JSON.stringify($scope.produto))
	    	.then(function(data) {
	    		alert(data.status);
	    		$state.go("list_produto");  
	    	}, function(xhr, status, err) {
	    		console.log(err);
	    	});
	    }else{
	    	alert('Preencha os campos');
	    }
    };
    
    $scope.cancelar = function() {
    	$state.go("list_produto");  
    	
    };
	
    
});

webAppModule.controller('PedidoListController', function ($scope, $rootScope, WebServiceX, $state) {
	$scope.list = {};   
	
	$scope.pesquisar = function() {
		WebServiceX.read("rest/pedido/listar")
		.then(function(data) {
			$scope.list = data;
			$scope.$apply();
		}, function(xhr, status, err) {
			console.log(err);
		});        
	};
	
	$scope.abrirIncluirPedido = function() {
		$state.go("incluir_pedido");  
		
	};
	
	$scope.pesquisar();
	
});

webAppModule.controller('PedidoIncluirController', function ($scope, $rootScope, WebServiceX, $state) {
	$scope.pedido = {};
	
	$scope.carregarEntregadores = function() {
		
		WebServiceX.read("rest/entregador/listar")
		.then(function(data) {
			$scope.entregadores = data;
			$scope.$apply();
		}, function(xhr, status, err) {
			console.error(err);
		});
		
	};
	
	$scope.carregarCliente = function() {
        WebServiceX.read("rest/cliente/listar")
      	.then(function(data) {
			$scope.clientes = data;
			$scope.$apply();
      	}, function(xhr, status, err) {
      		console.error(err);
      	});        
    };
    
    $scope.carregarProdutos = function() {
        WebServiceX.read("rest/produto/listar")
      	.then(function(data) {
			$scope.produtos = data;
			$scope.$apply();
      	}, function(xhr, status, err) {
      		console.log(err);
      	});        
    };
    
	
	$scope.salvar = function() {
		if($scope.pedido != undefined){
			WebServiceX.create("rest/pedido/salvar", JSON.stringify($scope.pedido))
			.then(function(data) {
				alert(data.status);
				$state.go("list_pedido");  
			}, function(xhr, status, err) {
				console.log(err);
			});
		}else{
			alert('Preencha os campos');
		}
	};
	
	$scope.adicionarProduto = function() {
		if($scope.produto != '' && $scope.produto != undefined){
			if($scope.pedido.produtos == undefined){
				$scope.pedido.produtos = [];
			}
			$scope.pedido.produtos.push($scope.produto);
			$scope.produto = '';
		}else{
			alert('Selecione o produto');
		}
	};
	
	$scope.excluirProduto = function(index) {
		console.log(index);
		$scope.pedido.produtos.splice(index,1);
	};
	

	$scope.getTotal = function() {
		var total = 0;
		if ($scope.pedido.produtos != undefined) {
			for (var i = 0; i < $scope.pedido.produtos.length; i++) {
				var produto = $scope.pedido.produtos[i];
				total += parseFloat(produto.valor);
			}
		}
		return total;
	}
	
	$scope.cancelar = function() {
		$state.go("list_pedido");  
		
	};
	
	$scope.carregarCliente();
	$scope.carregarProdutos();
	$scope.getTotal();
	
});
