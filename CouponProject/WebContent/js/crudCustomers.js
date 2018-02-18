var app = angular.module('crud', []);
app.controller('controller', function($scope, $http) {
    $scope.btnName = "Insert";
    $scope.insert = function() {
   
        if ($scope.customerName == null) {
            alert("Enter Name");
        } else if ($scope.password == null) {
            alert("Enter Password");
        
        } else {
        	$http ({
        		method: 'POST',
        		url: 'http://localhost:8080/CouponProject/manage/customer/create',
        		data : 	{
                  id: $scope.id,
                  customerName: $scope.customerName,
                  password: $scope.password
              }
        	}).then(function(response) {
    		$scope.names = response.data;
    		});
        window.location.reload();
    	 } 
    
    }

    $scope.show_data = function() {
        $http.get("http://localhost:8080/CouponProject/manage/customer/customerslist")
            .then(function (response) {
                $scope.names = response.data;
            });
    }
    
    $scope.edit_data = function(id, customerName, password) {
       $scope.id = id;
       $scope.customerName = customerName;
       $scope.password = password;
       $scope.btnName = "Update";
    
    $scope.insert = function(id, customerName, password) {
    	if (confirm("Update customer?")) {
    	
    	$http ({
    		method: 'PUT',
    		url: 'http://localhost:8080/CouponProject/manage/customer/',
    		data : 	{
              id: $scope.id,
              customerName: $scope.customerName,
              password: $scope.password
          }
    	}).then(function(response) {
    		$scope.names = response.data;
    		});
        window.location.reload();
    	 } else {
             return false;
         } 
     
         }
   
  }
 
  

    $scope.delete_data = function(id) {
        if (confirm("Are you sure you want to delete?")) {
            $http.delete("http://localhost:8080/CouponProject/manage/customer/" + id, {
                })
                .then(function(response) {
            		$scope.names = response.data;
            		});
            window.location.reload();
        } else {
            return false;
        }
    }
});