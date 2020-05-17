
	var app = angular.module("onlineShopApp", ["ngRoute"]);

  app.value('suma', {counter:0});
  app.value('price', {sum:0});

  app.service("storeProduct", function(price){
  var products = [];

  

  this.setProduct = function(product,price){
    
      product.amount++;
      products.push(product)

    var set = new Set(products);
    products = [...set];

      price += product.price;
  };

  this.getProduct = function(){
    return products;
  }

  });





    app.factory('saveOneProductInArray', function() {
       
        var savedData = {}
        
        function set(data) {
          savedData = data;
         
        }

        function get() {
         return savedData;
        }

        return {
            set: set,
            get: get
           }



      });

  // Routing in page

app.config(function($routeProvider,$locationProvider) {
	 $locationProvider.hashPrefix('');
  $routeProvider
    .when("/", {
      templateUrl: '/shopMenu.html',
      controller: 'productController',
      resolve:{
       data: function($http){
          return $http.get('/shopMenu')
          .then(function(response){
            return response.data;
          })
    }
    }})
      
 
    .when("/info", {
      templateUrl: '/infoAboutProduct.html'
    })

 .when("/about", {
      templateUrl: '/info.html'
    })

 .when("/history", {
      templateUrl: '/history.html'
    })

  .when("/registration", {
      templateUrl: '/registration.html'
    })

  .when("/list", {
      templateUrl: '/buyingList.html'
    });

});

// Pirmo puslapio kontroleris

app.controller('productController', function($scope,$http,saveOneProductInArray,$rootScope,suma,storeProduct,data) {

 $scope.object = data; 


  $scope.products = data;
  console.log(data);


  $scope.setProductName = function(product) {
    saveOneProductInArray.set(product);
  };

    $scope.addOne = function(){
       suma.counter +=1;
    };

    $scope.saveBuyProduct = function(product) {
    storeProduct.setProduct(product);
   };

  
  })




  
  
  app.controller('OneProduct', function($scope,saveOneProductInArray,$rootScope,suma,storeProduct) {
  
    $scope.oneProduct = saveOneProductInArray.get();


 $scope.addOne = function(){
       suma.counter +=1;
   
    };

  $scope.saveBuyProduct = function(oneProduct) {
   
    storeProduct.setProduct(oneProduct);
   };

  });

   app.controller('navBar', function($scope,suma,$rootScope) {

    $scope.prekiuKiekis = suma;

  });



   app.controller('listOfProducts', function($scope,suma,storeProduct,price,$rootScope) {
  
    $scope.listProducts =storeProduct.getProduct();

   $scope.sum = price;


  });