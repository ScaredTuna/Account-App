angular.module('app.controllers', []).controller('AccountListController', function($scope, $state, popupService, $window, Account) {
  $scope.accounts = Account.query(); 

  $scope.deleteAccount = function(account) { 
    if (popupService.showPopup('Delete account?')) {
      account.$delete(function() {
        $scope.accounts = Account.query(); 
        $state.go('accounts');
      });
    }
  };
}).controller('AccountViewController', function($scope, $stateParams, Account) {
  $scope.account = Account.get({ id: $stateParams.id }); 
}).controller('AccountCreateController', function($scope, $state, $stateParams, Account) {
  $scope.account = new Account(); 

  $scope.addAccount = function() { 
    $scope.account.$save(function() {
      $state.go('accounts');
    });
  };
}).controller('AccountEditController', function($scope, $state, $stateParams, Account) {
  $scope.updateAccount = function() { 
    $scope.account.$update(function() {
      $state.go('accounts'); 
    });
  };

  $scope.loadAccount = function() { 
    $scope.account = Account.get({ id: $stateParams.id });
  };

  $scope.loadAccount();
});
