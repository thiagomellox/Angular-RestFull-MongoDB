(function() {
	'use strict';
	var app = angular.module('hs.WebService', []);
	app.factory('WebServiceX', function() {
		var ws = function(method, url, data) {
			return $.ajax({
				type : method,
				url : url,
				contentType : 'application/json',
				dataType : 'json',
				data : data
			});
		};
		return {
			read : function(url) {
				return ws('GET', url, {});
			},
			create : function(url, data) {
				return ws('POST', url, data);
			},
			update : function(url, data) {
				return ws('PUT', url, data);
			},
			deleta : function(url) {
				return ws('DELETE', url, {});
			}
		};
	});
})();