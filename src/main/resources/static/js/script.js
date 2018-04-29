angular.module('teaching-cube', [])
.controller('TeachingCubeController', function($scope, $http) {
    $scope.answerCorrect = false;
	$scope.getLesson=function(lessonID){
		$scope.lessonID = lessonID;
		$http.get('http://localhost:8080/teaching-cube/lesson?lessonID='+$scope.lessonID).
			then(function(response) {
				$scope.lesson = response.data;
			});
	}
	
	$scope.checkAnswer = function(answer) {
		alert($scope.lesson.lessonAnswer);
		$scope.answerCorrect = (answer == $scope.lesson.lessonAnswer);
	}
	
});