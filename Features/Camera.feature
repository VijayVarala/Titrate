Feature: camera
		Scenario: Successfully add a new camera with all required details
    Given the user is on the Add Camera page
    When the user enters CamerName as "South"
    And user enters Serial Number as "Q2HV-96VV-VN9N"
    And user selects the model from dropdown
    And user enters url as "http://camera1-url.com"
    And user clicks Add button
    Then new camera should be added successfully
    And user should see the new camera listed on the Cameras page
    
    Scenario: Successfully Edit the Camera Details added
    Given the user is on the Edit Camera page
    When the user sees CameraName as South 
    Then change it as "South-West"
    
    Scenario: Successfully Delete the added Camera
    Given the user is on the Camera page
    Then click the Delete icon of the camera that is to be deleted
   
#Scenario: Successfully edit the camera details
#		Given the user is on the Edit Camera page
#		When
    
    
#		#Add Camera
  #	Scenario: Successfully add a new camera with all required details
    #Given the user is on the Add Camera page
    #When the user enters "South" into the "Camera Name" field
    #And the user enters "Q2HV-96VV-VN9N" into the "Serial Number" field
    #And the user selects "M32" from the "Models" dropdown
    #And the user enters "http://camera1-url.com" into the "URL" field
    #And the user see the "Active" checkbox checked
    #And the user clicks the "Add" button
    #Then the new camera should be added successfully
    #And the user should see the new camera listed on the Cameras page
    #
    #Edit Camera
    #Scenario: Successfully edit an existing camera's details
    #Given the user is on the Cameras page
    #And the user selects the camera with name "South" to edit
    #When the user updates the "Camera Name" field to "South-East"
    #And the user updates the "Serial Number" field to "Q2HV-98VV-VN9N"
    #And the user selects "MV21/MV71" from the "Models" dropdown
    #And the user updates the "URL" field to "http://camera1-updated-url.com"
    #And the user clicks the "Save" button
    #Then the camera details should be updated successfully
    #And the user should see the updated camera details on the Cameras page
#
#		#Delete Camera
  #	Scenario: Successfully delete an existing camera
    #Given the user is on the Cameras page
    #And the user selects the camera with name "South-East" to delete
    #When the user clicks the "Delete" button
    #And the user confirms the deletion in the confirmation dialog
    #Then the camera should be deleted successfully
    #And the user should no longer see the camera with name "South-East" on the Cameras page