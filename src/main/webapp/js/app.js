var $stateProviderRef = null;

angular.module("webApp", ["ui.router", "hs.WebService", 'ui.mask'])
    .config(function ($stateProvider, $urlRouterProvider) {
    	// For any unmatched url, send to /index
		  $urlRouterProvider.otherwise("/listcliente");

		  $stateProvider
		  .state('list_cliente', {
		      url: "/listcliente",
		      templateUrl: "pages/cliente/list.html",
		      controller: "ClienteListController"
		    })
		    .state('incluir_cliente', {
		      url: "/incluircliente",
		      templateUrl: "pages/cliente/incluir.html",
		      controller: "ClienteIncluirController"
		    })
		  	
		    .state('list_produto', {
		      url: "/listproduto",
		      templateUrl: "pages/produto/list.html",
		      controller: "ProdutoListController"
		    })
		    .state('incluir_produto', {
		      url: "/incluirproduto",
		      templateUrl: "pages/produto/incluir.html",
		      controller: "ProdutoIncluirController"
		    })
		  
		  .state('list_pedido', {
			  url: "/listpedido",
			  templateUrl: "pages/pedido/list.html",
			  controller: "PedidoListController"
		  })
		  .state('incluir_pedido', {
			  url: "/incluirpedido",
			  templateUrl: "pages/pedido/incluir.html",
			  controller: "PedidoIncluirController"
		  });
    	
    });