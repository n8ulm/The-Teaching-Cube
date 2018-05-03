angular.module('teaching-cube', [])
.controller('TeachingCubeController', function($scope, $http) {
    $scope.answerCorrect = false;
	$scope.getLesson=function(lessonID){
		$scope.lessonID = lessonID;
		$http.get('https://teaching-cube.herokuapp.com/teaching-cube/lesson?lessonID='+$scope.lessonID).
			then(function(response) {
				$scope.lesson = response.data;
			});
	}
	
	$scope.checkAnswer = function() {
		$scope.answerCorrect = ($scope.userAnswer === $scope.lesson.lessonAnswer);
		
	}
	
	$scope.submitLesson=function(){
		$http.get('192.168.2.4:8080/' +$scope.lessonID).
			then(function(response) {
				//TODO-
			});
	}	
});