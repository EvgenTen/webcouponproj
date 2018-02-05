
var app = angular.module('myApp', []);
app.controller('controller', function($scope, $http) {
	
//	 $scope.myData = [];
//	$scope.myData = data;
//     $http({
//         method: 'GET',
//         url: 'http://localhost:8080/CouponProject/manage/customer/customerslist'
//     }).success(function (data) {
//         console.log("BLOG pass");
//         $scope.myData = data; // response data 
//     }).error(function (data) {
//         console.log("BLOG failed");
//     });
// 
	var index = 1;
    $scope.insertRow = function(){
                var table=document.getElementById("mytable");
                var row=table.insertRow(table.rows.length);
                var cell1=row.insertCell(0);
                var t1=document.createElement("input");
                    t1.id = "txtName"+index;
                    cell1.appendChild(t1);
                var cell2=row.insertCell(1);
                var t2=document.createElement("input");
                    t2.id = "txtAge"+index;
                    cell2.appendChild(t2);
                var cell3=row.insertCell(2);
                var t3=document.createElement("input");
                    t3.id = "txtGender"+index;
                    cell3.appendChild(t3);
                var cell4=row.insertCell(3);
                var t4=document.createElement("input");
                    t4.id = "txtOccupation"+index;
                    cell4.appendChild(t4);
          index++;

    }

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
