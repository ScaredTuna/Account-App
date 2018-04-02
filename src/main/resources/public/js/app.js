(function() {
	var app = angular.module('app', ['ui.router', 'navController', 'ngAnimate', 'ui.bootstrap', 'ngResource', 'app.controllers', 'app.services'])

	define('app', [], function() { return app; });

	function req(deps) {
		if (typeof deps === 'string') deps = [deps];
		return {
			deps: function ($q, $rootScope) {
				var deferred = $q.defer();
				require(deps, function() {
					$rootScope.$apply(function () {
						deferred.resolve();
					});
					deferred.resolve();
				});
				return deferred.promise;
			}
		}
	}

	app.config(function($stateProvider, $urlRouterProvider, $controllerProvider){
		var origController = app.controller
		app.controller = function (name, constructor){
			$controllerProvider.register(name, constructor);
			return origController.apply(this, arguments);
		}

		var viewsPrefix = 'views/';

		$urlRouterProvider.otherwise("/")

		$stateProvider
			.state('home', {
				url: "/",
				templateUrl: viewsPrefix + "home.html",
				data: {
					pageTitle: 'Home'
				}
			})
			.state('accounts',{
	        url:'/accounts',
	        templateUrl: viewsPrefix + 'accounts.html',
	        controller:'AccountListController'
	    }).state('viewAccount',{
	       url:'/accounts/:id/view',
	       templateUrl: viewsPrefix + 'accountView.html',
	       controller:'AccountViewController'
	    }).state('newAccount',{
	        url:'/accounts/new',
	        templateUrl: viewsPrefix + 'accountAdd.html',
	        controller:'AccountCreateController'
	    }).state('editAccount',{
	        url:'/accounts/:id/edit',
	        templateUrl: viewsPrefix + 'accountEdit.html',
	        controller:'AccountEditController'
	    })
	})
	.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {
			return {
				link: function(scope, element) {
					var listener = function(event, toState) {
						var title = 'Project Name';
						if (toState.data && toState.data.pageTitle) title = toState.data.pageTitle + ' - ' + title;
						$timeout(function() {
							element.text(title);
						}, 0, false);
					};

					$rootScope.$on('$stateChangeSuccess', listener);
				}
			};
		}
	]);
}());
