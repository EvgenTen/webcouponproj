var app = angular.module('crud', []);
app.controller('controller', function($scope, $http) {
    $scope.btnName = "Insert";
    $scope.insert = function() {
   
        if ($scope.title == null) {
            alert("Enter Title");
        } else if ($scope.endDate == null) {
            alert("Enter End Date");
        } else if ($scope.amount == null) {
            alert("Enter Amount");
        } else if ($scope.price == null) {
            alert("Enter Price");
        } else {
        	$http ({
        		method: 'POST',
        		url: 'http://localhost:8080/CouponProject/manage/coupons/create',
        		data : 	{
        			id: $scope.id,
                    title: $scope.title,
                    startDate: $scope.startDate,
                    endDate: $scope.endDate,
                    amount: $scope.amount,
                    message: $scope.message,
                    price: $scope.price,
                    type: $scope.type,
                    image: $scope.image,
                    companyId: $scope.companyId
              }
        	}).then(function(response) {
    		$scope.names = response.data;
    		});
        window.location.reload();
    	 } 
    
    }

    $scope.show_data = function() {
        $http.get("http://localhost:8080/CouponProject/manage/coupons/couponslist")
            .then(function (response) {
                $scope.names = response.data;
            });
    }
    
    $scope.edit_data = function(id, title, startDate, endDate, amount, message, price, type, image, companyId) {
   	 $scope.id = id;
     $scope.title = title;
     $scope.startDate = startDate;
     $scope.endDate = endDate;
     $scope.amount = amount;
     $scope.message = message;
     $scope.price = price;
     $scope.type = type;
     $scope.image = image;
     $scope.companyId = companyId;
       $scope.btnName = "Update";
    
    $scope.insert = function(id, title, startDate, endDate, amount, message, price, type, image, companyId) {
    	if (confirm("Update coupon?")) {
    	
    	$http ({
    		method: 'PUT',
    		url: 'http://localhost:8080/CouponProject/manage/coupons/',
    		data : 	{
    			id: $scope.id,
                title: $scope.title,
                startDate: $scope.startDate,
                endDate: $scope.endDate,
                amount: $scope.amount,
                message: $scope.message,
                price: $scope.price,
                type: $scope.type,
                image: $scope.image,
                companyId: $scope.companyId
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
            $http.delete("http://localhost:8080/CouponProject/manage/coupons/" + id, {
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