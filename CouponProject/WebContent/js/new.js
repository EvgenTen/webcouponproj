var app = angular.module("sa_app", []);
app.controller("controller", function($scope, $http) {
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
          //        btnName: $scope.btnName
           //       'id': $scope.id
              }
        	
        	
        	}).success(function(data) {
              alert(data);
              $scope.id = id;
              $scope.customerName = customerName;
              $scope.password = null;
              $scope.btnName = "Insert";
              $scope.show_data();
          });
//            $http.post(
//                "http://localhost:8080/CouponProject/manage/customer/create", {
//                    'id': $scope.id,
//                    'name': $scope.customerName,
//                    'password': $scope.password,
//                    'btnName': $scope.btnName,
//             //       'id': $scope.id
//                }
//            ).success(function(data) {
//                alert(data);
//                $scope.id = id;
//                $scope.customerName = null;
//                $scope.password = null;
//                $scope.btnName = "Insert";
//                $scope.show_data();
//            });
        }
    }
    $scope.show_data = function() {
        $http.get("http://localhost:8080/CouponProject/manage/customer/customerslist")
            .success(function(data) {
                $scope.names = data;
            });
    }
    $scope.update_data = function(id, customerName, password) {
        $scope.id = id;
        $scope.customerName = name;
        $scope.password = password;
        $scope.btnName = "Update";
    }
    $scope.delete_data = function(id) {
        if (confirm("Are you sure you want to delete?")) {
            $http.post("http://localhost:8080/CouponProject/manage/customer/delete", {
                    'id': id
                })
                .success(function(data) {
                    alert(data);
                    $scope.show_data();
                });
        } else {
            return false;
        }
    }
});