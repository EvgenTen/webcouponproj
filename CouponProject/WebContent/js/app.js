var routerApp = angular.module('router', ['ui.router']);

routerApp.config(function($stateProvider, $urlRouterProvider) {
	
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
        // HOME STATES AND NESTED VIEWS ========================================
        .state('home', {
            url: '/home',
            templateUrl: 'head.html'
        })
        
        // nested list with custom controller
        .state('home.customers', {
            url: '/customers',
            templateUrl: '/CouponProject/htm/customers.htm',
            controller: 'controller'
          
        })
        
        .state('home.company', {
            url: '/company',
            templateUrl: '/CouponProject/htm/company.htm',
            	 controller: 'controller'
            
        })
        
        .state('home.coupons', {
            url: '/coupons',
            templateUrl: '/CouponProject/htm/coupons.htm',
            	 controller: 'controller'
            
        })
        
      
        
});
