//var app = angular.module("sa_app", ["ngRoute"]);
//app.config(function($routeProvider) {
//    $routeProvider
//    .when("/", {
//        templateUrl : "main.htm"
//    })
//    .when("/customer", {
//        templateUrl : "htm/blue.htm"
//    })
//    .when("/company", {
//        templateUrl : "company.html"
//    })
//    .when("/admin", {
//        templateUrl : "htm/admin.htm",
//        controller : "controller"
//    });
//});
//	
//	

var myApp = angular.module("myApp", ['ui.router']);

myApp.config(function ($stateProvider, $urlRouterProvider) {

     $urlRouterProvider.when("", "/page1");

     $stateProvider
        .state("page1", {
            url: "/page1",
            templateUrl: "htm/blue.htm"
            	
        })
        .state("page2", {
            url:"/page2",
            templateUrl: "company.html"
        })
        .state("page3", {
            url:"/page3",
            templateUrl: "Page-3.html"
        });
});