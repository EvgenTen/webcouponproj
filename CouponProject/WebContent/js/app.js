
var app = angular.module('myApp', []);
app.controller('controller', function($scope, $http) {
	
  $http.get("http://localhost:8080/CouponProject/manage/customer/customerslist").then(function (response) {
	  	  $scope.myData = response.data;
	  	 
  });
  
  $scope.empoyees = angular.copy( $scope.myData);
	
	 
  $scope.addCustomer = function(){
	    var emp ={id:"",customerName:"",password:""};
		$scope.empoyees.push(emp);
		
	}
  
  $scope.submitCustomer = function(){

		console.log("form submitted:"+angular.toJson($scope.empoyees ));
	}
	 
	 
	  
  
  
 
});
