var app = angular.module('sa_app', []);
app.controller('controller', function($scope, $http) {
    $scope.btnName = "Insert";
    $scope.insert = function() {
   
        if ($scope.companyName == null) {
            alert("Enter Name");
        } else if ($scope.password == null) {
            alert("Enter Password");
        }
            else if ($scope.email == null) {
                alert("Enter Email");
        } else {
        	$http ({
        		method: 'POST',
        		url: 'http://localhost:8080/CouponProject/manage/company/create',
        		data : 	{
                  id: $scope.id,
                  companyName: $scope.companyName,
                  password: $scope.password,
                  email: $scope.email
              }
        	}).then(function(response) {
    		$scope.names = response.data;
    		});
        window.location.reload();
    	 } 
    
    }

    $scope.show_data = function() {
        $http.get("http://localhost:8080/CouponProject/manage/company/companylist")
            .then(function (response) {
                $scope.names = response.data;
            });
    }
    
    $scope.edit_data = function(id, companyName, password, email) {
       $scope.id = id;
       $scope.companyName = companyName;
       $scope.password = password;
       $scope.email = email;
       $scope.btnName = "Update";
    
    $scope.insert = function(id, companyName, password, email) {
    	if (confirm("Update company?")) {
    	
    	$http ({
    		method: 'PUT',
    		url: 'http://localhost:8080/CouponProject/manage/company/',
    		data : 	{
              id: $scope.id,
              companyName: $scope.companyName,
              password: $scope.password,
              email: $scope.email
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
            $http.delete("http://localhost:8080/CouponProject/manage/company/" + id, {
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